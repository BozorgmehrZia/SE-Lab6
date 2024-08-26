package graph;

import java.util.ArrayList;

public class NonDirectionalState implements EdgeState {
    @Override
    public boolean isDirected() {
        return false;
    }

    @Override
    public void togglingDirections(Graph graph) {
        ArrayList<Node> nodes = graph.getGraph();
        for (Node node : nodes) {
            ArrayList<Edge> edges = node.getEdges();
            for (Edge edge : edges) {
                edge.setEdgeState(new NonDirectionalState());
            }
        }
    }

}
