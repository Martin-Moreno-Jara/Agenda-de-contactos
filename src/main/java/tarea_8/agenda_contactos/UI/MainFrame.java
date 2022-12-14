/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package tarea_8.agenda_contactos.UI;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Vector;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import tarea_8.agenda_contactos.Data.Contacto;
import javax.swing.table.TableRowSorter;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.RowFilter;

/**
 *
 * @author usuario
 */
public class MainFrame extends javax.swing.JFrame implements Serializable {

    /**
     * Creates new form MainFrame
     */
    public MainFrame() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        main_panel = new javax.swing.JPanel();
        titulo_label = new javax.swing.JLabel();
        panel_contenido = new javax.swing.JPanel();
        panel_edicion = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        campo_nombre = new javax.swing.JTextField();
        campo_direccion = new javax.swing.JTextField();
        campo_apellido = new javax.swing.JTextField();
        campo_numero = new javax.swing.JTextField();
        campo_correo = new javax.swing.JTextField();
        boton_guardar = new javax.swing.JButton();
        boton_limpiar = new javax.swing.JButton();
        boton_actualizar = new javax.swing.JButton();
        panel_agenda = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        campo_buscar = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabla_contactos = new javax.swing.JTable();
        boton_editar = new javax.swing.JButton();
        boton_eliminar = new javax.swing.JButton();
        boton_buscar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        main_panel.setBackground(new java.awt.Color(204, 255, 204));
        main_panel.setMinimumSize(new java.awt.Dimension(919, 587));

        titulo_label.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        titulo_label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        titulo_label.setText("Agenda ");
        titulo_label.setAlignmentX(0.5F);

        panel_contenido.setBackground(new java.awt.Color(255, 255, 204));

        jLabel2.setText("Nombre");

        jLabel3.setText("Apellido");

        jLabel4.setText("N??mero");

        jLabel5.setText("Correo (opcional)");

        jLabel6.setText("Direcci??n (opcional)");

        campo_nombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campo_nombreActionPerformed(evt);
            }
        });

        campo_correo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campo_correoActionPerformed(evt);
            }
        });

        boton_guardar.setText("Crear contacto");
        boton_guardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_guardarActionPerformed(evt);
            }
        });

        boton_limpiar.setText("Limpiar");
        boton_limpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_limpiarActionPerformed(evt);
            }
        });

        boton_actualizar.setText("Actualizar");
        boton_actualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_actualizarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panel_edicionLayout = new javax.swing.GroupLayout(panel_edicion);
        panel_edicion.setLayout(panel_edicionLayout);
        panel_edicionLayout.setHorizontalGroup(
            panel_edicionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_edicionLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panel_edicionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(panel_edicionLayout.createSequentialGroup()
                        .addGroup(panel_edicionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panel_edicionLayout.createSequentialGroup()
                                .addGroup(panel_edicionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(72, 72, 72)
                                .addGroup(panel_edicionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(campo_nombre, javax.swing.GroupLayout.DEFAULT_SIZE, 219, Short.MAX_VALUE)
                                    .addComponent(campo_apellido)
                                    .addComponent(campo_numero)))
                            .addGroup(panel_edicionLayout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addGap(34, 34, 34)
                                .addComponent(campo_correo, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(panel_edicionLayout.createSequentialGroup()
                                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(campo_direccion, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(33, Short.MAX_VALUE))
                    .addGroup(panel_edicionLayout.createSequentialGroup()
                        .addComponent(boton_limpiar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(boton_guardar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(boton_actualizar)
                        .addGap(23, 23, 23))))
        );
        panel_edicionLayout.setVerticalGroup(
            panel_edicionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_edicionLayout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addGroup(panel_edicionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(campo_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 42, Short.MAX_VALUE)
                .addGroup(panel_edicionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(campo_apellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 42, Short.MAX_VALUE)
                .addGroup(panel_edicionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(campo_numero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 42, Short.MAX_VALUE)
                .addGroup(panel_edicionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(campo_correo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 42, Short.MAX_VALUE)
                .addGroup(panel_edicionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(campo_direccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 91, Short.MAX_VALUE)
                .addGroup(panel_edicionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(boton_guardar)
                    .addComponent(boton_limpiar)
                    .addComponent(boton_actualizar))
                .addGap(59, 59, 59))
        );

        jLabel7.setText("Buscar");

        campo_buscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campo_buscarActionPerformed(evt);
            }
        });
        campo_buscar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                campo_buscarKeyTyped(evt);
            }
        });

        tabla_contactos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nombre", "Apellido", "N??mero", "Correo", "Direcci??n"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tabla_contactos);

        boton_editar.setText("Editar");
        boton_editar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_editarActionPerformed(evt);
            }
        });

        boton_eliminar.setText("Eliminar");
        boton_eliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_eliminarActionPerformed(evt);
            }
        });

        boton_buscar.setText("Buscar");
        boton_buscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_buscarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panel_agendaLayout = new javax.swing.GroupLayout(panel_agenda);
        panel_agenda.setLayout(panel_agendaLayout);
        panel_agendaLayout.setHorizontalGroup(
            panel_agendaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_agendaLayout.createSequentialGroup()
                .addContainerGap(9, Short.MAX_VALUE)
                .addGroup(panel_agendaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(panel_agendaLayout.createSequentialGroup()
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(campo_buscar, javax.swing.GroupLayout.PREFERRED_SIZE, 335, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(boton_buscar)
                        .addContainerGap())
                    .addGroup(panel_agendaLayout.createSequentialGroup()
                        .addComponent(boton_eliminar)
                        .addGap(18, 18, 18)
                        .addComponent(boton_editar, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(32, 32, 32))))
            .addGroup(panel_agendaLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1)
                .addContainerGap())
        );
        panel_agendaLayout.setVerticalGroup(
            panel_agendaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_agendaLayout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(panel_agendaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(campo_buscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(boton_buscar))
                .addGap(25, 25, 25)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 340, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panel_agendaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(boton_eliminar)
                    .addComponent(boton_editar))
                .addGap(35, 35, 35))
        );

        javax.swing.GroupLayout panel_contenidoLayout = new javax.swing.GroupLayout(panel_contenido);
        panel_contenido.setLayout(panel_contenidoLayout);
        panel_contenidoLayout.setHorizontalGroup(
            panel_contenidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_contenidoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panel_edicion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addComponent(panel_agenda, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        panel_contenidoLayout.setVerticalGroup(
            panel_contenidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_contenidoLayout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(panel_contenidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panel_edicion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panel_agenda, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        javax.swing.GroupLayout main_panelLayout = new javax.swing.GroupLayout(main_panel);
        main_panel.setLayout(main_panelLayout);
        main_panelLayout.setHorizontalGroup(
            main_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(main_panelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(titulo_label, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addComponent(panel_contenido, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        main_panelLayout.setVerticalGroup(
            main_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(main_panelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(titulo_label, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panel_contenido, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        titulo_label.getAccessibleContext().setAccessibleDescription("");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(main_panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(main_panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void boton_editarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_editarActionPerformed
        int row = tabla_contactos.getSelectedRow();
        if(evt.getSource()==boton_editar){
             if(row<0){
             JOptionPane.showMessageDialog(null,"No se ha seleccionado ning??n contacto","No seleccionado",JOptionPane.ERROR_MESSAGE);
        }
             else{
            DefaultTableModel modelo = (DefaultTableModel) tabla_contactos.getModel(); 
            String editar_nombre = (String) modelo.getValueAt(row, 0);
            String editar_apellido = (String) modelo.getValueAt(row, 1);
            String editar_numero = (String) modelo.getValueAt(row, 2);
            String editar_correo = (String) modelo.getValueAt(row, 3);
            String editar_direccion = (String) modelo.getValueAt(row, 4);
            
            campo_nombre.setText(editar_nombre);
            campo_apellido.setText(editar_apellido);
            campo_numero.setText(editar_numero);
            campo_correo.setText(editar_correo);
            campo_direccion.setText(editar_direccion);
             }
        }
    }//GEN-LAST:event_boton_editarActionPerformed

    private void campo_buscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campo_buscarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campo_buscarActionPerformed

    private void boton_limpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_limpiarActionPerformed
        // TODO add your handling code here:
        if(evt.getSource()==boton_limpiar){
            campo_nombre.setText("");
            campo_apellido.setText("");
            campo_numero.setText("");
            campo_correo.setText("");
            campo_direccion.setText("");

        }
    }//GEN-LAST:event_boton_limpiarActionPerformed

    private void boton_guardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_guardarActionPerformed
        String nombre = campo_nombre.getText();
        String apellido = campo_apellido.getText();
        String numero = campo_numero.getText();
        String correo = campo_correo.getText();
        String direccion = campo_direccion.getText();
        
       // Contacto nuevo_contacto = new Contacto(nombre,apellido,numero,correo,direccion);
        
        if(nombre.isEmpty()|| apellido.isEmpty() || numero.isEmpty() ){
            JOptionPane.showMessageDialog(null,"Debe ingresar al menos nombre, apellido y n??mero","Datos insuficientes",JOptionPane.ERROR_MESSAGE);
        }
        else{
            DefaultTableModel modelo = (DefaultTableModel) tabla_contactos.getModel();
            if("".equals(correo)){
                correo="-";
            }
            if("".equals(direccion)){
                direccion="-";
            }
           // modelo.addRow(new Object []{nuevo_contacto.getNombre(),nuevo_contacto.getApellido(),nuevo_contacto.getNumero_telefonico(),
           //     nuevo_contacto.getCorreo(),nuevo_contacto.getDireccion_domicilio()});
            modelo.addRow(new Object []{nombre,apellido,numero,correo,direccion});
            
            campo_nombre.setText("");
            campo_apellido.setText("");
            campo_numero.setText("");
            campo_correo.setText("");
            campo_direccion.setText("");
        }
        
    }//GEN-LAST:event_boton_guardarActionPerformed

    private void campo_correoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campo_correoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campo_correoActionPerformed

    private void campo_nombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campo_nombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campo_nombreActionPerformed

    private void boton_eliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_eliminarActionPerformed
        int row = tabla_contactos.getSelectedRow();
        if(row<0){
             JOptionPane.showMessageDialog(null,"No se ha seleccionado ning??n contacto","No seleccionado",JOptionPane.ERROR_MESSAGE);
        }
        else{
            DefaultTableModel modelo = (DefaultTableModel) tabla_contactos.getModel();            
            if(evt.getSource()==boton_eliminar){
                ventana_confirmacion ventana = new ventana_confirmacion(this,true);
                ventana.setVisible(true);
                if(ventana.getVerificador()==true){
                    modelo.removeRow(row);
                }

            }

        }
    }//GEN-LAST:event_boton_eliminarActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
                DefaultTableModel model = (DefaultTableModel) tabla_contactos.getModel();
        Vector<Vector> tableData = model.getDataVector();
        
        //Saving of object in a file
        try {
            FileOutputStream file = new FileOutputStream("file.bin");
            ObjectOutputStream output = new ObjectOutputStream(file);
            
            // Method for serialization of object
            output.writeObject(tableData);

            output.close();
            file.close();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }//GEN-LAST:event_formWindowClosing

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
         try {
            // TODO add your handling code here:
            FileInputStream file = new FileInputStream("file.bin");
            ObjectInputStream input = new ObjectInputStream(file);
            // Method for deserialization of object
            Vector<Vector> tableData = (Vector<Vector>)input.readObject();
            
            input.close();
            file.close();
            
            
            DefaultTableModel model = (DefaultTableModel) tabla_contactos.getModel();
            for (int i = 0; i < tableData.size(); i++) {
                Vector row = tableData.get(i);
                model.addRow(new Object[]{row.get(0), row.get(1), row.get(2), row.get(3),row.get(4)});
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        
    }//GEN-LAST:event_formWindowOpened

    private void boton_actualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_actualizarActionPerformed
        String nombre = campo_nombre.getText();
        String apellido = campo_apellido.getText();
        String numero = campo_numero.getText();
        String correo = campo_correo.getText();
        String direccion = campo_direccion.getText();
        int row = tabla_contactos.getSelectedRow();
        DefaultTableModel modelo = (DefaultTableModel) tabla_contactos.getModel();

        if(nombre.isEmpty()|| apellido.isEmpty() || numero.isEmpty() ){
            JOptionPane.showMessageDialog(null,"Debe ingresar al menos nombre, apellido y n??mero","Datos insuficientes",JOptionPane.ERROR_MESSAGE);
        }
        else{
            modelo.setValueAt(nombre, row, 0);
            modelo.setValueAt(apellido, row, 1);
            modelo.setValueAt(numero, row, 2);
            modelo.setValueAt(correo, row, 3);
            modelo.setValueAt(direccion, row, 4);
            
        }
    }//GEN-LAST:event_boton_actualizarActionPerformed

    private void boton_buscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_buscarActionPerformed
    if(evt.getSource()==boton_buscar){
            campo_buscar.addKeyListener(new KeyAdapter(){
    @Override    
    public void keyReleased(final KeyEvent e){
            String cadena = campo_buscar.getText();
            campo_buscar.setText(cadena);
            repaint();
            filtro();
        }
    });
    }

    }//GEN-LAST:event_boton_buscarActionPerformed

    private void campo_buscarKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_campo_buscarKeyTyped
        trsfiltro = new TableRowSorter(tabla_contactos.getModel());
        tabla_contactos.setRowSorter(trsfiltro);
    }//GEN-LAST:event_campo_buscarKeyTyped

    public void filtro(){
        filtro = campo_buscar.getText().toLowerCase();
        trsfiltro.setRowFilter(RowFilter.regexFilter(campo_buscar.getText(), 0));
    }
    private TableRowSorter trsfiltro;
    String filtro;
    
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
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton boton_actualizar;
    private javax.swing.JButton boton_buscar;
    private javax.swing.JButton boton_editar;
    private javax.swing.JButton boton_eliminar;
    private javax.swing.JButton boton_guardar;
    private javax.swing.JButton boton_limpiar;
    private javax.swing.JTextField campo_apellido;
    private javax.swing.JTextField campo_buscar;
    private javax.swing.JTextField campo_correo;
    private javax.swing.JTextField campo_direccion;
    private javax.swing.JTextField campo_nombre;
    private javax.swing.JTextField campo_numero;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel main_panel;
    private javax.swing.JPanel panel_agenda;
    private javax.swing.JPanel panel_contenido;
    private javax.swing.JPanel panel_edicion;
    private javax.swing.JTable tabla_contactos;
    private javax.swing.JLabel titulo_label;
    // End of variables declaration//GEN-END:variables

}
