package Code;

import java.io.Serializable;

public class Member implements Serializable {
    private String id;
    private String name;
    private String phoneNumber;
    private String email;

    Member(){
        this.id = null;
        this.name = null;
        this.phoneNumber = null;
        this.email = null;
    }

    Member(String id, String name, String phoneNumber, String email){
        this.id = id;
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.email = email;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getEmail() {
        return email;
    }
}
