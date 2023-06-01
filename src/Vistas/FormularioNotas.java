package Vistas;

import Controlador.AlumnoData;
import Controlador.InscripcionData;
import Modelo.Alumno;
import Modelo.Inscripcion;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class FormularioNotas extends javax.swing.JInternalFrame {

    private DefaultTableModel modelo;
    private ArrayList<Alumno> listaA;
    private ArrayList<Inscripcion> listaI;
    private InscripcionData insData;
    private AlumnoData alumData;

    public FormularioNotas(AlumnoData alumData, InscripcionData insData) {
        initComponents();
        this.alumData = alumData;
        this.insData = insData;
        modelo = new DefaultTableModel();
        listaA = (ArrayList<Alumno>) alumData.listarAlumnos();

        cargaAlumnosCBox();
        armarCabeceraTabla();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblFormCargarNotas = new javax.swing.JLabel();
        lblSelecAlum = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        comBoxAlumno = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaCarNotas = new javax.swing.JTable();
        btnGuardar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();
        btnBuscar = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Carga de notas");

        lblFormCargarNotas.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblFormCargarNotas.setText("Carga de notas");

        lblSelecAlum.setText("Seleccione un alumno:");

        comBoxAlumno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comBoxAlumnoActionPerformed(evt);
            }
        });

        tablaCarNotas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3"
            }
        ));
        jScrollPane1.setViewportView(tablaCarNotas);

        btnGuardar.setText("Guardar");
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });

        btnCancelar.setText("Cancelar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        btnSalir.setText("Salir");
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });

        btnBuscar.setText("Buscar");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(btnCancelar)
                        .addGap(18, 18, 18)
                        .addComponent(btnGuardar)
                        .addGap(122, 122, 122)
                        .addComponent(btnSalir))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(141, 141, 141)
                        .addComponent(lblFormCargarNotas))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 385, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 341, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lblSelecAlum)
                        .addGap(18, 18, 18)
                        .addComponent(comBoxAlumno, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(18, 18, 18)
                .addComponent(btnBuscar)
                .addContainerGap(46, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblFormCargarNotas)
                .addGap(5, 5, 5)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(3, 3, 3)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblSelecAlum)
                    .addComponent(comBoxAlumno, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBuscar))
                .addGap(24, 24, 24)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnGuardar)
                    .addComponent(btnCancelar)
                    .addComponent(btnSalir))
                .addContainerGap(59, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        dispose();
    }//GEN-LAST:event_btnSalirActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        borrarFilaTabla();
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed

        int con = 0;
        for (int i = 0; i < tablaCarNotas.getRowCount(); i++) {
            int idAlum = ((Alumno) comBoxAlumno.getSelectedItem()).getIdAlumno();
            int idMat = Integer.parseInt(tablaCarNotas.getValueAt(i, 0).toString());
            double nota = Double.parseDouble(tablaCarNotas.getValueAt(i, 2).toString());

            for (Inscripcion control : listaI) {

                if (control.getIdMateria() == idMat && control.getNota() != nota) {
                    insData.actualizarNota(idAlum, idMat, nota);
                    con++;
                }

            }

        }
        JOptionPane.showMessageDialog(null, "Las notas fueron actualizadas." + con);
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void comBoxAlumnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comBoxAlumnoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_comBoxAlumnoActionPerformed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        borrarFilaTabla();
        llenarTabla();

    }//GEN-LAST:event_btnBuscarActionPerformed
    private void armarCabeceraTabla() {
        ArrayList<Object> filaCabecera = new ArrayList<>();
        filaCabecera.add("ID");
        filaCabecera.add("Nombre");
        filaCabecera.add("Nota");
        for (Object it : filaCabecera) {
            modelo.addColumn(it);
        }
        tablaCarNotas.setModel(modelo);
    }

    private void cargaAlumnosCBox() {
        for (Alumno item : listaA) {
            comBoxAlumno.addItem(item);
        }
    }

    private void borrarFilaTabla() {
        int indice = modelo.getRowCount() - 1;

        for (int i = indice; i >= 0; i--) {
            modelo.removeRow(i);
        }
    }

    private void llenarTabla() {
        //borrarFilasTabla();
        Alumno selec = (Alumno) comBoxAlumno.getSelectedItem();
        this.listaI = (ArrayList<Inscripcion>) insData.obtenerMCursadasPorAlumno(selec.getIdAlumno());

        for (Inscripcion i : listaI) {
            modelo.addRow(new Object[]{i.getIdMateria(), i.getMateria().getNombre(), i.getNota()});
        }

    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnSalir;
    private javax.swing.JComboBox<Alumno> comBoxAlumno;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel lblFormCargarNotas;
    private javax.swing.JLabel lblSelecAlum;
    private javax.swing.JTable tablaCarNotas;
    // End of variables declaration//GEN-END:variables
}
