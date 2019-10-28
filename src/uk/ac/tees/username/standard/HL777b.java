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
public class HL777b implements Vehicle{
    String flightPlan;
    int capacity, empty;

    public HL777b(String flightPlan, int capacity, int empty) {
        this.flightPlan = flightPlan;
        this.capacity = capacity;
        this.empty = empty;
    }

    @Override
    public String getPlan() {
        return flightPlan;
    }

    @Override
    public int getCapacity() {
        return capacity;
    }

    @Override
    public int getEmpty() {
        return empty;
    }
    
}
