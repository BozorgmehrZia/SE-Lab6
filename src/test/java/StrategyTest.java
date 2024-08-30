import graph.*;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class StrategyTest {
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
    public void testDirectionWithHatingCity1(){
        TrainStrategy trainStrategy = new TrainStrategy();
        int distance = trainStrategy.calculateDistance(city1, city2, city1, graph);

        Assert.assertEquals(distance, Integer.MAX_VALUE);
    }

    @Test
    public void testDirectionWithHatingCity2(){
        Node city3 = new Node();
        Edge.createEdge(city2, city3, false, 5);
        Edge.createEdge(city1, city3, false, 5);
        graph = new Graph(new ArrayList<>(List.of(city1, city2, city3)));
        BusStrategy busStrategy = new BusStrategy();
        int distance = busStrategy.calculateDistance(city1, city3, city2, graph);

        Assert.assertEquals(distance, 5);

    }

    @Test
    public void testFasterStrategyMustBeTrain(){
        TransportStrategy transportStrategy = graph.getFastestStrategy(city1, city2, 1);
        Assert.assertTrue(transportStrategy instanceof  TrainStrategy);
    }

    @Test
    public void testFasterStrategyMustBeBus(){
        TransportStrategy transportStrategy = graph.getFastestStrategy(city1, city2, 5);
        Assert.assertTrue(transportStrategy instanceof  BusStrategy);
    }

    @Test
    public void testBusStrategy(){
        BusStrategy busStrategy = new BusStrategy();
        int distance = busStrategy.calculateDistance(city1, city2,null ,graph);

        Assert.assertEquals(distance, 3);
    }

    @Test
    public void testTrainStrategy(){
        TrainStrategy trainStrategy = new TrainStrategy();
        int distance = trainStrategy.calculateDistance(city1, city2,null ,graph);

        Assert.assertEquals(distance, 1);
    }

}
