public class User extends UserProfile {
    
    public User(int user_id, String password, String name, int age, String email_id, String doc) {
        super(user_id, password, name, age, email_id, doc);
    }

    public boolean logIn(int user_id, String password) {
        if (this.getUserId() == user_id && this.getPassword().equals(password)) {
            System.out.println("Login successful.");
            System.out.println("Welcome, " + getName());
            return true;
        } else {
            System.out.println("Invalid Login.");
            return false;
        }
    }

    public void recoverPassword() {
        System.out.println("Password recovery process initiated.");
    }

    public void logOut() {
        System.out.println("Logged out.");
    }
}
