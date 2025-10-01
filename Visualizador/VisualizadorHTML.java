package Visualizador;

import Documento.*;

public class VisualizadorHTML extends Visualizador{

    protected Documento crearDocumento(){
        return new DocumentoHTML();
    }

}
