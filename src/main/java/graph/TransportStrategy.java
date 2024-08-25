package graph;

import graph.Node;

public interface TransportStrategy {
    int calculateDistance(Node fromCity, Node toCity, Node hated, Graph graph);
}
