package services;

import models.Vehicle;
import models.VehicleType;
import repositories.VehicleRepository;

public class VehicleServiceImpl implements VehicleService {
    private VehicleRepository vehicleRepository;

    public VehicleServiceImpl(VehicleRepository vehicleRepository) {
        this.vehicleRepository = vehicleRepository;
    }


    @Override
    public Vehicle createOrGet(String registrationNo, VehicleType type) {
        return vehicleRepository.createOrGet(registrationNo, type);
    }

}
