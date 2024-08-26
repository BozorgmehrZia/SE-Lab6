package graph;

public interface EdgeState {
    public boolean isDirected();
    public void togglingDirections(Graph graph);
}
