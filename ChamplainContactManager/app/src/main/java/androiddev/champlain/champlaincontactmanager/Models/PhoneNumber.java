package androiddev.champlain.champlaincontactmanager.Models;

public class PhoneNumber {

    private int id;
    private PhoneNumberType phoneNumberType;
    private int contactID;
    private String phoneNumber;

    public PhoneNumber(int id, PhoneNumberType phoneNumberType, int contactID, String phoneNumber) {
        this.id = id;
        this.phoneNumberType = phoneNumberType;
        this.contactID = contactID;
        this.phoneNumber = phoneNumber;
    }

    public void setId(int id) { this.id = id; }

    public PhoneNumberType getPhoneNumberType() { return phoneNumberType; }

    public void setPhoneNumberType(PhoneNumberType phoneNumberType) {
        this.phoneNumberType = phoneNumberType;
    }
    public String getPhoneNumber() { return phoneNumber; }

    public void setPhoneNumber(String phoneNumber) { this.phoneNumber = phoneNumber; }

    public boolean search(String searchString) {
        if (this.getPhoneNumber().contains(searchString)) {
            return true;
        }
        return false;
    }
}
