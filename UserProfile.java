public class UserProfile {
    private int user_id;
    private String password;
    private String name;
    private int age;
    private String email_id;
    private String doc; 

    public UserProfile(int user_id, String password, String name, int age, String email_id, String doc) {
        this.user_id = user_id;
        this.password = password;
        this.name = name;
        this.age = age;
        this.email_id = email_id;
        this.doc = doc;
    }

    public int getUserId() {
        return user_id;
    }

    public void setUserId(int user_id) {
        this.user_id = user_id;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getEmail() {
        return email_id;
    }

    public void setEmail(String email_id) {
        this.email_id = email_id;
    }

    public void editProfile(String name, int age, String email_id) {
        this.name = name;
        this.age = age;
        this.email_id = email_id;
    }

    public void showDocuments() {
        if (doc != null) {
            System.out.println("Documents: " + doc);
        } else {
            System.out.println("Documents not found");   
        }
    }
}
