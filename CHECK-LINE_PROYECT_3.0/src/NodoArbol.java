
import java.util.Date;

/**
 *
 * @author Luis Santillanes
 */
public class NodoArbol {
    
    private Date valor;
    private NodoArbol izq;
    private NodoArbol der;

    public NodoArbol() {
        this.izq = null;
        this.der = null;
    }

    public NodoArbol(Date valor) {
        this.valor = valor;
        this.izq = null;
        this.der = null;
    }
    
    
    public Date getValor() {
        return valor;
    }
    public void setValor(Date valor) {
        this.valor = valor;
    }

    public NodoArbol getIzq() {
        return izq;
    }

    public void setIzq(NodoArbol izq) {
        this.izq = izq;
    }

    public NodoArbol getDer() {
        return der;
    }

    public void setDer(NodoArbol der) {
        this.der = der;
    }

    
    
    
}
