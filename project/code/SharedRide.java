public class SharedRide extends Ride{
    String[] riders;

    public SharedRide(String PL, DateTime PT, String DL, DateTime DT, Driver D, int id){
        super(PL, PT, DL, DT, D, id);
        riders = new String[5];
    }

    public boolean hasRider(int riderId){
        return false;
    }

	// Returns a formatted string describing the ride.
	@Override
	public String toString(){
        return super.toString() + " SharedRide toString holder";
    }

	// Compares rides alphabetically by pickup location.
	@Override
	public int compareTo(IRide other){
        return 0;
    }
}
