package services;

import models.Ticket;
import models.Vehicle;
import models.VehicleType;

public class TicketServiceImpl implements TicketService {

    private VehicleService vehicleService;

    public TicketServiceImpl(VehicleService vehicleService) {
        this.vehicleService = vehicleService;
    }
    @Override
    public Ticket generateTicket(String resitration, int gateId, VehicleType type) {
        /*
            Step #1: create or get a vehicle
            Step #2: get the parkinglot object via gateid
            Step #3: Find the spot for parking
            Step #4: throw exception of no spot if found
            Step #5: else assign the spot to the vehicle
            Step #6: Create the ticket and return it
        */
        // Imple #1;

        Vehicle vehicle = vehicleService.createOrGet(resitration, type);

        return null;
    }
}
