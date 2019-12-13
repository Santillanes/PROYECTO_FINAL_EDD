
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 
 */
public class Information extends javax.swing.JFrame {
    private Reservations res;
    private Main princ;
    /**
     * Creates new form Information
     */
    public Information(Reservations reser, Main prin, boolean verificar) throws ParseException {
        initComponents();
        this.setExtendedState(MAXIMIZED_BOTH);
        princ = prin;
        res = reser;
        
        if (verificar) {
            txtName.setText(res.getNombre());
            txtLastName.setText(res.getApellido());
            txtCity.setText(res.getCiudad());
            txtCountry.setText(res.getPais());
            txtID.setText(res.getId());
            txtPhone.setText(res.getCelular());
            txtEmail.setText(res.getCorreo());
        }
        
        /*
        String fecLleg = res.getDiaLlegada()+"/"+res.getMesLlegada()+"/"+res.getAñoLlegada();
        DateFormat format = new SimpleDateFormat("DD/MM/YYYY");
        Date fechaLlegada = format.parse(fecLleg);;
        String fecSalida = res.getDiaSalida()+"/"+res.getMesSalida()+"/"+res.getAñoSalida();
        Date fechaSalida = format.parse(fecSalida);
        Date tot = fechaSalida.-fechaLlegada;
        */
        int totAdu = 0, totNi = 0, TOT = 0;
        switch(res.getTipoHab()){
            case "Single":
                totAdu = ((res.getAdultos())*1000);
                totNi = ((res.getNiños())*600);
                break;
            case "Double":
                totAdu = ((res.getAdultos())*1200);
                totNi = ((res.getNiños())*800);
                break;
            case "Suite":
                totAdu = ((res.getAdultos())*1500);
                totNi = ((res.getNiños())*1100);
                break;
            case "Presidential Suite":
                totAdu = ((res.getAdultos())*3800);
                totNi = ((res.getNiños())*2800);
                break;
        }
        SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
        Date llegada = null, salida = null;
        String ad = res.getDiaLlegada();
        String am = res.getMesLlegada();
        String ay = res.getAñoLlegada();
        String dd = res.getDiaSalida();
        String dm = res.getMesSalida();
        String dy = res.getAñoSalida();
        switch (am){
            case "January":
                am = "01";
                break;
            case "February":
                am = "02";
                break;
            case "March":
                am = "03";
                break;
            case "April":
                am = "04";
                break;
            case "May":
                am = "05";
                break;
            case "June":
                am = "06";
                break;
            case "July":
                am = "07";
                break;
            case "August":
                am = "08";
                break;
            case "September":
                am = "09";
                break;
            case "October":
                am = "10";
                break;
            case "November":
                am = "11";
                break;
            case "December":
                am = "12";
                break;
        }
        switch (dm){
            case "January":
                dm = "01";
                break;
            case "February":
                dm = "02";
                break;
            case "March":
                dm = "03";
                break;
            case "April":
                dm = "04";
                break;
            case "May":
                dm = "05";
                break;
            case "June":
                dm = "06";
                break;
            case "July":
                dm = "07";
                break;
            case "August":
                dm = "08";
                break;
            case "September":
                dm = "09";
                break;
            case "October":
                dm = "10";
                break;
            case "November":
                dm = "11";
                break;
            case "December":
                dm = "12";
                break;
        }
        try {
            llegada = sdf.parse(ad+"-"+am+"-"+ay);
            salida = sdf.parse(dd+"-"+dm+"-"+dy);
        } catch (ParseException ex) {
            Logger.getLogger(Reservaciones.class.getName()).log(Level.SEVERE, null, ex);
        }
        long diasLleg = llegada.getTime();
        long diasSal = salida.getTime();
        long diasTotal = (diasSal - diasLleg)/86400000;
        
        TOT = (totAdu+totNi)*((int)(diasTotal));
        
        txtArea.append(
                "Room type: "+reser.getTipoHab()+
                "\nAdults: "+reser.getAdultos()+
                "\nChildren: "+reser.getNiños()+
                "\nArrival date: "+reser.getDiaLlegada()+"/"+reser.getMesLlegada()+"/"+reser.getAñoLlegada()+
                "\nDeparture date: "+reser.getDiaSalida()+"/"+reser.getMesSalida()+"/"+reser.getAñoSalida()+
                "\nTotal nights: "+diasTotal+
                "\nTotal: $"+TOT+" pesos."
        );
    }

    private Information() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
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
        jLabel2 = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtLastName = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtCity = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtID = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtPhone = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtEmail = new javax.swing.JTextField();
        txtPrevious = new javax.swing.JButton();
        txtNext = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtArea = new javax.swing.JTextArea();
        jLabel8 = new javax.swing.JLabel();
        txtCountry = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Comic Sans MS", 1, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("YOUR INFORMATION");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 70, -1, -1));

        jLabel2.setFont(new java.awt.Font("Comic Sans MS", 0, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Name(s):");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1100, 210, -1, -1));

        txtName.setFont(new java.awt.Font("Comic Sans MS", 0, 36)); // NOI18N
        txtName.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 5, true));
        getContentPane().add(txtName, new org.netbeans.lib.awtextra.AbsoluteConstraints(1270, 210, 454, -1));

        jLabel3.setFont(new java.awt.Font("Comic Sans MS", 0, 36)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Last Name:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(1100, 320, -1, -1));

        txtLastName.setFont(new java.awt.Font("Comic Sans MS", 0, 36)); // NOI18N
        txtLastName.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 5, true));
        getContentPane().add(txtLastName, new org.netbeans.lib.awtextra.AbsoluteConstraints(1300, 320, 452, -1));

        jLabel4.setFont(new java.awt.Font("Comic Sans MS", 0, 36)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("City:");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(1100, 440, -1, -1));

        txtCity.setFont(new java.awt.Font("Comic Sans MS", 0, 36)); // NOI18N
        txtCity.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 5, true));
        getContentPane().add(txtCity, new org.netbeans.lib.awtextra.AbsoluteConstraints(1200, 440, 196, -1));

        jLabel5.setFont(new java.awt.Font("Comic Sans MS", 0, 36)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("ID Number:");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(1092, 570, 210, -1));

        txtID.setFont(new java.awt.Font("Comic Sans MS", 0, 36)); // NOI18N
        txtID.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 5, true));
        getContentPane().add(txtID, new org.netbeans.lib.awtextra.AbsoluteConstraints(1300, 560, 380, -1));

        jLabel6.setFont(new java.awt.Font("Comic Sans MS", 0, 36)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Cell Phone Number:");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(1100, 700, -1, -1));

        txtPhone.setFont(new java.awt.Font("Comic Sans MS", 0, 36)); // NOI18N
        txtPhone.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 5, true));
        getContentPane().add(txtPhone, new org.netbeans.lib.awtextra.AbsoluteConstraints(1436, 700, 300, -1));

        jLabel7.setFont(new java.awt.Font("Comic Sans MS", 0, 36)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("E-mail:");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(1100, 830, -1, -1));

        txtEmail.setFont(new java.awt.Font("Comic Sans MS", 0, 36)); // NOI18N
        txtEmail.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 5, true));
        getContentPane().add(txtEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(1280, 830, 469, -1));

        txtPrevious.setBackground(new java.awt.Color(184, 162, 189));
        txtPrevious.setFont(new java.awt.Font("Comic Sans MS", 0, 24)); // NOI18N
        txtPrevious.setForeground(new java.awt.Color(255, 255, 255));
        txtPrevious.setText("Previous");
        txtPrevious.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 5, true));
        txtPrevious.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPreviousActionPerformed(evt);
            }
        });
        getContentPane().add(txtPrevious, new org.netbeans.lib.awtextra.AbsoluteConstraints(1320, 950, 120, -1));

        txtNext.setBackground(new java.awt.Color(184, 162, 189));
        txtNext.setFont(new java.awt.Font("Comic Sans MS", 0, 24)); // NOI18N
        txtNext.setForeground(new java.awt.Color(255, 255, 255));
        txtNext.setText("Next");
        txtNext.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 5, true));
        txtNext.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNextActionPerformed(evt);
            }
        });
        getContentPane().add(txtNext, new org.netbeans.lib.awtextra.AbsoluteConstraints(1530, 950, 90, -1));

        txtArea.setEditable(false);
        txtArea.setColumns(20);
        txtArea.setFont(new java.awt.Font("Monospaced", 0, 24)); // NOI18N
        txtArea.setRows(5);
        txtArea.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 5, true));
        jScrollPane1.setViewportView(txtArea);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(111, 191, 780, 740));

        jLabel8.setFont(new java.awt.Font("Comic Sans MS", 0, 36)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Country:");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(1410, 440, -1, -1));

        txtCountry.setFont(new java.awt.Font("Comic Sans MS", 0, 36)); // NOI18N
        txtCountry.setToolTipText("");
        txtCountry.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 5, true));
        getContentPane().add(txtCountry, new org.netbeans.lib.awtextra.AbsoluteConstraints(1570, 440, 184, -1));

        jPanel1.setBackground(new java.awt.Color(184, 162, 189));
        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1920, 1080));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtNextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNextActionPerformed
        
        res.setNombre(txtName.getText());
        res.setApellido(txtLastName.getText());
        res.setCiudad(txtCity.getText());
        res.setPais(txtCountry.getText());
        res.setId(txtID.getText());
        res.setCelular(txtPhone.getText());
        res.setCorreo(txtEmail.getText());
        
        
        
        if (txtName.getText().length() == 0 || txtLastName.getText().length() == 0 || txtCity.getText().length() == 0 || txtCountry.getText().length() == 0 ||
            txtID.getText().length() == 0 || txtPhone.getText().length() == 0 || txtEmail.getText().length() == 0) {
            JOptionPane.showMessageDialog(this, "Enter all fields to continue.");
        }else{
        new CreditCard(res, princ).setVisible(true);
        this.dispose();
        }
    }//GEN-LAST:event_txtNextActionPerformed

    private void txtPreviousActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPreviousActionPerformed
        // TODO add your handling code here:
        new Reservaciones(res, princ, true).setVisible(true);
        this.dispose();
    }//GEN-LAST:event_txtPreviousActionPerformed

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
            java.util.logging.Logger.getLogger(Information.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Information.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Information.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Information.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Information().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea txtArea;
    private javax.swing.JTextField txtCity;
    private javax.swing.JTextField txtCountry;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtID;
    private javax.swing.JTextField txtLastName;
    private javax.swing.JTextField txtName;
    private javax.swing.JButton txtNext;
    private javax.swing.JTextField txtPhone;
    private javax.swing.JButton txtPrevious;
    // End of variables declaration//GEN-END:variables
}
