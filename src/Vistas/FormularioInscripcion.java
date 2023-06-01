package Vistas;

import Controlador.AlumnoData;
import Controlador.Conexion;
import Controlador.InscripcionData;
import Controlador.MateriaData;
import Modelo.Alumno;
import Modelo.Inscripcion;
import Modelo.Materia;
import java.util.ArrayList;
import java.util.List;

import javax.swing.table.DefaultTableModel;

public class FormularioInscripcion extends javax.swing.JInternalFrame {

    private ArrayList<Inscripcion> listaI;
    private ArrayList<Materia> listaM;
    private ArrayList<Alumno> listaA;

    private InscripcionData insData;
    private MateriaData matData;
    private AlumnoData alumData;

    private DefaultTableModel modelo;

    public FormularioInscripcion(AlumnoData alumData, MateriaData matData, InscripcionData insData) {
        initComponents();
        this.alumData = alumData;
        this.matData = matData;
        this.insData = insData;
        listaA = (ArrayList<Alumno>) alumData.listarAlumnos();
        modelo = new DefaultTableModel();

        cargaAlumnos();
        armarCabeceraTabla();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblFormInscripcion = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        lblSelecAlum = new javax.swing.JLabel();
        comBoxAlumno = new javax.swing.JComboBox<>();
        lblListaAlumno = new javax.swing.JLabel();
        radBtnMatInscriptas = new javax.swing.JRadioButton();
        radBtnMatNoInscriptas = new javax.swing.JRadioButton();
        btnSalir = new javax.swing.JButton();
        btnAnularInscribir = new javax.swing.JButton();
        btnInscribir = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaMatInscripcion = new javax.swing.JTable();

        setTitle("Formulario de Inscripcion");
        setPreferredSize(new java.awt.Dimension(460, 460));

        lblFormInscripcion.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblFormInscripcion.setText("Formulario de Inscripcion");

        lblSelecAlum.setText("Seleccione un alumno:");

        comBoxAlumno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comBoxAlumnoActionPerformed(evt);
            }
        });

        lblListaAlumno.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblListaAlumno.setText("Listado de Materias");

        radBtnMatInscriptas.setText("Materias Inscriptas");
        radBtnMatInscriptas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radBtnMatInscriptasActionPerformed(evt);
            }
        });

        radBtnMatNoInscriptas.setText("Materias no inscriptas");
        radBtnMatNoInscriptas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radBtnMatNoInscriptasActionPerformed(evt);
            }
        });

        btnSalir.setText("Salir");
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });

        btnAnularInscribir.setBackground(new java.awt.Color(250, 0, 0));
        btnAnularInscribir.setFont(new java.awt.Font("Ebrima", 1, 14)); // NOI18N
        btnAnularInscribir.setText("Anular Inscripcion");
        btnAnularInscribir.setEnabled(false);
        btnAnularInscribir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAnularInscribirActionPerformed(evt);
            }
        });

        btnInscribir.setBackground(new java.awt.Color(0, 225, 0));
        btnInscribir.setFont(new java.awt.Font("Ebrima", 1, 14)); // NOI18N
        btnInscribir.setText("Inscribir");
        btnInscribir.setEnabled(false);
        btnInscribir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInscribirActionPerformed(evt);
            }
        });

        tablaMatInscripcion.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(tablaMatInscripcion);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jSeparator1)
                        .addGap(38, 38, 38))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(127, 127, 127)
                                .addComponent(lblListaAlumno))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(135, 135, 135)
                                .addComponent(lblFormInscripcion)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(34, 34, 34)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(lblSelecAlum)
                                        .addGap(18, 18, 18)
                                        .addComponent(comBoxAlumno, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(radBtnMatInscriptas)
                                        .addGap(46, 46, 46)
                                        .addComponent(radBtnMatNoInscriptas)
                                        .addGap(0, 62, Short.MAX_VALUE))
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(btnInscribir)
                                .addGap(41, 41, 41)
                                .addComponent(btnAnularInscribir)
                                .addGap(47, 47, 47)
                                .addComponent(btnSalir)))
                        .addGap(19, 19, 19))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblFormInscripcion)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblSelecAlum)
                    .addComponent(comBoxAlumno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(lblListaAlumno)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(radBtnMatInscriptas)
                    .addComponent(radBtnMatNoInscriptas))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 81, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSalir)
                    .addComponent(btnAnularInscribir)
                    .addComponent(btnInscribir))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        dispose();
    }//GEN-LAST:event_btnSalirActionPerformed

    private void radBtnMatNoInscriptasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radBtnMatNoInscriptasActionPerformed
        borrarFilaTabla();
        radBtnMatInscriptas.setSelected(false);
        cargaDatosNoInscriptas();
        btnAnularInscribir.setEnabled(false);
        btnInscribir.setEnabled(true);
    }//GEN-LAST:event_radBtnMatNoInscriptasActionPerformed

    private void radBtnMatInscriptasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radBtnMatInscriptasActionPerformed
        borrarFilaTabla();
        radBtnMatNoInscriptas.setSelected(false);
        cargaDatosInscriptas();
        btnAnularInscribir.setEnabled(true);
        btnInscribir.setEnabled(false);
    }//GEN-LAST:event_radBtnMatInscriptasActionPerformed

    private void btnInscribirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInscribirActionPerformed

        int filaSeleccionada = tablaMatInscripcion.getSelectedRow();
        if (filaSeleccionada != -1) {
            Alumno a = (Alumno) comBoxAlumno.getSelectedItem();

            int idMateria = (Integer) modelo.getValueAt(filaSeleccionada, 0);
            String nombreMateria = (String) modelo.getValueAt(filaSeleccionada, 1);
            int anio = (Integer) modelo.getValueAt(filaSeleccionada, 2);
            Materia m = new Materia(idMateria, nombreMateria, anio, true);

            Inscripcion I = new Inscripcion(a, m, 0);

            insData.inscribir(I);

            borrarFilaTabla();
        }
    }//GEN-LAST:event_btnInscribirActionPerformed

    private void btnAnularInscribirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAnularInscribirActionPerformed

        int idAlumno = ((Alumno) comBoxAlumno.getSelectedItem()).getIdAlumno();
        int idMateria = (int) tablaMatInscripcion.getValueAt((int) tablaMatInscripcion.getSelectedRow(), 0);

        insData.borrarInscripcionMateriaAlumno(idAlumno, idMateria);

        borrarFilaTabla();
        cargaDatosInscriptas();
    }//GEN-LAST:event_btnAnularInscribirActionPerformed

    private void comBoxAlumnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comBoxAlumnoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_comBoxAlumnoActionPerformed

    private void cargaAlumnos() { // Carga al combo box
        for (Alumno item : listaA) {
            comBoxAlumno.addItem(item);
        }
    }

    private void armarCabeceraTabla() {
        ArrayList<Object> filaCabecera = new ArrayList<>();
        filaCabecera.add("ID");
        filaCabecera.add("Nombre");
        filaCabecera.add("Año");
        for (Object it : filaCabecera) {
            modelo.addColumn(it);
        }
        tablaMatInscripcion.setModel(modelo);
    }

    private void borrarFilaTabla() {
        int indice = modelo.getRowCount() - 1;

        for (int i = indice; i >= 0; i--) {
            modelo.removeRow(i);
        }
    }

    private void cargaDatosNoInscriptas() {
        //borrarFilasTabla();
        Alumno selec = (Alumno) comBoxAlumno.getSelectedItem();
        listaM = (ArrayList) insData.obtenerMateriasNOCursadas(selec.getIdAlumno());
        for (Materia m : listaM) {
            
                modelo.addRow(new Object[]{m.getIdMateria(), m.getNombre(), m.getAnioMateria()});
            

        }
    }

    private void cargaDatosInscriptas() {
        //borrarFilasTabla();
        Alumno selec = (Alumno) comBoxAlumno.getSelectedItem();
        List<Materia> lista = (ArrayList) insData.obtenerMateriasCursadas(selec.getIdAlumno());
        for (Materia m : lista) {
            modelo.addRow(new Object[]{m.getIdMateria(), m.getNombre(), m.getAnioMateria()});
        }
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAnularInscribir;
    private javax.swing.JButton btnInscribir;
    private javax.swing.JButton btnSalir;
    private javax.swing.JComboBox<Alumno> comBoxAlumno;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel lblFormInscripcion;
    private javax.swing.JLabel lblListaAlumno;
    private javax.swing.JLabel lblSelecAlum;
    private javax.swing.JRadioButton radBtnMatInscriptas;
    private javax.swing.JRadioButton radBtnMatNoInscriptas;
    private javax.swing.JTable tablaMatInscripcion;
    // End of variables declaration//GEN-END:variables
}
