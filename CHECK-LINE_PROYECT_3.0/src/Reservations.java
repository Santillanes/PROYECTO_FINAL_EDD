
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;


public class Reservations {
    
    //Room Data
    private String tipoHab;
    private int adultos;
    private int niños;
    private String diaLlegada;
    private String mesLlegada;
    private String añoLlegada;
    private String diaSalida;
    private String mesSalida;
    private String añoSalida;
    //Guest Data
    private String nombre;
    private String apellido;
    private String ciudad;
    private String pais;
    private String id;
    private String celular;
    private String correo;
    //Pay Data
    private String tarjeta;
    private String titular;
    private String mesExp;
    private String añoExp;
    private String cvv;
    //USER/PIN
    private String usuario;
    private String  pin;
    
    
    public Reservations() {
        this.tipoHab = "";
        this.adultos = 0;
        this.niños = 0;
        this.diaLlegada = "";
        this.mesLlegada = "";
        this.añoLlegada = "";
        this.diaSalida = "";
        this.mesSalida = "";
        this.añoSalida = "";
        this.nombre = "";
        this.apellido = "";
        this.ciudad = "";
        this.pais = "";
        this.id = "";
        this.celular = "";
        this.correo = "";
        this.tarjeta = "";
        this.titular = "";
        this.mesExp = "";
        this.añoExp = "";
        this.cvv = "";
        this.usuario = "";
        this.pin = "";
    }

    public String getTipoHab() {
        return tipoHab;
    }

    public void setTipoHab(String tipoHab) {
        this.tipoHab = tipoHab;
    }

    public int getAdultos() {
        return adultos;
    }

    public void setAdultos(int adultos) {
        this.adultos = adultos;
    }

    public int getNiños() {
        return niños;
    }

    public void setNiños(int niños) {
        this.niños = niños;
    }

    public String getDiaLlegada() {
        return diaLlegada;
    }

    public void setDiaLlegada(String diaLlegada) {
        this.diaLlegada = diaLlegada;
    }

    public String getMesLlegada() {
        return mesLlegada;
    }

    public void setMesLlegada(String mesLlegada) {
        this.mesLlegada = mesLlegada;
    }

    public String getAñoLlegada() {
        return añoLlegada;
    }

    public void setAñoLlegada(String añoLlegada) {
        this.añoLlegada = añoLlegada;
    }

    public String getDiaSalida() {
        return diaSalida;
    }

    public void setDiaSalida(String diaSalida) {
        this.diaSalida = diaSalida;
    }

    public String getMesSalida() {
        return mesSalida;
    }

    public void setMesSalida(String mesSalida) {
        this.mesSalida = mesSalida;
    }

    public String getAñoSalida() {
        return añoSalida;
    }

    public void setAñoSalida(String añoSalida) {
        this.añoSalida = añoSalida;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getTarjeta() {
        return tarjeta;
    }

    public void setTarjeta(String tarjeta) {
        this.tarjeta = tarjeta;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public String getMesExp() {
        return mesExp;
    }

    public void setMesExp(String mesExp) {
        this.mesExp = mesExp;
    }

    public String getAñoExp() {
        return añoExp;
    }

    public void setAñoExp(String añoExp) {
        this.añoExp = añoExp;
    }

    public String getCvv() {
        return cvv;
    }

    public void setCvv(String cvv) {
        this.cvv = cvv;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getPin() {
        return pin;
    }

    public void setPin(String pin) {
        this.pin = pin;
    }
    
    
    /*public void arreglo() throws ParseException, FileNotFoundException, IOException, ClassNotFoundException{
        File ar = new File("Datos");
        if(ar.exists()){
            ObjectInputStream ver = new ObjectInputStream(new FileInputStream("Datos"));
            Object objread = ver.readObject();
            guardarDatos((String[][]) objread);
        }else{
            String[][] sArreglo = new String[5][21];
            guardarDatos(sArreglo);
        }
    }*/
    
    
    
    
    
    
    
    
    public void guardarDatos(String[][] arreglo) throws ParseException{
//Verificado, tipoHab, usuario, pin, adultos, niños, fecLlegada, fecSalida, nombre, apellido, ciudad, pais, id, celular, correo, tarjeta, titular, mesExp, añoExp, cvv, #hab, PassHab
//  0           1       2       3       4       5       6           7           8       9       10      11  12      13      14      15      16      17      18      19   20     21
                
                //String[][] sArreglo = new String[5][20];
                for (int i = 0; i < arreglo.length; i++) {
                        if((arreglo[i][3]) == null){
                            //Verificado
                            arreglo[i][1] = this.tipoHab;
                            arreglo[i][2] = this.usuario;
                            arreglo[i][3] = this.pin;
                            arreglo[i][4] = Integer.toString(this.adultos);
                            arreglo[i][5] = Integer.toString(this.niños);
                            String llegada = (this.diaLlegada+"-"+this.mesLlegada+"-"+this.añoLlegada);
                            arreglo[i][6] = llegada;
                            String salida = (this.diaSalida+"-"+this.mesSalida+"-"+this.añoSalida);
                            arreglo[i][7] = salida;
                            arreglo[i][8] = this.nombre;
                            arreglo[i][9] = this.apellido;
                            arreglo[i][10] = this.ciudad;
                            arreglo[i][11] = this.pais;
                            arreglo[i][12] = this.id;
                            arreglo[i][13] = this.celular;
                            arreglo[i][14] = this.correo;
                            arreglo[i][15] = this.tarjeta;
                            arreglo[i][16] = this.titular;
                            arreglo[i][17] = this.mesExp;
                            arreglo[i][18] = this.añoExp;
                            arreglo[i][19] = this.cvv;
                            // # Habitacion
                            // Pass Habitacion
                            break;
                        }
                }
                
                
                if(arreglo[0][3] != null)
                    System.out.println("Hay algo");
                else
                    System.out.println("No hay algo");
                
                for (int i = 0; i < arreglo.length; i++) {
                    for (int j = 0; j < arreglo[i].length; j++) {
                        System.out.print("["+arreglo[i][j]+"]");
                    }
                    System.out.println("");
                }
                System.out.println(arreglo);
    }
            
            
          
            
        
    
    
    
    
}
