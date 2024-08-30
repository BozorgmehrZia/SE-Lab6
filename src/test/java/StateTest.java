import graph.*;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class StateTest {
    Graph graph;
    Node city1;
    Node city2;
    @Before
    public void setup() {
        city1 = new Node();
        city2 = new Node();
        Edge.createEdge(city1, city2, false, 3);
        graph = new Graph(new ArrayList<>(List.of(city1, city2)));
    }

    @Test
    public void testTogglingToDirectional(){
        DirectionalState directionalState = new DirectionalState();
        directionalState.togglingDirections(graph);
        Assert.assertTrue(city1.getEdges().get(0).isDirected());
    }

    @Test
    public void testTogglingToNonDirectional(){
        NonDirectionalState nonDirectionalState = new NonDirectionalState();
        nonDirectionalState.togglingDirections(graph);
        Assert.assertFalse(city1.getEdges().get(0).isDirected());
    }
}
