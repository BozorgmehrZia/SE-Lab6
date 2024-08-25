package graph;

import lombok.Setter;
import org.javatuples.Pair;

import lombok.Getter;

public class Edge {
    @Getter
    private final Pair<Node, Node> nodes;
    @Setter
    @Getter
    private final int weight;
    @Getter
    @Setter
    private EdgeState edgeState;

    private Edge(Node a, Node b, boolean directed, int weight) {
        if (directed){
            edgeState = new DirectionalState();
        }else {
            edgeState = new NonDirectionalState();
        }
        nodes = new Pair<Node, Node>(a, b);
        this.weight = weight;
    }

    public static void createEdge(Node a, Node b, boolean directed, int weight) {
        Edge newEdge = new Edge(a, b, directed, weight);
        if (directed){
            a.getEdges().add(newEdge);
            b.getEdges().add(newEdge);
        }else {
            a.getEdges().add(newEdge);
        }

    }

    public boolean isDirected(){
        return edgeState.isDirected();
    }

    public void setDirection(boolean directed){
        if (directed){
            this.edgeState = new DirectionalState();
        }else {
            this.edgeState = new NonDirectionalState();
        }
    }

}
