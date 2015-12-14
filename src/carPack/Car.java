package carPack;

	public abstract class Car implements Comparable<Object>
	{
	    protected String brand = null;
	    protected String powerSource = null;
	    protected int year = 0;
	    protected String licensePlate = null;
	    protected String str=null;
	    
	    Car(String brand, String powerSource, int year, String licensePlate)
	    {
	        this.brand = brand;
	        this.powerSource = powerSource;
	        this.year = year;
	        this.licensePlate = licensePlate;
	        
	    }

	    public String getBrand() {                            //START OF SETTERS AND GETTERS
	        return brand;
	    }

	    public void setBrand(String brand) {
	        this.brand = brand;
	    }

	    public String getPowerSource() {
	        return powerSource;
	    }

	    public void setPowerSource(String powerSource) {
	        this.powerSource = powerSource;
	    }
	 
	    public int getYear() {
	        return year;
	    }

	    public void setYear(int year) {
	        this.year = year;
	    }
	    
	    public String getLicensePlate() {
	        return licensePlate;
	    }

	    public void setLicensePlate(String licensePlate) {
	        this.licensePlate = licensePlate;
	    }                                                            //END SETTERS AND GETTERS
	    
	    public String toString()
	    {
	        return str;
	    }
	    
	    public boolean equals()
	    {
	        
	        return true;
	    }

	    
	   abstract void refillEnergy();                           //ABSTRACT REFILL ENERGY, I thought these do not contain content in them??
	    
	    
	    
	}

