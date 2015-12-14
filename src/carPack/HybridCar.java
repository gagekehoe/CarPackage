package carPack;

public class HybridCar
{
	int tankCapacity = 0; //in gallons
  int amps = 0; //battery power
  
  HybridCar(String brand, String powerSource,int year, String licensePlate, int tankCapacity, int amps)
  {
      super();
      this.tankCapacity = tankCapacity;
      this.amps = amps;
  }

  void refillEnergy() {
      throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
  }

  public int compareTo(Object t) {
      throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
  }
}
