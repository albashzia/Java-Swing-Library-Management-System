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
}
