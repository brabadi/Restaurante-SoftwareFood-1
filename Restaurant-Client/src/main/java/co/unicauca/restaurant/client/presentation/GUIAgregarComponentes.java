
package co.unicauca.restaurant.client.presentation;

import co.unicauca.restaurant.client.access.ClientAccessSocket;
import co.unicauca.restaurant.client.access.IClientAccess;
import co.unicauca.restaurant.client.domain.ClientService;
import co.unicauca.restaurant.commons.domain.Component;
import co.unicauca.restaurant.commons.domain.ComponentType;
import javax.swing.JOptionPane;

/**
 *
 * @author juan jose
 */
public class GUIAgregarComponentes extends javax.swing.JFrame {

    /**
     * Creates new form GUIAgregarComponentes
     */
    public GUIAgregarComponentes() {
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

        PnlAgregarComponentes = new javax.swing.JPanel();
        LblTitulo = new javax.swing.JLabel();
        LblAplicacion = new javax.swing.JLabel();
        LblAgregarComponentes = new javax.swing.JLabel();
        LblId = new javax.swing.JLabel();
        LblNombre = new javax.swing.JLabel();
        LblTipo = new javax.swing.JLabel();
        txtId = new javax.swing.JTextField();
        txtNombre = new javax.swing.JTextField();
        CbxTipo = new javax.swing.JComboBox<>();
        BtnAgregarComponente = new javax.swing.JButton();
        BtnAtras = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        PnlAgregarComponentes.setBackground(new java.awt.Color(51, 153, 255));

        LblTitulo.setText("Software Food");

        LblAplicacion.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        LblAplicacion.setForeground(new java.awt.Color(255, 255, 255));
        LblAplicacion.setText("Aplicación Software Food");

        LblAgregarComponentes.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        LblAgregarComponentes.setText("Agregar Componentes Almuerzo Ejecutivo");

        LblId.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        LblId.setText("Id:");

        LblNombre.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        LblNombre.setText("Nombre:");

        LblTipo.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        LblTipo.setText("Tipo:");

        CbxTipo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "ENTRADA", "PRINCIPIO", "PROTEINA", "BEBIDA" }));

        BtnAgregarComponente.setText("Agregar Componente");
        BtnAgregarComponente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnAgregarComponenteActionPerformed(evt);
            }
        });

        BtnAtras.setText("Atrás");
        BtnAtras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnAtrasActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout PnlAgregarComponentesLayout = new javax.swing.GroupLayout(PnlAgregarComponentes);
        PnlAgregarComponentes.setLayout(PnlAgregarComponentesLayout);
        PnlAgregarComponentesLayout.setHorizontalGroup(
            PnlAgregarComponentesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PnlAgregarComponentesLayout.createSequentialGroup()
                .addComponent(LblTitulo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(BtnAtras)
                .addContainerGap())
            .addGroup(PnlAgregarComponentesLayout.createSequentialGroup()
                .addGroup(PnlAgregarComponentesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PnlAgregarComponentesLayout.createSequentialGroup()
                        .addGap(134, 134, 134)
                        .addComponent(LblAplicacion))
                    .addGroup(PnlAgregarComponentesLayout.createSequentialGroup()
                        .addGap(126, 126, 126)
                        .addComponent(LblAgregarComponentes))
                    .addGroup(PnlAgregarComponentesLayout.createSequentialGroup()
                        .addGap(69, 69, 69)
                        .addGroup(PnlAgregarComponentesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(LblNombre)
                            .addComponent(LblId)
                            .addComponent(LblTipo))
                        .addGap(18, 18, 18)
                        .addGroup(PnlAgregarComponentesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtId)
                            .addComponent(txtNombre)
                            .addComponent(CbxTipo, 0, 245, Short.MAX_VALUE))))
                .addContainerGap(120, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PnlAgregarComponentesLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(BtnAgregarComponente, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(175, 175, 175))
        );
        PnlAgregarComponentesLayout.setVerticalGroup(
            PnlAgregarComponentesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PnlAgregarComponentesLayout.createSequentialGroup()
                .addGroup(PnlAgregarComponentesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(CbxTipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(PnlAgregarComponentesLayout.createSequentialGroup()
                        .addGroup(PnlAgregarComponentesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(PnlAgregarComponentesLayout.createSequentialGroup()
                                .addComponent(LblTitulo)
                                .addGap(28, 28, 28))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, PnlAgregarComponentesLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(BtnAtras)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                        .addGroup(PnlAgregarComponentesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(PnlAgregarComponentesLayout.createSequentialGroup()
                                .addGroup(PnlAgregarComponentesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(PnlAgregarComponentesLayout.createSequentialGroup()
                                        .addComponent(LblAplicacion)
                                        .addGap(18, 18, 18)
                                        .addComponent(LblAgregarComponentes)
                                        .addGap(44, 44, 44)
                                        .addComponent(LblId))
                                    .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addComponent(LblNombre))
                            .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(LblTipo)))
                .addGap(18, 18, 18)
                .addComponent(BtnAgregarComponente, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(20, Short.MAX_VALUE))
        );

        getContentPane().add(PnlAgregarComponentes, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BtnAgregarComponenteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnAgregarComponenteActionPerformed

        // TODO add your handling code here:
        String id;
        String nombre;
        String tipo;
        
        id = txtId.getText();
        nombre = txtNombre.getText();
        tipo = CbxTipo.getSelectedItem().toString();
       
        addComponent(id, nombre, tipo);
        
        txtId.setText("");
        txtNombre.setText("");
        CbxTipo.setSelectedItem("Seleccione");
    }                                                    

    private void addComponent( String id, String nombre, String tipo){
        IClientAccess service = new ClientAccessSocket();
        ClientService cliente = new ClientService(service);
            
            Component component = new Component(id,nombre, ComponentType.valueOf(tipo));
                       
        try {
            String resultComponent = service.saveComponent(component);
            System.out.println(resultComponent);
            JOptionPane.showMessageDialog(null, "Componente con ID " + id + " Registrado");
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "El Componente Ingresado ya esta registrado" + e.getMessage());
        }
//      IClienteAccess service = Factory.getInstance().getClienteService();
//        clienteService servicioRestaurante = new clienteService(service);
//       
//        MenuEspecial menuEspecial = new MenuEspecial(366,1);
//        PlatoEspecial platoEspecial = new PlatoEspecial(1,menuEspecial.getId(),"Nombre","Descripcion",123);
//        try{
//            String platoE = servicioRestaurante.savePlatoEspecial(platoEspecial);
//            System.out.println(platoE);
//           
//        }catch(Exception ex) {
//                JOptionPane.showMessageDialog(null, "El plato ya esta registrado" + ex.getMessage());
//        }
    }//GEN-LAST:event_BtnAgregarComponenteActionPerformed

    private void BtnAtrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnAtrasActionPerformed
        setVisible(false);
        GUIOpcionesAdmin ins = new GUIOpcionesAdmin();
        ins.setVisible(true); 
    }//GEN-LAST:event_BtnAtrasActionPerformed

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
            java.util.logging.Logger.getLogger(GUIAgregarComponentes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GUIAgregarComponentes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GUIAgregarComponentes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GUIAgregarComponentes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GUIAgregarComponentes().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnAgregarComponente;
    private javax.swing.JButton BtnAtras;
    private javax.swing.JComboBox<String> CbxTipo;
    private javax.swing.JLabel LblAgregarComponentes;
    private javax.swing.JLabel LblAplicacion;
    private javax.swing.JLabel LblId;
    private javax.swing.JLabel LblNombre;
    private javax.swing.JLabel LblTipo;
    private javax.swing.JLabel LblTitulo;
    private javax.swing.JPanel PnlAgregarComponentes;
    private javax.swing.JTextField txtId;
    private javax.swing.JTextField txtNombre;
    // End of variables declaration//GEN-END:variables
}
