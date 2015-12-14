package carPack;

public class ElectricCar
{
	int amps = 0; //power to battery
  
  ElectricCar(String brand, String powerSource,int year, String licensePlate, int amps)
  {
      super();
      this.amps = amps;
  }
  
  public void refillEnergy()
  {
      System.out.println("With an electric car you do not need gas. " +
              "Make sure to charge your battery so you can get the full amp output of " + amps + ".");
  }

  public int compareTo(Object t) {
      throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
  }
}
