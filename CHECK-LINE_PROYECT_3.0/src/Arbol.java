/**
 *
 * @author Luis Santillanes
 */
public class Arbol {
    
    private NodoArbol root;
    private String resultado = "";

    public Arbol() {
        root = null;
    }
    
    public void agregarNodo(NodoArbol nuevo){
        agregarNodoRec(root, nuevo);
    }
    private void agregarNodoRec(NodoArbol actual, NodoArbol nuevo){
        if(root == null){//ARBOL VACÍO
            root = nuevo;
        }else{
            if(nuevo.getValor().getTime() > actual.getValor().getTime()){//MAYOR --> DERECHA
                if(actual.getDer() == null)//ESTÁ VACÍO
                    actual.setDer(nuevo);
                else//YA HAY UN NODO
                    agregarNodoRec(actual.getDer(), nuevo);
            }else if(nuevo.getValor().getTime() < actual.getValor().getTime()){//MENOR --> iZQUIERDA
                if(actual.getIzq() == null)
                    actual.setIzq(nuevo);
                else
                    agregarNodoRec(actual.getIzq(), nuevo);
            }else{//EL VALOR YA EXISTE
                System.out.println("UPS! YA EXISTE EL VALOR");
            }
        }
    }
    
    public void imprimepostOrder(){
        postOrder(root);
    }
    private void postOrder(NodoArbol actual){
        if(actual != null){
            //LEER IZQUIERDA
            postOrder(actual.getIzq());
            //LEER DERECHA
            postOrder(actual.getDer());
            //IMPRIMIR
            System.out.print(actual.getValor()+" - ");
        }
    }
    
    
    
    public void imprimePreOrder(){
        PreOrder(root);
    }
    private void PreOrder(NodoArbol actual){
        if(actual != null){
            //IMPRIMIR
            System.out.print(actual.getValor()+" - ");
            //LEER IZQUIERDA
            PreOrder(actual.getIzq());
            //LEER DERECHA
            PreOrder(actual.getDer());
        }
    }
    
    
    
    public void imprimeInOrder(){
        String resu = "";
        System.out.println(InOrder(root, resu));
        
    }
    private String InOrder(NodoArbol actual, String cade){
        if(actual != null){
            //LEER IZQUIERDA
            InOrder(actual.getIzq(), cade);
            //IMPRIMIR
            cade += actual.getValor()+"\n";
            //LEER DERECHA
            InOrder(actual.getDer(), cade);
        }
        return cade;
    }

    public String getResultado() {
        return resultado;
    }

    public void setResultado(String resultado) {
        this.resultado = resultado;
    }
    
}