/* This will already be on the MainActivity if you were able to connect Firebase correctly, so no need to copy the imports.

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase; */

public class RegisterPaymentInfo extends AppCompatActivity { // change the class name if you have anything different

    //List all the features added to the XML layout
    EditText editText16DigitNo;
    EditText editTextExpirationDate;
    EditText editTextCVVCode;

    DatabaseReference databaseUsers;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

	DatabaseReference databaseReference = FirebaseDatabase.getInstance().getReference();
	DatabaseReference idReference = databaseReference.child("user").child(id);

        editText16DigitNo = (EditText) findViewById(R.id.editText16DigitNo);
        editTextExpirationDate = (EditText) findViewById(R.id.editTextExpirationDate);
        editTextCVVCode = (EditText) findViewById(R.id.editTextCVVCode);
        


        buttonRegister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                addPaymentInfo();
            }
        });
    }

    private void addPaymentInfo() {
        String 16digitno = editText16DigitNo.getText().toString().trim();
        String expirationdate = editTextExpirationDate.getText().toString().trim();
        String cvvcode = editTextCVVCode.getText().toString().trim();
        


        if(!TextUtils.isEmpty(16digitno) || !TextUtils.isEmpty(expirationdate) || !TextUtils.isEmpty(cvvcode)) {

         //   String id = databaseUsers.push().getKey();
		          String id = FirebaseAuth.getInstance().getUid(); 
              
             /* with line 55, you might want to switch to this with the Main Registration 
              Page as well - it makes it easier to find the current user when we're reading data later */

            User user = User(16digitno, expirationdate, cvvcode);

            databaseUsers.child(id).setValue(user);

            Toast.makeText(this, "Your payment details are now registered!", Toast.LENGTH_LONG).show();
        }
        else{
            Toast.makeText(this, "Don't leave any fields empty", Toast.LENGTH_LONG).show();
        }
    }
}










