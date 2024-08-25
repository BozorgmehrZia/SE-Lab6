package MiniJava.requestHandler;

import graph.Graph;
import graph.Node;

public class CitizenRequestHandler {
    private Graph province;
    public CitizenRequestHandler(Graph province) {
        this.province = province;
    }

    public int getTimeByTrain(Node fromCity, Node toCity) {
        //TODO:
        return 0;
    }

    public int getTimeByBus(Node fromCity, Node toCity) {
        //TODO:
        return 0;
    }

    public String getFasterTransport(Node fromCity, Node toCity) {
        //TODO:
        return "";
//        int trainTime = getTimeByTrain(from, to, trainTimeUnit);
//        int busTime = getTimeByBus(from, to);
//
//        return trainTime <= busTime ? "Train" : "Bus";
    }

    public boolean canAvoidCity(Node fromCity, Node toCity, Node avoid) {
        // Implement BFS/DFS considering `avoid` city
//        return !from.getAdjacentCities().contains(avoid);
        //TODO:
        return true;
    }
}
