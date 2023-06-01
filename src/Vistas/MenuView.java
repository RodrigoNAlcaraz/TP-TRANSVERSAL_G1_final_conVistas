package Vistas;

import Controlador.AlumnoData;
import Controlador.Conexion;
import Controlador.InscripcionData;
import Controlador.MateriaData;
import java.awt.Color;

/**
 *
 * @author Anto
 */
public class MenuView extends javax.swing.JFrame {

    private Conexion con = new Conexion();
    private AlumnoData alumData = new AlumnoData(con);
    private MateriaData matData = new MateriaData(con);
    private InscripcionData insData = new InscripcionData(con);

    /**
     * Creates new form MenuView
     */
    public MenuView() {
        initComponents();
        this.setLocationRelativeTo(null);
        //this.setSize(500, 520);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        escritorio = new javax.swing.JDesktopPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        menuAlumno = new javax.swing.JMenu();
        menuItmAlumnos = new javax.swing.JMenuItem();
        menuMateria = new javax.swing.JMenu();
        menuItmMaterias = new javax.swing.JMenuItem();
        menuInscripcion = new javax.swing.JMenu();
        menuItmInscripciones = new javax.swing.JMenuItem();
        menuNotas = new javax.swing.JMenu();
        menuItmNotas = new javax.swing.JMenuItem();
        menuAlumPorMateria = new javax.swing.JMenu();
        menuItmAlumPMateria = new javax.swing.JMenuItem();
        menuItmSalir = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout escritorioLayout = new javax.swing.GroupLayout(escritorio);
        escritorio.setLayout(escritorioLayout);
        escritorioLayout.setHorizontalGroup(
            escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1120, Short.MAX_VALUE)
        );
        escritorioLayout.setVerticalGroup(
            escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 622, Short.MAX_VALUE)
        );

        menuAlumno.setText("Alumno");

        menuItmAlumnos.setText("Formulario de Alumno");
        menuItmAlumnos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItmAlumnosActionPerformed(evt);
            }
        });
        menuAlumno.add(menuItmAlumnos);

        jMenuBar1.add(menuAlumno);

        menuMateria.setText("Materia");

        menuItmMaterias.setText("Formulario de Materia");
        menuItmMaterias.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItmMateriasActionPerformed(evt);
            }
        });
        menuMateria.add(menuItmMaterias);

        jMenuBar1.add(menuMateria);

        menuInscripcion.setText("Inscripcion");

        menuItmInscripciones.setText("Manejo de Inscripciones");
        menuItmInscripciones.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItmInscripcionesActionPerformed(evt);
            }
        });
        menuInscripcion.add(menuItmInscripciones);

        jMenuBar1.add(menuInscripcion);

        menuNotas.setText("Carga de notas");

        menuItmNotas.setText("Manipulacion de notas");
        menuItmNotas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItmNotasActionPerformed(evt);
            }
        });
        menuNotas.add(menuItmNotas);

        jMenuBar1.add(menuNotas);

        menuAlumPorMateria.setText("Alumnos por Materia");

        menuItmAlumPMateria.setText("Obtener Alumnos por Materia");
        menuItmAlumPMateria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItmAlumPMateriaActionPerformed(evt);
            }
        });
        menuAlumPorMateria.add(menuItmAlumPMateria);

        jMenuBar1.add(menuAlumPorMateria);

        menuItmSalir.setText("Salir");
        menuItmSalir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                menuItmSalirMouseClicked(evt);
            }
        });
        jMenuBar1.add(menuItmSalir);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(escritorio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(escritorio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void menuItmAlumnosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItmAlumnosActionPerformed
        // TODO add your handling code here:
        escritorio.removeAll();
        escritorio.repaint();
        FormularioAlumnoView alumno = new FormularioAlumnoView(alumData);
        alumno.setVisible(true);
        // alumno.getContentPane().setBackground(new Color(68, 167, 132));
        escritorio.add(alumno);
    }//GEN-LAST:event_menuItmAlumnosActionPerformed

    private void menuItmSalirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuItmSalirMouseClicked
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_menuItmSalirMouseClicked

    private void menuItmNotasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItmNotasActionPerformed
        // TODO add your handling code here:
        escritorio.removeAll();
        escritorio.repaint();
        FormularioNotas notas = new FormularioNotas(alumData, insData);
        notas.setVisible(true);
        notas.getContentPane().setBackground(new Color(68, 167, 132));
        escritorio.add(notas);
    }//GEN-LAST:event_menuItmNotasActionPerformed

    private void menuItmMateriasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItmMateriasActionPerformed
        // TODO add your handling code here:
        escritorio.removeAll();
        escritorio.repaint();
        FormularioMateria materia = new FormularioMateria(matData);
        materia.setVisible(true);
        materia.getContentPane().setBackground(new Color(68, 167, 132));
        escritorio.add(materia);
    }//GEN-LAST:event_menuItmMateriasActionPerformed

    private void menuItmInscripcionesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItmInscripcionesActionPerformed
        // TODO add your handling code here:
        escritorio.removeAll();
        escritorio.repaint();
        FormularioInscripcion ins = new FormularioInscripcion(alumData, matData, insData);
        ins.setVisible(true);
        ins.getContentPane().setBackground(new Color(68, 167, 132));
        escritorio.add(ins);
    }//GEN-LAST:event_menuItmInscripcionesActionPerformed

    private void menuItmAlumPMateriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItmAlumPMateriaActionPerformed
        // TODO add your handling code here:
        escritorio.removeAll();
        escritorio.repaint();
        FormularioAlumnosPorMateria notas = new FormularioAlumnosPorMateria(matData, insData);
        notas.setVisible(true);
        notas.getContentPane().setBackground(new Color(68, 167, 132));
        escritorio.add(notas);

    }//GEN-LAST:event_menuItmAlumPMateriaActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MenuView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane escritorio;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenu menuAlumPorMateria;
    private javax.swing.JMenu menuAlumno;
    private javax.swing.JMenu menuInscripcion;
    private javax.swing.JMenuItem menuItmAlumPMateria;
    private javax.swing.JMenuItem menuItmAlumnos;
    private javax.swing.JMenuItem menuItmInscripciones;
    private javax.swing.JMenuItem menuItmMaterias;
    private javax.swing.JMenuItem menuItmNotas;
    private javax.swing.JMenu menuItmSalir;
    private javax.swing.JMenu menuMateria;
    private javax.swing.JMenu menuNotas;
    // End of variables declaration//GEN-END:variables
}
