
package model;

public class User {
    private String cprnr;
    private String firstName;
    private String lastName;

    public User(String cprnr, String firstName, String lastName) {
        this.cprnr = cprnr;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getCprnr() {
        return cprnr;
    }

    public void setCprnr(String cprnr) {
        this.cprnr = cprnr;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    
    
}
