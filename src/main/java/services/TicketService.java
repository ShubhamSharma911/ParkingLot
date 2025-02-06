package services;

import models.Ticket;
import models.Vehicle;
import models.VehicleType;

public interface TicketService {
    public Ticket generateTicket(String resitration, int gateId, VehicleType type);
}
