import Visualizador.*;

public class Main {
    public static void main(String[] args) {

        // creamos visualizadores y documentos 

        VisualizadorPDF visualizadorPDF = new VisualizadorPDF();
        VisualizadorODT visualizadorODT = new VisualizadorODT();
        VisualizadorHTML visualizadorHTML = new VisualizadorHTML();

        visualizadorPDF.visualizar();
        System.out.println("-------------------------------------");
        visualizadorODT.visualizar();
        System.out.println("-------------------------------------");
        visualizadorHTML.visualizar();

        // lo de state
        State state = State.getInstancia();
        state.agregarDocumentos("Se visualizó un PDF");
        state.agregarDocumentos("Se visualizó un ODT");
        state.agregarDocumentos("Se visualizó un HTML");
        System.out.println("Historial de acciones:");
        for(String s : state.obtenerDocumentos()){
            System.out.println("- " + s);
        }
    }
}
