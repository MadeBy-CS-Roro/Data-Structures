public class testRide {
    public static void main(String[] args) {
        DateTime pickupTime = new DateTime(2024, 6, 15, 10, 30);
        DateTime dropoffTime = new DateTime(2024, 6, 15, 11, 0);
        Driver driver = new Driver(123, "Jhon Doe", "555-1234", "ABC1234", VehicleType.SEDAN);
        Ride ride = new SharedRide("123 Main St", pickupTime, "456 Elm St", dropoffTime, driver, 1);

        System.out.println("Ride ID: " + ride.getRideId());
        System.out.println("Pickup Location: " + ride.getPickupLocation());
        System.out.println("Pickup Time: " + ride.getPickupTime().format());
        System.out.println("Dropoff Location: " + ride.getDropoffLocation());
        System.out.println("Dropoff Time: " + ride.getDropoffTime().format());
        System.out.println("Driver: " + ride.getDriver().getName());
    }
}