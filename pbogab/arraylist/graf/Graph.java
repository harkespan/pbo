package arraylist.graf;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Graph {
    private Map<String, List<String>> adjacencyList;

    public Graph() {
        adjacencyList = new HashMap<>();
    }

    public void addVertex(String vertex) {
        if (!adjacencyList.containsKey(vertex)) {
            adjacencyList.put(vertex, new ArrayList<>());
        }
    }

    public void addEdge(String vertex1, String vertex2) {
        if (!adjacencyList.containsKey(vertex1)) {
            addVertex(vertex1);
        }
        if (!adjacencyList.containsKey(vertex2)) {
            addVertex(vertex2);
        }
        adjacencyList.get(vertex1).add(vertex2);
        adjacencyList.get(vertex2).add(vertex1);
    }

    public List<String> getFriends(String vertex) {
        return adjacencyList.get(vertex);
    }
}
