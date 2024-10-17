public class Customer extends User {
    private boolean verification_status = false;

    public Customer(int user_id, String password, String name, int age, String email_id, String doc) {
        super(user_id, password, name, age, email_id, doc);
    }

    public boolean getVerificationStatus() {
        return verification_status;
    }

    public void setVerificationStatus(boolean verification_status) {
        this.verification_status = verification_status;
    }

    public void applyVerification(String doc) {
        if (doc.toLowerCase().endsWith(".jpg") || doc.toLowerCase().endsWith(".png")
                || doc.toLowerCase().endsWith(".pdf")) {
            System.out.println("Verification applied with document: " + doc);
        } else {
            System.out.println("Please provide a valid document for verification.");
        }
    }
}
