/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 
 */
public class Main {
    static Reservations reser = new Reservations();
    static Main prin = new Main();
    String[][] sArreglo = new String[5][22];
    boolean ban = false;
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        new Inicio(reser, prin).setVisible(true);
        
    }

    
    
    
    
    
    public boolean isBan() {
        return ban;
    }

    public void setBan(boolean ban) {
        this.ban = ban;
    }

    public String[][] getsArreglo() {
        return sArreglo;
    }

    public void setsArreglo(String[][] sArreglo) {
        this.sArreglo = sArreglo;
    }

    
    
    
    
    
}
