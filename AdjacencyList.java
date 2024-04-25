import java.util.LinkedList;

public class AdjacencyList {
    int V;
    LinkedList<Character> adjListArray[];

    AdjacencyList(int V) {
        this.V = 9;

        adjListArray = new LinkedList[V];

        for (int i = 0; i < 9; i++) {
            adjListArray[i] = new LinkedList<>();
        }
    }

    public void addEdge(char src, char dest) {

        adjListArray[src - 'A'].add(dest);
    }

    public void printGraph() {

        for (int i = 0; i < 9; i++) {
            if (adjListArray[i].size() > 0) {
                System.out.print("Vertex " + (char) (i + 'A') + " is connected to: ");
                for (int j = 0; j < adjListArray[i].size(); j++) {
                    System.out.print(adjListArray[i].get(j) + " ");
                }
                System.out.println();
            }
        }
    }
}