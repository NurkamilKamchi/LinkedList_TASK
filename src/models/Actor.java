package models;

public class Actor {
    private String fullname;
    private String role;

    public Actor() {
    }

    public Actor(String fullname, String role) {
        this.fullname = fullname;
        this.role = role;
    }

    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    @Override
    public String toString() {
        return "Actor:  " +
                "\n Fullname: " + fullname +
                "\n Role: " + role +"\n";
    }
}
