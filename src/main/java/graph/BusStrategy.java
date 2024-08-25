package graph;

public class BusStrategy implements TransportStrategy{

    @Override
    public int calculateDistance(Node fromCity, Node toCity, Node hated, Graph graph) {
        graph.dijkstra(fromCity, hated);
        return toCity.getDistance();
    }
}
