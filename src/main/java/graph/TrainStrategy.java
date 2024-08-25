package graph;

public class TrainStrategy implements TransportStrategy{
    private int timeUnit = 1;
    @Override
    public int calculateDistance(Node fromCity, Node toCity, Node hated, Graph graph) {
        graph.bfs(fromCity, hated);
        int finalTime = toCity.getDistance() * this.timeUnit;
        return finalTime;
    }

    public void setTimeUnit(int timeUnit) {
        this.timeUnit = timeUnit;
    }
}
