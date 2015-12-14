package carPack;
import java.util.ArrayList;
import java.util.Collection;

	/**
	 *
	 * @author Alexander
	 */
	public class CarDemo
	{   
	    
			static ArrayList<Car> CarCompare = new ArrayList<Car>();
	    
	    static GasolineCar Civic;
	    static ElectricCar Fuze;
	    static HybridCar Optima;
	    static GasolineCar Mustang;
	    static ElectricCar Tesla;
	    static HybridCar Fusion;          
	    
	    
	    @SuppressWarnings("unchecked")
			public static void main(String[] args)
	    {   
	        CarCompare.addAll((Collection<? extends Car>) (Civic =   new GasolineCar("Honda", "Gasoline",2015, "XY3234", 18)));
	        CarCompare.addAll((Collection<? extends Car>) (Fuze  =   new ElectricCar("Chevy", "Electric", 2015, "XI25803", 15)));
	        CarCompare.addAll((Collection<? extends Car>) (Optima =  new HybridCar("Kia", "Hybrid", 2015, "AF24346", 18, 15)));
	        CarCompare.addAll((Collection<? extends Car>) (Mustang = new GasolineCar("Ford", "Gasoline",2015, "76298374", 14)));
	        CarCompare.addAll((Collection<? extends Car>) (Tesla =   new ElectricCar("Tesla", "Electric", 2015, "TT23422", 18)));
	        CarCompare.addAll((Collection<? extends Car>) (Fusion =  new HybridCar("Ford", "Hybrid", 2015, "FF23224", 18, 15)));
	       
	      System.out.println(CarCompare); // Null is read out 6 times..
	       
	    }

	    void refillEnergy() {
	        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
	    }

	    public int compareTo(Object t) {
	        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
	    }

}
