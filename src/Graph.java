


import java.util.ArrayList;
import java.util.List;

class Edge { // class to store edges of the weighted graph

    int src;
    int dist;
    int weight;

    public Edge(int src, int dist, int weight) {
        this.src = src;
        this.dist = dist;
        this.weight = weight;

    }
}

public class Graph {
    List<List<Node>> adj_list = new ArrayList<>(); // adjacency list

    public Graph(List<Edge> edges) {
        for (int i = 0; i < edges.size(); i++)
            adj_list.add(i, new ArrayList<>());

        for (Edge e : edges) { // add edges to the graph
            adj_list.get(e.src).add(new Node(e.dist, e.weight));

        }

    }

    static class Node { // node of the adjacency list

        int value;
        int weight;

        public Node(int value, int weight) {
            this.value = value;
            this.weight = weight;
        }

    }

}
