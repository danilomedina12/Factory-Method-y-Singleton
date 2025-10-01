package Visualizador;

import Documento.*;

public class VisualizadorPDF extends Visualizador {

    @Override
    protected Documento crearDocumento() {
       return new DocumentoPDF();
    }
    

    
}
