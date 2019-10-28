/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uk.ac.tees.username.basic2;

import uk.ac.tees.username.basic1.*;
import java.util.ArrayList;

/**
 *
 * @author admin
 */
public class Squad extends Deployable{

    private ArrayList<Deployable> soldiers;

    public Squad() 
    {
        super(0);
        soldiers = new ArrayList<>();
    }
    
    public void add(Deployable soldier)
    {
        soldiers.add(soldier);
        str += soldier.getStrength();
    }
    
    public void remove(Deployable soldier)
    {
        soldiers.remove(soldier);
        str -= soldier.getStrength();
    }
    
}
