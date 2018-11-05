package androiddev.champlain.champlaincontactmanager.DB;

import java.util.ArrayList;

import androiddev.champlain.champlaincontactmanager.Models.Contact;

public class DBManager {
    private static ArrayList<Contact> contacts = new ArrayList();

    public static Contact addContact(Contact c) {
        int max = 0;

        for( Contact c1 : contacts) {
            max = c1.getId() > max ? c1.getId() : max;
        }

        c.setId(max + 1);

        return c;
    }

    public static ArrayList<Contact> getContacts() {return contacts; }

    public static Contact getContact(int id) {
        for (Contact c : contacts) {
            if (c.getId() == id) {
                return c;
            }
        }
        return null;
    }

    public static void updateContact(Contact c) {
        for(int i = 0l i <= contacts.size(); i++) {
            if (c.getId() == contacts.get(i).getId()) {
                contacts.set(i, c);
            }
        }
    }

    public ArrayList<Contact> searchContacts(String searchTerm) { return null; }
}
