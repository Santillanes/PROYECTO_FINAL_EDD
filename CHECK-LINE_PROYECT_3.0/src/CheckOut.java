
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
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
public class CheckOut extends javax.swing.JFrame implements Runnable {
    private Reservations reserv;
    private Main princ;
    
    //RELOJ
    String sHora, sMinutos, sSegundos, ampm;
    Calendar Calendario;
    Thread h1;
    

    /**
     * Creates new form CheckOut
     */
    public CheckOut(Reservations res, Main prin) {
        initComponents();
        reserv= res;
        princ = prin;
        this.setExtendedState(MAXIMIZED_BOTH);
        
        //RELOJ
        h1 = new Thread(this);
        h1.start();
    }
    
    public void calcula(){
        Calendar calendario = new GregorianCalendar();
        Date  fechaHoraActual = new Date();
        
        
        calendario.setTime(fechaHoraActual);
        ampm = calendario.get(Calendar.AM_PM) == Calendar.AM?"AM":"PM";
        
        if (ampm.equals("PM")) {
            int h = calendario.get(Calendar.HOUR_OF_DAY)-12;
            sHora = h>9? "" + h: "0" + h;
        }else{
            sHora = calendario.get(Calendar.HOUR_OF_DAY) > 9? "" + calendario.get(Calendar.HOUR_OF_DAY):"0" + calendario.get(Calendar.HOUR_OF_DAY);
        }
        
        sMinutos = calendario.get(Calendar.MINUTE)>9?""+calendario.get(Calendar.MINUTE):"0"+calendario.get(Calendar.MINUTE);
        sSegundos = calendario.get(Calendar.SECOND)>9?""+calendario.get(Calendar.SECOND):"0"+calendario.get(Calendar.SECOND); 
    }

    private CheckOut() {
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
        jLabel4 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        btnCheckOut = new javax.swing.JButton();
        btnExit = new javax.swing.JButton();
        txtUser = new javax.swing.JTextField();
        pswPIN = new javax.swing.JPasswordField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        lblReloj = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(175, 133, 186));
        setUndecorated(true);

        jLabel1.setFont(new java.awt.Font("Comic Sans MS", 1, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Check-Out");

        jLabel4.setFont(new java.awt.Font("Comic Sans MS", 0, 36)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("To make Check-Out, enter the username and PIN they gave you when making your reservation.");

        jPanel1.setBackground(new java.awt.Color(184, 162, 189));
        jPanel1.setForeground(new java.awt.Color(184, 162, 189));

        btnCheckOut.setBackground(new java.awt.Color(184, 162, 189));
        btnCheckOut.setFont(new java.awt.Font("Comic Sans MS", 0, 24)); // NOI18N
        btnCheckOut.setForeground(new java.awt.Color(255, 255, 255));
        btnCheckOut.setText("Check-Out");
        btnCheckOut.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 5, true));
        btnCheckOut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCheckOutActionPerformed(evt);
            }
        });

        btnExit.setBackground(new java.awt.Color(184, 162, 189));
        btnExit.setFont(new java.awt.Font("Comic Sans MS", 0, 24)); // NOI18N
        btnExit.setForeground(new java.awt.Color(255, 255, 255));
        btnExit.setText("Exit");
        btnExit.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 5, true));
        btnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExitActionPerformed(evt);
            }
        });

        txtUser.setFont(new java.awt.Font("Comic Sans MS", 0, 36)); // NOI18N
        txtUser.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 5, true));

        pswPIN.setFont(new java.awt.Font("Comic Sans MS", 0, 36)); // NOI18N
        pswPIN.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 5, true));

        jLabel2.setFont(new java.awt.Font("Comic Sans MS", 0, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("User:");

        jLabel3.setFont(new java.awt.Font("Comic Sans MS", 0, 36)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("PIN:");

        lblReloj.setFont(new java.awt.Font("Comic Sans MS", 1, 24)); // NOI18N
        lblReloj.setForeground(new java.awt.Color(255, 255, 255));
        lblReloj.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblReloj.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 5, true));

        jLabel6.setFont(new java.awt.Font("Comic Sans MS", 0, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Check out available until 12:00 PM");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(1800, 1800, 1800)
                .addComponent(btnExit, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(920, 920, 920)
                .addComponent(btnCheckOut, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(831, 831, 831)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(50, 50, 50)
                        .addComponent(pswPIN, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(36, 36, 36)
                        .addComponent(txtUser, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(lblReloj, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(72, 72, 72))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addGap(37, 37, 37))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(btnExit, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(381, 381, 381)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtUser, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(109, 109, 109)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(pswPIN, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(174, 174, 174)
                .addComponent(btnCheckOut, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 17, Short.MAX_VALUE)
                .addComponent(jLabel6)
                .addGap(27, 27, 27)
                .addComponent(lblReloj, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(852, 852, 852)
                .addComponent(jLabel1))
            .addGroup(layout.createSequentialGroup()
                .addGap(207, 207, 207)
                .addComponent(jLabel4))
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(103, 103, 103)
                .addComponent(jLabel1)
                .addGap(117, 117, 117)
                .addComponent(jLabel4)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnCheckOutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCheckOutActionPerformed
        // TODO add your handling code here:
        
        int iHora;
        int iMinutos;
        int iSegundos;
        iHora = Integer.parseInt(sHora);
        iMinutos = Integer.parseInt(sMinutos);
        iSegundos = Integer.parseInt(sSegundos);
        if(iHora <= 12 && iMinutos >= 0 && iSegundos >= 0 && ampm.equals("AM")){
        if (txtUser.getText().length() == 0 || pswPIN.getText().length() == 0) {
            JOptionPane.showMessageDialog(this, "Enter all fields to continue.");
        }else{
            boolean borra = borrar(princ.getsArreglo(), txtUser.getText(), pswPIN.getText());
            System.out.println("borra = " + borra);
            if (borra == true) {
                System.out.println("borra = " + borra);
                new FinishCheckOut(reserv, princ).setVisible(true);
                this.dispose();
            }else{
                System.out.println("borra = " + borra);
                JOptionPane.showMessageDialog(null, "Data not validated. Try again.");
            }
            
            
            System.out.println("\nArreglo despues de check out");
            for (int i = 0; i < princ.getsArreglo().length; i++) {
                for (int j = 0; j < princ.getsArreglo()[i].length; j++) {
                    System.out.print("["+princ.getsArreglo()[i][j]+"]");
                }
                System.out.println("");
            }
        }
        }else{
            JOptionPane.showMessageDialog(null, "Check-Out not available.");
        }
    }//GEN-LAST:event_btnCheckOutActionPerformed
     //[null][Single][168763][2227964][2][1][June][July][Luis][Santillanes][Delicias][Mexico][ID][6391128877][luis@gmail.com][CCNumber][CCHoster][02][2021][362][null]
    private static boolean borrar(String[][] arreglo, String usu, String pass){
        //boolean encontrado = false;
        for (int i = 0; i < arreglo[2].length; i++) {
            if (usu.equals(arreglo[i][2]) && pass.equals(arreglo[i][3]) && ("verificado".equals(arreglo[i][0]))) {
                //encontrado = true;
                System.out.println("entró");
                for (int j = 0; j < arreglo[i].length; j++) {
                    arreglo[i][j] = null;
                }
                return true;
            }
            break;
        }
        return false;
    }
    
    
    private void btnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExitActionPerformed
        // TODO add your handling code here:
        new EnglishMain(reserv, princ).setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnExitActionPerformed

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
            java.util.logging.Logger.getLogger(CheckOut.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CheckOut.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CheckOut.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CheckOut.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CheckOut().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCheckOut;
    private javax.swing.JButton btnExit;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblReloj;
    private javax.swing.JPasswordField pswPIN;
    private javax.swing.JTextField txtUser;
    // End of variables declaration//GEN-END:variables

    @Override
    public void run() {
        Thread ct = Thread.currentThread();
        while(ct == h1) {   
            calcula();
            lblReloj.setText(sHora + ":" + sMinutos + ":" + sSegundos + " "+ampm);
            try {
                Thread.sleep(1000);
            }catch(InterruptedException e) {}
 }
    }
}