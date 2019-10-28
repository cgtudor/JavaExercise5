/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uk.ac.tees.username.standard;

/**
 *
 * @author admin
 */
public class VehicleAdapter implements Plane{

    Vehicle vehicle;

    public VehicleAdapter(Vehicle vehicle) {
        this.vehicle = vehicle;
    }
    
    
    
    @Override
    public String getDestination() {
        return vehicle.getPlan().substring(vehicle.getPlan().indexOf('-') + 1).toLowerCase();
    }

    @Override
    public String getOrigin() {
        return vehicle.getPlan().substring(0, vehicle.getPlan().indexOf('-')).toLowerCase();
    }

    @Override
    public int getPassengerCount() {
        return vehicle.getCapacity() - vehicle.getEmpty();
    }
    
}
