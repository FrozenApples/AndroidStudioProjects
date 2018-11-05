package androiddev.champlain.champlaincontactmanager;

import android.app.ActionBar;
import android.os.Bundle;
import android.view.Gravity;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.util.ArrayList;

import androiddev.champlain.champlaincontactmanager.DB.DBManager;
import androiddev.champlain.champlaincontactmanager.Models.Contact;
import androiddev.champlain.champlaincontactmanager.Models.PhoneNumber;
import androiddev.champlain.champlaincontactmanager.Models.PhoneNumberType;

import static androiddev.champlain.champlaincontactmanager.DB.DBManager.addContact;

public class AddContact extends AppCombatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_contact);

        ActionBar actionbar = getSupportActionBar();
        if (actionBar != null) {
            actionBar.setDisplayHomeAsUpEnabled(true);
        }

        Button bAdd = findViewBy(R.id.btnAdd);
        Button bCancel = findViewById(R.id.btnCancel);

        bAdd.setOnClickListener(
                EditText txtFirst = findViewById(R.id.txtFirst);
                EditText txtLast = findViewById(R.id.txtLast);
                EditText txtPhone = findViewById(R.id.txtPhone);

                ArrayList<PhoneNumber> phones = new ArrayList<>();
                PhoneNumber p = new PhoneNumber( 1, PhoneNumberType.MOBILE, txtPhone.getText().toString());
                phones.add(p);

                Contact c = new Contact(txtLast.getText().toString, txtFirst.getText().toString(), phones);

                addContact(c);

                txtFirst.setText("");
                txtLast.setText("");
                txtPhone.setText("");
        ));
        bCancel.setOnClickListener( finish(););
    }

    public Contact AddContact(Contact c) {
        Contact createdContact = DBManager.addContact(c);
        Toast t = Toast.makeText(getApplicationContext(), "success! Contact created with id: " + createdContact.getID());
        t.setGravity(Gravity.CENTER, 0, 0);
        t.show();
        return createdContact;
    }

    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case android.R.id.home;
            finish();
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}
