package Controlador;

import Modelo.Alumno;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class AlumnoData {

    private Connection con = null;

    public AlumnoData(Conexion conexion) {
        try {
           con = conexion.getConexion(); 
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error de conexion a la base de datos"+e.getMessage());
        }
            
             
    }

    public void guardarAlumno(Alumno alumno) {

        String sql = "INSERT INTO alumno (dni, apellido, nombre, fechaNac, activo) VALUES (?, ?, ?, ?, ?)";
        try {
            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            
            ps.setInt(1, alumno.getDni());
            ps.setString(2, alumno.getApellido());
            ps.setString(3, alumno.getNombre());
            ps.setDate(4, Date.valueOf(alumno.getFechaNac()));//localDate a Date
            ps.setInt(5, alumno.isActivo() ? 1 : 0); // if reducido
            ps.executeUpdate();
            ResultSet rs = ps.getGeneratedKeys();
            if (rs.next()) {
                alumno.setIdAlumno(rs.getInt(1));
                JOptionPane.showMessageDialog(null, "Alumno añadido con exito.");
            } else {
                JOptionPane.showMessageDialog(null, "El alumno no fue añadido.");
            }

            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "No se pudo añadir el alumno."+ex.getMessage());
        }

    }

    public Alumno buscarAlumno(int id) {
        Alumno alumno = new Alumno();
        String sql = "SELECT * FROM alumno WHERE idAlumno=? AND activo = 1";
        
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                alumno.setIdAlumno(id);
                alumno.setDni(rs.getInt("dni"));
                alumno.setApellido(rs.getString("apellido"));
                alumno.setNombre(rs.getString("nombre"));
                alumno.setFechaNac(rs.getDate("fechaNac").toLocalDate());
                //alumno.setActivo(rs.getBoolean("activo"));

                
            } else {
                JOptionPane.showMessageDialog(null, "No hay nadie con ese id.");
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "No se pudo buscar el alumno por problemas de conexion."+ex.getMessage());
        }

        return alumno;
    }

    public Alumno modificarAlumno(int id, Alumno alumno) {

        String sql = "UPDATE alumno SET dni = ?, apellido = ?, nombre = ?, fechaNac = ? WHERE  idAlumno = ? AND activo = 1";
        PreparedStatement ps = null;

        try {
            ps = con.prepareStatement(sql);
            ps.setInt(1, alumno.getDni());
            ps.setString(2, alumno.getApellido());
            ps.setString(3, alumno.getNombre());
            ps.setDate(4, Date.valueOf(alumno.getFechaNac()));
            ps.setInt(5, id);
            int exito = ps.executeUpdate();
            
            if (exito == 1) {
                JOptionPane.showMessageDialog(null, "Modificado Exitosamente.");
            } else {
                JOptionPane.showMessageDialog(null, "El alumno no se encuentra activo");
            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "No se pudo modificar el alumno."+ex.getMessage());
        }
        return alumno;
    }

    public List<Alumno> listarAlumnos() {

        List<Alumno> alumnos = new ArrayList<>();
        try {
            String sql = "SELECT * FROM alumno WHERE activo = 1 ";
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Alumno alumno = new Alumno();
                
                alumno.setIdAlumno(rs.getInt(1));
                alumno.setDni(rs.getInt(2));
                alumno.setApellido(rs.getString(3));
                alumno.setNombre(rs.getString(4));
                alumno.setFechaNac(rs.getDate(5).toLocalDate());
                alumno.setActivo(rs.getBoolean(6));
                alumnos.add(alumno);
            }
            ps.close();
           // JOptionPane.showMessageDialog(null, "Lista devuelta con exito.");

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, " Error en la busqueda."+ex.getMessage());
        }
        return alumnos;
    }

    public void eliminarAlumno(int id) {

        try {
            String sql = "UPDATE alumno SET activo = 0 WHERE idAlumno = ? ";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            ps.executeUpdate();
            ps.close();
            JOptionPane.showMessageDialog(null, " Se eliminó el alumno.");

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, " No se pudo eliminar el alumno."+e.getMessage());
        }
    }

    public void activarAlumno(int id) {

        try {
            String sql = "UPDATE alumno SET activo = 1 WHERE idAlumno = ? ";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            ps.executeUpdate();
            ps.close();
            JOptionPane.showMessageDialog(null, " Se activo el alumno.");

        } catch (SQLException e) {

            JOptionPane.showMessageDialog(null, " No se pudo activar el alumno."+e.getMessage());
        }
    }

}
