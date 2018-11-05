package androiddev.champlain.champlaincontactmanager.Models;

import java.util.List;

public class Contact {

    private int ID;
    private String FirstName;
    private String LastName;
    private List<PhoneNumber> PhoneNumber;

    public Contact(int ID, String firstName, String lastName, List<PhoneNumber> phoneNumber) {
        this.ID = ID;
        this.FirstName = firstName;
        this.LastName = lastName;
        this.PhoneNumber = phoneNumber;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getFirstName() {
        return FirstName;
    }

    public void setFirstName(String firstName) {
        FirstName = firstName;
    }

    public String getLastName() {
        return LastName;
    }

    public void setLastName(String lastName) {
        LastName = lastName;
    }

    public List<PhoneNumber> getPhoneNumber() {
        return PhoneNumber;
    }

    public void setPhoneNumber(List<PhoneNumber> phoneNumber) {
        PhoneNumber = phoneNumber;
    }
}