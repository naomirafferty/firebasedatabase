package com.example.week7adv;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class MainActivity extends AppCompatActivity {

    EditText editTextName;
    EditText editTextEmailAddress;
    EditText editTextPassword;
    EditText editTextPhoneNo;
    EditText editTextAddress;
    EditText editTextCity;
    EditText editTextPostcode;
    EditText editTextDOB;
    Button buttonRegister;


    DatabaseReference databaseUsers;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        databaseUsers = FirebaseDatabase.getInstance().getReference("user");

        editTextName = (EditText) findViewById(R.id.editTextName);
        editTextEmailAddress = (EditText) findViewById(R.id.editTextEmailAddress);
        editTextPassword = (EditText) findViewById(R.id.editTextPassword);
        editTextPhoneNo = (EditText) findViewById(R.id.editTextPhoneNo);
        editTextAddress = (EditText) findViewById(R.id.editTextAddress);
        editTextCity = (EditText) findViewById(R.id.editTextCity);
        editTextPostcode = (EditText) findViewById(R.id.editTextPostcode);
        editTextDOB = (EditText) findViewById(R.id.editTextDOB);
        buttonRegister = (Button) findViewById(R.id.buttonRegister);


        buttonRegister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                addUser();
            }
        });
    }

    private void addUser() {
        String name = editTextName.getText().toString().trim();
        String email = editTextEmailAddress.getText().toString().trim();
        String password = editTextPassword.getText().toString().trim();
        String phonenumber = editTextPhoneNo.getText().toString().trim();
        String address = editTextAddress.getText().toString().trim();
        String city = editTextCity.getText().toString().trim();
        String postcode = editTextPostcode.getText().toString().trim();
        String dob = editTextDOB.getText().toString().trim();


        if(!TextUtils.isEmpty(name) || !TextUtils.isEmpty(email) || !TextUtils.isEmpty(password)
                || !TextUtils.isEmpty(phonenumber) || !TextUtils.isEmpty(address)
                || !TextUtils.isEmpty(city) || !TextUtils.isEmpty(postcode)
                || !TextUtils.isEmpty(dob)) {

            String id = databaseUsers.push().getKey();

            User user = new User(id, name, email, password, phonenumber, address, city, postcode, dob);

            databaseUsers.child(id).setValue(user);

            Toast.makeText(this, "You are now registered!", Toast.LENGTH_LONG).show();
        }
        else{
            Toast.makeText(this, "Don't leave any fields empty", Toast.LENGTH_LONG).show();
        }
    }
}
