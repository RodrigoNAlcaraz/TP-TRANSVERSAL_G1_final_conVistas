package Controlador;

import Modelo.Materia;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class MateriaData {

    private Connection con = null;

    
    
    
    
    
    public MateriaData(Conexion conexion) {
        try {
            con = conexion.getConexion();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error de conexion."+e.getMessage());
        }
            
        }
    

    public void guardarMateria(Materia materia) {
        String sql = "INSERT INTO materia (nombre, añoMateria, activo) VALUES (?, ?, ?)";
        try {
            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);

            ps.setString(1, materia.getNombre());
            ps.setInt(2, materia.getAnioMateria());
            ps.setInt(3, materia.isActivo() ? 1 : 0); // if reducido
            ps.executeUpdate();
            ResultSet rs = ps.getGeneratedKeys();
            if (rs.next()) {
                materia.setIdMateria(rs.getInt(1));

                JOptionPane.showMessageDialog(null, "Materia agregada con exito.");
            } else {
                JOptionPane.showMessageDialog(null, "La materia no fue agregada.");
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "No se pudo agregar la materia."+ex.getMessage());
        }

    }

    public Materia buscarMateria(int id) {
        Materia materia = new Materia();
        String sql = "SELECT * FROM materia WHERE idMateria = ? AND activo= 1";
        PreparedStatement ps = null;
        try {
            ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                materia.setIdMateria(id);
                materia.setNombre(rs.getString("nombre"));
                materia.setAnioMateria(rs.getInt(3));
                materia.setActivo(rs.getBoolean(1));
            } else {
                JOptionPane.showMessageDialog(null, "La materia no fue encontrada en la base de datos.");
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "No se pudo buscar la materia en la base de datos."+ex.getMessage());
        }

        return materia;
    }

    public Materia modificarMateria(int id, Materia materia) {
        String sql = "UPDATE materia SET nombre = ?, añoMateria = ? WHERE  idMateria = ? AND activo = 1";
        PreparedStatement ps = null;

        try {
            ps = con.prepareStatement(sql);

            ps.setString(1, materia.getNombre());
            ps.setInt(2, materia.getAnioMateria());
            ps.setInt(3, id);

            ps.executeUpdate();

            JOptionPane.showMessageDialog(null, "Modificado con exito.");

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "No modificado."+ex.getMessage());
        }
        return materia;
    }

    public void eliminarMateria(int id) {

        try {
            String sql = "UPDATE materia SET activo = 0 WHERE idMateria = ? ";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            ps.executeUpdate();
            ps.close();
            JOptionPane.showMessageDialog(null, " Materia eliminada.");

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, " Materia no eliminada."+e.getMessage());
        }
    }

    public List<Materia> listarMaterias() {

        List<Materia> materias = new ArrayList<>();
        try {
            String sql = "SELECT * FROM materia WHERE activo = 1 ";
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Materia materia = new Materia();

                materia.setIdMateria(rs.getInt(1));
                materia.setNombre(rs.getString(2));
                materia.setActivo(rs.getBoolean(3));
                materias.add(materia);
            }
            ps.close();
            //JOptionPane.showMessageDialog(null, "Lista entregada con exito.");

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, " La lista no fue entregada."+ex.getMessage());
        }
        return materias;
    }

    public void activarMateria(int id) {

        try {
            String sql = "UPDATE materia SET activo = 1 WHERE idMateria = ? ";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            ps.executeUpdate();
            ps.close();
            JOptionPane.showMessageDialog(null, " Materia activada.");

        } catch (SQLException e) {

            JOptionPane.showMessageDialog(null, " No se pudo eliminar la materia."+e.getMessage());
        }
    }
}
