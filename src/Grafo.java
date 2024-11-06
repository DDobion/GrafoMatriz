import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Grafo {
    private List<List<Integer>> listaAdyacencia;

    
    public Grafo(int[][] matrizAdyacencia) {
        int vertices = matrizAdyacencia.length;
        listaAdyacencia = new ArrayList<>();

        
        for (int i = 0; i < vertices; i++) {
            listaAdyacencia.add(new LinkedList<>());
            for (int j = 0; j < vertices; j++) {
                if (matrizAdyacencia[i][j] != 0) {
                    listaAdyacencia.get(i).add(j); 
                }
            }
        }
    }


    public void imprimirGrafo() {
        for (int i = 0; i < listaAdyacencia.size(); i++) {
            System.out.print("Nodo " + i + " -> ");
            for (int j : listaAdyacencia.get(i)) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        
        int[][] matrizAdyacencia = {
            {0, 1, 1, 0},
            {1, 0, 1, 1},
            {1, 1, 0, 0},
            {0, 1, 0, 0}
        };

        Grafo grafo = new Grafo(matrizAdyacencia);
        grafo.imprimirGrafo();
    }
}
