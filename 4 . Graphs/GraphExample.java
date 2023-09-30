import java.util.*;

public class GraphExample {
    private Map<Integer, List<Integer>> adjacencyList;

    public GraphExample() {
        adjacencyList = new HashMap<>();
    }

    public void addVertex(int vertex) {
        adjacencyList.put(vertex, new ArrayList<>());
    }

    public void addEdge(int source, int destination) {
        if (!adjacencyList.containsKey(source)) {
            addVertex(source);
        }
        if (!adjacencyList.containsKey(destination)) {
            addVertex(destination);
        }
        adjacencyList.get(source).add(destination);
        adjacencyList.get(destination).add(source); // For an undirected graph
    }

    public List<Integer> getNeighbors(int vertex) {
        return adjacencyList.get(vertex);
    }

    public static void main(String[] args) {
        GraphExample graph = new GraphExample();

        // Adding vertices
        graph.addVertex(0);
        graph.addVertex(1);
        graph.addVertex(2);
        graph.addVertex(3);

        // Adding edges
        graph.addEdge(0, 1);
        graph.addEdge(0, 2);
        graph.addEdge(1, 2);
        graph.addEdge(2, 3);

        // Get neighbors of a vertex
        int vertex = 2;
        List<Integer> neighbors = graph.getNeighbors(vertex);

        System.out.println("Neighbors of vertex " + vertex + ": " + neighbors);
    }
}
