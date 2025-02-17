package models;

import java.util.List;

public class Floors {
    private int id;
    private List<Spot> spots;
    private List<Gate> gates;
    private FloorStatus status;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public List<Gate> getGates() {
        return gates;
    }

    public void setGates(List<Gate> gates) {
        this.gates = gates;
    }

    public List<Spot> getSpots() {
        return spots;
    }

    public void setSpots(List<Spot> spots) {
        this.spots = spots;
    }

    public FloorStatus getStatus() {
        return status;
    }

    public void setStatus(FloorStatus status) {
        this.status = status;
    }
}
