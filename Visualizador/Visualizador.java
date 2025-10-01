package Visualizador;

import Documento.*;

public abstract class Visualizador {

    protected Documento documento;

    protected abstract Documento crearDocumento();

    public void visualizar(){
        abrir();
        mostrar();
        cerrar();
    }
    public void abrir(){
        documento =  crearDocumento();
        documento.abrir();
    }

    public void cerrar(){
        if(documento != null) documento.cerrar();
    }

    public void mostrar(){
        if (documento != null) documento.mostrar();
    }
    
}
