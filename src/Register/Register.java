package Register;

import BD.Conexion;
import java.sql.*;
import Login.*;
import Main.Main;
import java.awt.Color;
import java.awt.Toolkit;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;
import javax.swing.JOptionPane;

public class Register extends javax.swing.JFrame {

    /**
     * Creates new form LoginClassHub
     */
    public Register() {
        initComponents();
        SetIcon();
        LlenarComboBox();
        this.setLocationRelativeTo(null);
    }

    public void LlenarComboBox() {
        RegisterBack r = new RegisterBack();
        CarrerasCombo.setModel(r.LlenarCombo()); // Llenar el combo
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bg = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        RegistrarBtn = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        NewAccountLabel = new javax.swing.JLabel();
        NombreField = new javax.swing.JTextField();
        sep1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        ApellidoField = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        NewAccountLabel1 = new javax.swing.JLabel();
        EmailField = new javax.swing.JTextField();
        sep2 = new javax.swing.JSeparator();
        PasswordField = new javax.swing.JTextField();
        sep3 = new javax.swing.JSeparator();
        ConfirmPasswordField1 = new javax.swing.JTextField();
        sep4 = new javax.swing.JSeparator();
        UsuarioField = new javax.swing.JTextField();
        sep5 = new javax.swing.JSeparator();
        CarrerasCombo = new javax.swing.JComboBox<>();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("ClassHub");
        setResizable(false);

        bg.setBackground(new java.awt.Color(255, 255, 255));
        bg.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        RegistrarBtn.setBackground(new java.awt.Color(84, 127, 255));
        RegistrarBtn.setFont(new java.awt.Font("Yu Gothic UI", 1, 18)); // NOI18N
        RegistrarBtn.setForeground(new java.awt.Color(255, 255, 255));
        RegistrarBtn.setText("Registrarme");
        RegistrarBtn.setActionCommand("IngresarButton");
        RegistrarBtn.setBorder(null);
        RegistrarBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        RegistrarBtn.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        RegistrarBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                RegistrarBtnMouseClicked(evt);
            }
        });
        RegistrarBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RegistrarBtnActionPerformed(evt);
            }
        });
        jPanel2.add(RegistrarBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 450, 390, 50));

        jLabel2.setFont(new java.awt.Font("Yu Gothic UI Semilight", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(102, 102, 102));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel2.setText("<html><body>Rellena los datos mas abajo <br>y se testigo de una nueva experiencia</body></html>");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 70, 320, 40));

        NewAccountLabel.setFont(new java.awt.Font("Yu Gothic UI", 1, 12)); // NOI18N
        NewAccountLabel.setForeground(javax.swing.UIManager.getDefaults().getColor("Actions.Grey"));
        NewAccountLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        NewAccountLabel.setText("Ya tienes una cuenta?");
        NewAccountLabel.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        NewAccountLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                NewAccountLabelMouseEntered(evt);
            }
        });
        jPanel2.add(NewAccountLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 530, 140, -1));

        NombreField.setFont(new java.awt.Font("Yu Gothic UI", 0, 14)); // NOI18N
        NombreField.setForeground(new java.awt.Color(196, 196, 196));
        NombreField.setText("Nombre");
        NombreField.setBorder(null);
        NombreField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                NombreFieldFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                NombreFieldFocusLost(evt);
            }
        });
        jPanel2.add(NombreField, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 170, 190, 30));

        sep1.setBackground(new java.awt.Color(215, 215, 215));
        jPanel2.add(sep1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 200, 190, -1));

        jSeparator2.setBackground(new java.awt.Color(215, 215, 215));
        jPanel2.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 200, 190, -1));

        ApellidoField.setFont(new java.awt.Font("Yu Gothic UI", 0, 14)); // NOI18N
        ApellidoField.setForeground(new java.awt.Color(196, 196, 196));
        ApellidoField.setText("Apellido");
        ApellidoField.setBorder(null);
        ApellidoField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                ApellidoFieldFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                ApellidoFieldFocusLost(evt);
            }
        });
        jPanel2.add(ApellidoField, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 170, 190, 30));

        jLabel4.setFont(new java.awt.Font("Yu Gothic UI", 1, 32)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel4.setText("Bienvenido a ClassHub!");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 30, 360, 40));

        NewAccountLabel1.setFont(new java.awt.Font("Yu Gothic UI", 1, 12)); // NOI18N
        NewAccountLabel1.setForeground(new java.awt.Color(57, 123, 255));
        NewAccountLabel1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        NewAccountLabel1.setText("Ingresar a cuenta");
        NewAccountLabel1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        NewAccountLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                NewAccountLabel1MouseEntered(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                NewAccountLabel1MousePressed(evt);
            }
        });
        jPanel2.add(NewAccountLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 530, 120, -1));

        EmailField.setFont(new java.awt.Font("Yu Gothic UI", 0, 14)); // NOI18N
        EmailField.setForeground(new java.awt.Color(196, 196, 196));
        EmailField.setText("Correo Electronico");
        EmailField.setBorder(null);
        EmailField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                EmailFieldFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                EmailFieldFocusLost(evt);
            }
        });
        jPanel2.add(EmailField, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 230, 400, 30));

        sep2.setBackground(new java.awt.Color(215, 215, 215));
        jPanel2.add(sep2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 260, 400, -1));

        PasswordField.setFont(new java.awt.Font("Yu Gothic UI", 0, 14)); // NOI18N
        PasswordField.setForeground(new java.awt.Color(196, 196, 196));
        PasswordField.setText("Contraseña");
        PasswordField.setBorder(null);
        PasswordField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                PasswordFieldFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                PasswordFieldFocusLost(evt);
            }
        });
        jPanel2.add(PasswordField, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 290, 190, 30));

        sep3.setBackground(new java.awt.Color(215, 215, 215));
        jPanel2.add(sep3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 320, 190, -1));

        ConfirmPasswordField1.setFont(new java.awt.Font("Yu Gothic UI", 0, 14)); // NOI18N
        ConfirmPasswordField1.setForeground(new java.awt.Color(196, 196, 196));
        ConfirmPasswordField1.setText("Confirmar Contraseña");
        ConfirmPasswordField1.setBorder(null);
        ConfirmPasswordField1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                ConfirmPasswordField1FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                ConfirmPasswordField1FocusLost(evt);
            }
        });
        jPanel2.add(ConfirmPasswordField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 290, 190, 30));

        sep4.setBackground(new java.awt.Color(215, 215, 215));
        jPanel2.add(sep4, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 320, 190, -1));

        UsuarioField.setFont(new java.awt.Font("Yu Gothic UI", 0, 14)); // NOI18N
        UsuarioField.setForeground(new java.awt.Color(196, 196, 196));
        UsuarioField.setText("Usuario");
        UsuarioField.setBorder(null);
        UsuarioField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                UsuarioFieldFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                UsuarioFieldFocusLost(evt);
            }
        });
        jPanel2.add(UsuarioField, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 350, 190, 30));

        sep5.setBackground(new java.awt.Color(215, 215, 215));
        jPanel2.add(sep5, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 380, 190, -1));

        CarrerasCombo.setFont(new java.awt.Font("Yu Gothic UI", 0, 14)); // NOI18N
        CarrerasCombo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jPanel2.add(CarrerasCombo, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 350, 180, 30));

        bg.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 440, 600));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setPreferredSize(new java.awt.Dimension(450, 600));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setBackground(new java.awt.Color(153, 153, 153));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/network.png"))); // NOI18N
        jLabel1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel3.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 460, 570));

        bg.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 0, 460, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void NewAccountLabelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_NewAccountLabelMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_NewAccountLabelMouseEntered

    private void NombreFieldFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_NombreFieldFocusGained
        if (NombreField.getText().equals("Nombre")) {
            NombreField.setText("");
            NombreField.setForeground(Color.black);

        }
    }//GEN-LAST:event_NombreFieldFocusGained

    private void NombreFieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_NombreFieldFocusLost
        if (NombreField.getText().equals("")) {
            NombreField.setText("Nombre");
            NombreField.setForeground(Color.gray);
        }
    }//GEN-LAST:event_NombreFieldFocusLost

    private void ApellidoFieldFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_ApellidoFieldFocusGained
        if (ApellidoField.getText().equals("Apellido")) {
            ApellidoField.setText("");
            ApellidoField.setForeground(Color.black);
        }
    }//GEN-LAST:event_ApellidoFieldFocusGained

    private void ApellidoFieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_ApellidoFieldFocusLost
        if (ApellidoField.getText().equals("")) {
            ApellidoField.setText("Apellido");
            ApellidoField.setForeground(Color.gray);
        }
    }//GEN-LAST:event_ApellidoFieldFocusLost

    private void NewAccountLabel1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_NewAccountLabel1MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_NewAccountLabel1MouseEntered

    private void RegistrarBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_RegistrarBtnMouseClicked

        String user = UsuarioField.getText();
        String pass = PasswordField.getText();
        String name = NombreField.getText();
        String surname = ApellidoField.getText();
        String email = EmailField.getText();
        Integer idCarrera = CarrerasCombo.getSelectedIndex();

 
        int IdStudentGenerate = (new Random()).nextInt(900000) + 100000;

        String queryUsuario = "INSERT INTO Usuario VALUES('" + user + "', '" + pass + "', '" + IdStudentGenerate + "')";
        String queryEstudiante = "INSERT INTO Estudiante(idEstudiante, nombre, apellido, correo, idCarrera) VALUES(" + IdStudentGenerate + ", '" + name + "', '" + surname + "', '" + email + "', " + idCarrera + ")";
       
        
        //System.out.println(queryEstudiante);
        
        try {
            Connection con = Conexion.getConexion();
            PreparedStatement psEstudiante = con.prepareStatement(queryEstudiante);
            PreparedStatement psUsuario = con.prepareStatement(queryUsuario);
            int insertEstudiante = psEstudiante.executeUpdate();
            int insertUsuario = psUsuario.executeUpdate();
           
            System.out.println("Se creo " + insertEstudiante + " usuario");
            
            JOptionPane.showMessageDialog(null, "Haz creado tu cuenta exitosamente!",
  "Enhorabuena", JOptionPane.INFORMATION_MESSAGE);
            
            dispose();
            Main main = new Main();
            main.setVisible(true);
            
            System.out.println("Estudiante y usuario creado!");
        } catch (SQLException ex) {
            System.out.println(ex.toString());
            JOptionPane.showMessageDialog(null, "Hubo un error al guardar tus datos!",
  "Error registrate", JOptionPane.ERROR_MESSAGE);
        }

        
    }//GEN-LAST:event_RegistrarBtnMouseClicked

    private void NewAccountLabel1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_NewAccountLabel1MousePressed
        dispose();
        LoginClassHub login = new LoginClassHub();
        login.setVisible(true);
    }//GEN-LAST:event_NewAccountLabel1MousePressed

    private void EmailFieldFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_EmailFieldFocusGained
        if (EmailField.getText().equals("Correo Electronico")) {
            EmailField.setText("");
            EmailField.setForeground(Color.black);
        }
    }//GEN-LAST:event_EmailFieldFocusGained

    private void EmailFieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_EmailFieldFocusLost
        if (EmailField.getText().equals("")) {
            EmailField.setText("Correo Electronico");
            EmailField.setForeground(Color.gray);
        }
    }//GEN-LAST:event_EmailFieldFocusLost

    private void PasswordFieldFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_PasswordFieldFocusGained
        if (PasswordField.getText().equals("Contraseña")) {
            PasswordField.setText("");
            PasswordField.setForeground(Color.black);
        }
    }//GEN-LAST:event_PasswordFieldFocusGained

    private void PasswordFieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_PasswordFieldFocusLost
        if (PasswordField.getText().equals("")) {
            PasswordField.setText("Contraseña");
            PasswordField.setForeground(Color.gray);
        }
    }//GEN-LAST:event_PasswordFieldFocusLost

    private void ConfirmPasswordField1FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_ConfirmPasswordField1FocusGained
        if (ConfirmPasswordField1.getText().equals("Confirmar Contraseña")) {
            ConfirmPasswordField1.setText("");
            ConfirmPasswordField1.setForeground(Color.black);
        }
    }//GEN-LAST:event_ConfirmPasswordField1FocusGained

    private void ConfirmPasswordField1FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_ConfirmPasswordField1FocusLost
        if (ConfirmPasswordField1.getText().equals("")) {
            ConfirmPasswordField1.setText("Confirmar Contraseña");
            ConfirmPasswordField1.setForeground(Color.gray);
        }
    }//GEN-LAST:event_ConfirmPasswordField1FocusLost

    private void UsuarioFieldFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_UsuarioFieldFocusGained
        if (UsuarioField.getText().equals("Usuario")) {
            UsuarioField.setText("");
            UsuarioField.setForeground(Color.black);
        }
    }//GEN-LAST:event_UsuarioFieldFocusGained

    private void UsuarioFieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_UsuarioFieldFocusLost
        if (UsuarioField.getText().equals("")) {
            UsuarioField.setText("Usuario");
            UsuarioField.setForeground(Color.gray);
        }
    }//GEN-LAST:event_UsuarioFieldFocusLost

    private void RegistrarBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RegistrarBtnActionPerformed

    }//GEN-LAST:event_RegistrarBtnActionPerformed

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
            java.util.logging.Logger.getLogger(Register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Register().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JTextField ApellidoField;
    private javax.swing.JComboBox<String> CarrerasCombo;
    public javax.swing.JTextField ConfirmPasswordField1;
    public javax.swing.JTextField EmailField;
    private javax.swing.JLabel NewAccountLabel;
    private javax.swing.JLabel NewAccountLabel1;
    public javax.swing.JTextField NombreField;
    public javax.swing.JTextField PasswordField;
    private javax.swing.JButton RegistrarBtn;
    public javax.swing.JTextField UsuarioField;
    private javax.swing.JPanel bg;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JSeparator jSeparator2;
    public javax.swing.JSeparator sep1;
    public javax.swing.JSeparator sep2;
    public javax.swing.JSeparator sep3;
    public javax.swing.JSeparator sep4;
    public javax.swing.JSeparator sep5;
    // End of variables declaration//GEN-END:variables
    private void SetIcon() {
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("../img/logoClassHub.png")));
    }
}
