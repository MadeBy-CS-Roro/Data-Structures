public abstract class Ride<T> implements IRide{
    protected String pickupLocation;
    protected DateTime pickupTime;
    protected String dropoffLocation;
    protected DateTime dropoffTime;
    protected Driver driver;
    protected int rideID;

    public Ride (String PL, DateTime PT, String DL, DateTime DT, Driver D, int id){
        pickupLocation = PL;
        pickupTime = PT;
        dropoffLocation = DL;
        dropoffTime = DT;
        driver = D;
        rideID = id;
    }
    public int getRideId(){
        return rideID;
    }

	public String getPickupLocation(){
        return pickupLocation;
    }

	public void setPickupLocation(String pickupLocation){
        this.pickupLocation = pickupLocation;
    }

	public DateTime getPickupTime(){
        return pickupTime;
    }

	public DateTime getDropoffTime(){
        return dropoffTime;
    }

	public String getDropoffLocation(){
        return dropoffLocation;
    }

	public void setDropoffLocation(String dropoffLocation){
        this.dropoffLocation = dropoffLocation;
    }

	public Driver getDriver(){
        return driver;
    }

	public void setDriver(Driver driver){
        this.driver = driver;
    }

    public int compareTo(Ride<T> other){
        return 0;
    }

    public String toString(){
        return "Super toString holder" + dropoffLocation;
    }

    
}