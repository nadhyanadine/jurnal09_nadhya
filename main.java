public class main {
    public static void main(String[] args) {
        AdjacencyList myList = new AdjacencyList(9);
        myList.addEdge('A', 'D');
        myList.addEdge('A', 'B');
        myList.addEdge('A', 'E');
        myList.addEdge('B', 'E');
        myList.addEdge('C', 'B');
        myList.addEdge('D', 'G');
        myList.addEdge('E', 'H');
        myList.addEdge('E', 'F');
        myList.addEdge('F', 'C');
        myList.addEdge('F', 'H');
        myList.addEdge('G', 'H');
        myList.addEdge('H', 'I');
        myList.addEdge('I', 'F');

        myList.printGraph();
    }
}