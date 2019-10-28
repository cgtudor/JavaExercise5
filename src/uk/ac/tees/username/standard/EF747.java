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
public class EF747 implements Plane{
    String origin, destination;
    int pc;

    public EF747(String origin, String destination, int pc) {
        this.origin = origin;
        this.destination = destination;
        this.pc = pc;
    }
    
}
