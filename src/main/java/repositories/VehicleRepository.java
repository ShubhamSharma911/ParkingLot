package repositories;

import models.Vehicle;
import models.VehicleType;

public interface VehicleRepository {
    public Vehicle createOrGet(String registrationNumber, VehicleType type);
}
