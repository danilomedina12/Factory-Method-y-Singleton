package Visualizador;

import Documento.*;

public class VisualizadorODT extends Visualizador {
    
    protected Documento crearDocumento(){
        return new DocumentoODT();
    }
}
