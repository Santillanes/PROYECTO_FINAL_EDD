/**
 *
 * @author 
 */
public class Nodo2 {
    
    private String valor;
    private Nodo2 siguiente;

    public Nodo2() {
        this.siguiente = null;
    }

    public Nodo2(String valor) {
        this.valor = valor;
        this.siguiente = null;
    }
    
    
    public String getValor() {
        return valor;
    }
    public void setValor(String valor) {
        this.valor = valor;
    }

    public Nodo2 getSiguiente() {
        return siguiente;
    }
    public void setSiguiente(Nodo2 siguiente) {
        this.siguiente = siguiente;
    }
    
}
