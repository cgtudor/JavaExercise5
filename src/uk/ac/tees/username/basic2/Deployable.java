/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uk.ac.tees.username.basic2;

import uk.ac.tees.username.basic1.*;

/**
 *
 * @author admin
 */
public abstract class Deployable {
    
    protected int str;

    public Deployable(int str) {
        this.str = str;
    }
    
    public int getStrength()
    {
        return str;
    }
    
    public boolean attack(Deployable sold)
    {
        return str >= sold.getStrength();
    }
}
