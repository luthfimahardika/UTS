public class Admin extends User {
    
    public Admin(int user_id, String password, String name, int age, String email_id, String doc) {
        super(user_id, password, name, age, email_id, doc);
    }

    public void updateVehicleDetails(int vehicle_id, String details) {
        System.out.println("Vehicle details for ID " + vehicle_id + " updated " + details);
    }

    public void addVehicle(String vehicle) {
        System.out.println("New vehicle added." + vehicle);
    }

    public void retrieveComplaint() {
        System.out.println("Complaint retrieved.");
    }

    public void verifyUser(Customer customer) {
        customer.setVerificationStatus(true);
        System.out.println("User: " + customer.getName() + " has been verified.");
    }
}
