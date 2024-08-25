package MiniJava.requestHandler;

import graph.TrainStrategy;
import graph.Graph;

public class GovernorRequestHandler {
    private Graph province;
    public GovernorRequestHandler(Graph province) {
        this.province = province;
    }

    public void setAllRoutesOneWay() {
        //TODO
    }

    public void setAllRoutesTwoWay() {
        // TODO:
    }

    public void changeTrainTimeUnit(TrainStrategy trainStrategy, int newTimeUnit) {
        trainStrategy.setTimeUnit(newTimeUnit);
    }
}
