/**
 * A set of tests to check the solution to the STANDARD task.
 *
 * Based on work created by Mark Truran </p>
 */

package uk.ac.tees.username.standard;

import org.junit.Test;
import static org.junit.Assert.*;


public class VehicleAdapterTest
{  
    /**
     * Test of getOrigin method, of class VehicleAdapter.
     */
    @Test
    public void testGetOrigin()
    {
        final int capacity = 180;
        final int emptySeats = 6;
        final Vehicle vehicle = new HL777b("BERLIN-NICE", capacity, emptySeats);
        final Plane plane = new VehicleAdapter(vehicle);
        assertEquals(plane.getOrigin(), "berlin");
        System.out.println("Origin test OK");
    }

    /**
     * Test of getDestination method, of class VehicleAdapter.
     */
    @Test
    public void testGetDestination()
    {
        final int capacity = 180;
        final int emptySeats = 6;
        final Vehicle vehicle = new HL777b("BERLIN-NICE", capacity, emptySeats);
        final Plane plane = new VehicleAdapter(vehicle);
        assertEquals(plane.getDestination(), "nice");
        System.out.println("Destination test OK");
    }

    /**
     * Test of getPassengerCount method, of class VehicleAdapter.
     */
    @Test
    public void testGetPassengerCount()
    {
        final int capacity = 180;
        final int emptySeats = 6;
        final int expectedPassengers = 174;
        final Vehicle vehicle = new HL777b("BERLIN-NICE", capacity, emptySeats);
        final Plane plane = new VehicleAdapter(vehicle);
        assertEquals(plane.getPassengerCount(), expectedPassengers);
        System.out.println("Passenger test OK");
    }
    
    /**
     * Side by side test, Plane object and VehicleAdpater.
     */
    @Test
    public void testSideBySide()
    {
        final int passengers = 121;
        final Plane plane = new EF747("swansea", "scunthorpe", passengers); 
        final int capacity = 130;
        final int emptySeats = 9;
        final Vehicle vehicle = new HL777b("SWANSEA-SCUNTHORPE", capacity, emptySeats);
        final Plane adapted = new VehicleAdapter(vehicle); 
        assertEquals(plane.getOrigin(), adapted.getOrigin());
        assertEquals(plane.getDestination(), adapted.getDestination());
        assertEquals(plane.getPassengerCount(), adapted.getPassengerCount());
        System.out.println("Side by side test OK");
    }
}
