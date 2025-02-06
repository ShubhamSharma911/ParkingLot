package repositories;

import models.Vehicle;
import models.VehicleType;

import java.util.Map;
import java.util.TreeMap;

public class VehicleRepositoryImpl implements VehicleRepository {

    private Map<Integer, Vehicle> map;

    public VehicleRepositoryImpl() {
        map = new TreeMap<>();
    }

    @Override
    public Vehicle createOrGet(String registrationNumber, VehicleType type) {

        for(Map.Entry<Integer, Vehicle> entry : map.entrySet()){
            Vehicle vehicle = entry.getValue();

            if(vehicle.getRegistrationNumber().equals(registrationNumber)){
                return vehicle;
            }
        }

        Vehicle vehicle = new Vehicle();
        vehicle.setRegistrationNumber(registrationNumber);
        vehicle.setVehicleType(type);
        vehicle.setId(map.size()+1);
        map.put(vehicle.getId(), vehicle);
        return vehicle;
    }
}
