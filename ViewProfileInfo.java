 /*
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

*/

public class ViewProfile extends AppCompatActivity { // change class name if you need to



DatabaseReference databaseReference = FirebaseDatabase.getInstance().getReference();
DatabaseReference idReference = databaseReference.child("user").child(id);

ValueEventerListener valueEventListener = newValueEventListener() {
@Override
public void onDataChange(DataSnapshot dataSnapshot) {
  //This will read the data from the database to display on the page 
		String email = dataSnapshot.child("name").getValue(String.class);
		String name = dataSnapshot.child("email").getValue(String.class);
		String password = dataSnapshot.child("password").getValue(String.class);
		String phonenumber = dataSnapshot.child("phonenumber").getValue(String.class);
		String address = dataSnapshot.child("address").getValue(String.class);
		String city = dataSnapshot.child("city").getValue(String.class);
		String postcode = dataSnapshot.child("postcode").getValue(String.class);
		String dob = dataSnapshot.child("dob").getValue(String.class);
		
		//Display the profile information
		//If the logs don't work, add showData: in the quotation marks before the value names
		Log.d(TAG, "name: " + User.getUserName());
		Log.d(TAG, "email: " + User.getUserEmail());
		Log.d(TAG, "password: " + User.getUserPassword());
		Log.d(TAG, "phonenumber: " + User.getUserPhoneNo());
		Log.d(TAG, "address: " + User.getUserAddress());
		Log.d(TAG, "city: " + User.getUserCity());
		Log.d(TAG, "postcode: " + User.getUserPostcode());
		Log.d(TAG, "dob: " + User.getUserDOB());


}

@Override
public void onCancelled(DatabaseError dbError) {}

};

idReference.addListenerForSingleValueEvent(valueEventListener);
 };
