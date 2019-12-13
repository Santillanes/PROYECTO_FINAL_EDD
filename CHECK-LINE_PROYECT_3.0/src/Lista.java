
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author 
 */
public class Lista {
    
    private Nodo inicio;
    private Nodo fin;
    
    public Lista() {
        this.inicio = null;
        this.fin = null;
    }
    //DEVUELVE TRUE SI LA LISTA ESTÁ VACÍA
    public boolean isEmpty(){
        if(inicio == null)
            return true;
        else
            return false;
    }
    
    //AGREGAR UN NODO AL FINAL DE LA LISTA
    public void add(Nodo nuevo){
        //PRIMERO VERIFICAR SI LA LISTA ESTÁ VACÍA
        if(isEmpty()){
           inicio = nuevo;
           fin = nuevo;
        }else{
            /*Nodo temp = inicio;
            while(temp.getSiguiente() != null){
                temp = temp.getSiguiente();
            }
            temp.setSiguiente(nuevo);*/
            fin.setSiguiente(nuevo);
            fin = nuevo;
        }
    }
    
    public void addBegin(Nodo nuevo){
        if(isEmpty()){
            inicio = nuevo;
            fin = nuevo;
        }else{
            nuevo.setSiguiente(inicio);
            inicio = nuevo;
        }
    }
    
    public void print(){
        Nodo temp = inicio;
        while (temp != null) {         
            System.out.println("Dato = " + temp.getValor());
            temp = temp.getSiguiente();
        }
    }
    
    public int size(){
        int cont = 0;
        Nodo temp = inicio;
        while (temp != null) {         
            temp = temp.getSiguiente();
            cont++;
        }
        return cont;
    }
    
    public void insertAt(int pos, Nodo nuevo) throws Exception{
        if(isEmpty()){
            inicio = nuevo;
            fin = nuevo;
        }else{
            int tama = size();
            if((pos<0) || (pos>= tama)){
                throw new Exception("La ´posición es inválida");
            }else{
                if(pos == 0){
                    addBegin(nuevo);
                }else{
                    Nodo temp = inicio;
                    while(pos-1 != 0){  //DIFERENTE A LO HECHO EN CLASE, PERO FUNCIONA
                            temp = temp.getSiguiente();
                            pos--;
                    }
                    nuevo.setSiguiente(temp.getSiguiente());
                    temp.setSiguiente(nuevo);
                }
            }
        }
    }
    
    public void clear(){
        inicio = null;
        fin = null;
    }
    
    public void delete(int pos) throws Exception{
        //LISTA ESTA VACÍA
        if(isEmpty()){
            throw new Exception("La lista está vacía.");
        }
        
        int tama = size();
        if((pos<0) || (pos>= tama)){
            throw new Exception("La ´posición es inválida");
        }
        
        if(tama == 1){ // SÓLO HAY UN NODO
            clear();
        }else{  //  MUCHOS NODOS
            if(pos == 0){   //  BORRAR EL PRIMER NODO
                inicio = inicio.getSiguiente();
            }else{
                Nodo temp = inicio;
                while(pos-1 != 0){
                        temp = temp.getSiguiente();
                        pos--;
                }
                temp.setSiguiente(temp.getSiguiente().getSiguiente());
                if(pos == (tama-1))
                   fin = temp;
            }
        }
    }
    
    
    public int getAt(int pos){
        //VERIFICAR si no hay nodos, si pos no es válido
        int iCont = 0;
        Nodo temp = inicio;
        while(iCont < pos){
            temp = temp.getSiguiente();
            iCont++;
        }
        return temp.getValor();
    }
    public void setAt(int pos, int val){
        //VERIFICAR si no hay nodos, si pos no es válido
        int iCont = 0;
        Nodo temp = inicio;
        while(iCont < pos){
            temp = temp.getSiguiente();
            iCont++;
        }
        temp.setValor(val);
        //return temp.getValor();
    }
    
    
}
