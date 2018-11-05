package androiddev.champlain.champlaincontactmanager;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Add button
        Button b = findViewById(R.id.btnAddContact);
        b.setOnClickListener(
                Intent i = new Intent(getApplicationContext(), AddContact.class);
                startActivity(i);
        );

        RecyclerView r
    }
}
