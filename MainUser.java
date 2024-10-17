import java.util.Scanner;

public class MainUser {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("User Creation");
        System.out.print("Enter user ID: ");
        int userId = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter password: ");
        String password = sc.nextLine();
        System.out.print("Enter name: ");
        String name = sc.nextLine();
        System.out.print("Enter age: ");
        int age = sc.nextInt();
        sc.nextLine(); 
        System.out.print("Enter email: ");
        String email = sc.nextLine();
        System.out.print("Enter document type (jpg/png/pdf): ");
        String doc = sc.nextLine();
        System.out.println("===========================================");
        
        UserProfile userProfile = new UserProfile(userId, password, name, age, email, doc);
        User user = new User(userId, password, name, age, email, doc);
        Customer customer = new Customer(userId, password, name, age, email, doc);
        Admin admin = new Admin(2, "admin123", "Luthfi", 20, "lutfi.mahardika17@gmail.com", "word");
        System.out.println("User Created Successfully.");
        sc.nextLine();
 
        System.out.println("User Login");
        System.out.print("Enter user ID to login: ");
        int loginId = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter password to login: ");
        String loginPassword = sc.nextLine();
        user.logIn(loginId, loginPassword);
        user.logOut();
        sc.nextLine();

        System.out.println("Password Recovery");
        user.recoverPassword();
        System.out.println("===========================================");

        System.out.println("Customer Verification Process");
        System.out.print("Enter document name for verification: ");
        String verificationDoc = sc.nextLine();
        customer.applyVerification(verificationDoc);
        System.out.println("Customer verification status: " + customer.getVerificationStatus());
        System.out.println("===========================================");

        System.out.println("User Profile Management");
        System.out.print("Enter new name: ");
        String newName = sc.nextLine();
        System.out.print("Enter new age: ");
        int newAge = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter new email: ");
        String newEmail = sc.nextLine();
        userProfile.editProfile(newName, newAge, newEmail);
        userProfile.showDocuments();
        System.out.println("===========================================");

        System.out.println("Vehicle Management");
        System.out.print("Enter vehicle ID: ");
        int vehicleId = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter vehicle details: ");
        String vehicleDetails = sc.nextLine();
        admin.updateVehicleDetails(vehicleId, vehicleDetails);

        sc.close();
    }
}
