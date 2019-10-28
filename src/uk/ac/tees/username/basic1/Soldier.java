/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uk.ac.tees.username.basic1;

/**
 *
 * @author admin
 */
public class Soldier implements Deployable{

    private final int strength = 1;

    public Soldier() 
    {
        
    }
    
    @Override
    public int getStrength() {
        return strength;
    }
    
}
