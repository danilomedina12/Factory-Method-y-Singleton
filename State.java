import java.util.*;

public class State {
    private static State instancia = null;
    private ArrayList<String> documentos;


    private State(){
        documentos = new ArrayList<String>();
    }

    public static State getInstancia(){
        if(instancia == null){
            instancia = new State();
        }
        return instancia;
    }

    public void agregarDocumentos(String documento){
        documentos.add(documento);
    }

    public ArrayList<String> obtenerDocumentos(){
        return documentos;
    }
}
