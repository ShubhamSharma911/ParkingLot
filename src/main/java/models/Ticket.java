package models;

import java.util.Date;

public class Ticket {
    private int id;
    private Gate gate;
    private Date entryTime;
    private Vehicle vehicle;
    private Spot assignedSpot;
}
