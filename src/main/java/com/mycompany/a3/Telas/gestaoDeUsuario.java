package com.mycompany.a3.Telas;

import com.mycompany.a3.Main.Servidor;
import com.mycompany.a3.Main.Usuario;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

public class gestaoDeUsuario extends javax.swing.JFrame {

    Usuario[] Usuarios;
    public gestaoDeUsuario() {
        initComponents();
        
        
        Usuarios = Servidor.GetUsuarios();
        
        var modeloPadraoTUsuarios = (DefaultTableModel) TabelaUsuarios.getModel();
        
        for (int i = 0; i< Usuarios.length; ++i)
        {
            var usuario = Usuarios[i];
            
            modeloPadraoTUsuarios.addRow(new Object[]{usuario.ID, usuario.Permissao,
                    usuario.NomeUsuario, usuario.NomeReal, usuario.Email,
                    usuario.Telefone
                    });
        }
        
        var gdu = this;
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                gdu.setVisible(true);
            }
        });
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        ExcluirUsuario = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        TabelaUsuarios = new javax.swing.JTable();
        PromoverUsuario = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Gestão de Usuários");

        ExcluirUsuario.setText("Excluir usuário");
        ExcluirUsuario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ExcluirUsuarioMouseClicked(evt);
            }
        });

        TabelaUsuarios.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Nivel de permisão", "Nome de usuário", "Nome verdadeiro", "E-mail", "Telefone"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(TabelaUsuarios);

        PromoverUsuario.setText("Promover Usuário");
        PromoverUsuario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                PromoverUsuarioMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(jLabel1)
                .addContainerGap(575, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(PromoverUsuario)
                .addGap(18, 18, 18)
                .addComponent(ExcluirUsuario)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 111, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ExcluirUsuario)
                    .addComponent(PromoverUsuario))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void PromoverUsuarioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PromoverUsuarioMouseClicked

        var modeloPadraoTUsuarios = (DefaultTableModel) TabelaUsuarios.getModel();
        
        var row = TabelaUsuarios.getSelectedRow();
        
        Servidor.PromoverUsuario((int)modeloPadraoTUsuarios.getValueAt(row, 0));
        
        new gestaoDeUsuario();
        
        this.dispose();
    }//GEN-LAST:event_PromoverUsuarioMouseClicked

    private void ExcluirUsuarioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ExcluirUsuarioMouseClicked
        var modeloPadraoTUsuarios = (DefaultTableModel) TabelaUsuarios.getModel();
        
        var row = TabelaUsuarios.getSelectedRow();
        
        Servidor.RemoverUsuario((int)modeloPadraoTUsuarios.getValueAt(row, 0));
        
        new gestaoDeUsuario();
        
        this.dispose();
    }//GEN-LAST:event_ExcluirUsuarioMouseClicked

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
            java.util.logging.Logger.getLogger(gestaoDeUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(gestaoDeUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(gestaoDeUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(gestaoDeUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new gestaoDeUsuario().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ExcluirUsuario;
    private javax.swing.JButton PromoverUsuario;
    private javax.swing.JTable TabelaUsuarios;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}