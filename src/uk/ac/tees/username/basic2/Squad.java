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
public class Squad implements Deployable{

    private ArrayList<Deployable> soldiers;

    public Squad() 
    {
        soldiers = new ArrayList<>();
    }
    
    @Override
    public int getStrength() {
        int str = 0;
        for(Deployable soldier : soldiers)
        {
            str += soldier.getStrength();
        }
        return str;
    }
    
    public void add(Deployable soldier)
    {
        soldiers.add(soldier);
    }
    
    public void remove(Deployable soldier)
    {
        soldiers.remove(soldier);
    }
    
}
