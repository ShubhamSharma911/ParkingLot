package services;

import models.Vehicle;
import models.VehicleType;

public interface VehicleService {
    public Vehicle createOrGet(String registrationNo, VehicleType type);
}
