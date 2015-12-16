package carPack;
import java.util.ArrayList;
import java.util.Collection;

	/**
	 *
	 * @author Alexander
	 */
	public class CarDemo
	{   

	public static void main(String[] args)
	    {   
	        Civic =   new GasolineCar("Honda", "Gasoline",2015, "XY3234", 18)));
	        Fuze  =   new ElectricCar("Chevy", "Electric", 2015, "XI25803", 15)));
	        Optima =  new HybridCar("Kia", "Hybrid", 2015, "AF24346", 18, 15)));
	        Mustang = new GasolineCar("Ford", "Gasoline",2015, "76298374", 14)));
	        Tesla =   new ElectricCar("Tesla", "Electric", 2015, "TT23422", 18)));
	        Fusion =  new HybridCar("Ford", "Hybrid", 2015, "FF23224", 18, 15)));

	       
	    }

	    void refillEnergy() {
	        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
	    }

	    public int compareTo(Object t) {
	        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
	    }

}
