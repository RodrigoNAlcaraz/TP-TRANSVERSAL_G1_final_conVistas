package Vistas;

import Controlador.InscripcionData;
import Controlador.MateriaData;
import Modelo.Inscripcion;
import Modelo.Materia;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

public class FormularioAlumnosPorMateria extends javax.swing.JInternalFrame {

    private DefaultTableModel modelo;
    private ArrayList<Materia> listaMat;
    private ArrayList<Inscripcion> listaI;
    private InscripcionData insData;
    private MateriaData matData;

    public FormularioAlumnosPorMateria(MateriaData matData, InscripcionData insData) {
        initComponents();
        this.matData = matData;
        this.insData = insData;
        modelo = new DefaultTableModel();
        listaMat = (ArrayList<Materia>) matData.listarMaterias();

        cargaMateriasCBox();
        armarCabeceraTabla();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblFormCargarNotas = new javax.swing.JLabel();
        lblSelecAlum = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        comBoxMateria = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaCarNotas = new javax.swing.JTable();
        btnSalir = new javax.swing.JButton();
        btnBuscar = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Alumnos por Materia");

        lblFormCargarNotas.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblFormCargarNotas.setText("Listado de Alumnos por Materia");

        lblSelecAlum.setText("Seleccione una materia:");

        comBoxMateria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comBoxMateriaActionPerformed(evt);
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
                        .addGap(324, 324, 324)
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
                        .addComponent(comBoxMateria, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
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
                    .addComponent(comBoxMateria, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBuscar))
                .addGap(24, 24, 24)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnSalir)
                .addContainerGap(59, Short.MAX_VALUE))
        );

        getAccessibleContext().setAccessibleName("Alumnos por Materia");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        dispose();
    }//GEN-LAST:event_btnSalirActionPerformed

    private void comBoxMateriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comBoxMateriaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_comBoxMateriaActionPerformed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        borrarFilaTabla();
        llenarTabla();

    }//GEN-LAST:event_btnBuscarActionPerformed
    private void armarCabeceraTabla() {
        ArrayList<Object> filaCabecera = new ArrayList<>();
        filaCabecera.add("ID");
        filaCabecera.add("Apellido");
        filaCabecera.add("Nombre");
        filaCabecera.add("Nota");
        for (Object it : filaCabecera) {
            modelo.addColumn(it);
        }
        tablaCarNotas.setModel(modelo);
    }

    private void cargaMateriasCBox() {
        for (Materia item1 : listaMat) {
            comBoxMateria.addItem(item1);
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
        Materia selec = (Materia) comBoxMateria.getSelectedItem();

        this.listaI = (ArrayList<Inscripcion>) insData.obtenerAlumPorMat(selec.getIdMateria());

        for (Inscripcion i : listaI) {
            modelo.addRow(new Object[]{i.getIdAlumno(), i.getAlumno().getApellido(), i.getAlumno().getNombre(), i.getNota()});
        }

    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnSalir;
    private javax.swing.JComboBox<Materia> comBoxMateria;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel lblFormCargarNotas;
    private javax.swing.JLabel lblSelecAlum;
    private javax.swing.JTable tablaCarNotas;
    // End of variables declaration//GEN-END:variables
}
