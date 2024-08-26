import com.sun.tools.javac.util.List;
import graph.Edge;
import graph.Graph;
import graph.Node;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

public class GraphTest {
    Graph graph;
    Node city1;
    Node city2;
    @Before
    public void setup() {
        city1 = new Node();
        city2 = new Node();
        Edge.createEdge(city1, city2, false, 4);
        graph = new Graph(new ArrayList<>(List.of(city1, city2)));
    }

    @Test
    public void testBFS(){
        graph.bfs(city1, null);
        Assert.assertEquals(city1.getDistance(), 0);
        Assert.assertEquals(city2.getDistance(), 4);
    }

    @Test
    public void testDijkstra(){
        graph.dijkstra(city1, null);
        Assert.assertEquals(city1.getDistance(), 0);
        Assert.assertEquals(city2.getDistance(), 4);
    }

}
