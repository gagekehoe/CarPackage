package carPack;

public class GasolineCar
{
	int tankCapacity = 0; //in gallons
  
  public GasolineCar(String brand, String powerSource, int year, String licensePlate,int tankCapacity)
  {
      super();
      this.tankCapacity = tankCapacity;
      
      
  }
  
  public void refillEnergy()
  {
      System.out.println("Don't forget to fill your tank! " + "Your max capacity is " + tankCapacity + "gallons.");
  }

  public int compareTo(Object t) {
      throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
  }
}
