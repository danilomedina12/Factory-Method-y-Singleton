import java.util.*;
import Documento.*;

public class State {
    private static State instancia = null;
    private ArrayList<Documento> documentos;


    private State(){
        documentos = new ArrayList<Documento>();
    }

    public static State getInstancia(){
        if(instancia == null){
            instancia = new State();
        }
        return instancia;
    }

    public void agregarDocumentos(Documento documento){
        documentos.add(documento);
    }

    public ArrayList<Documento> obtenerDocumentos(){
        return documentos;
    }
}
