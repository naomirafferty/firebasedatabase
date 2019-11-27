 /*
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

*/

public class ViewPaymentInformation extends AppCompatActivity {



DatabaseReference databaseReference = FirebaseDatabase.getInstance().getReference(); // need to change way ID is taken
DatabaseReference idReference = databaseReference.child("user").child(id);

ValueEventerListener valueEventListener = newValueEventListener() {
@Override
public void onDataChange(DataSnapshot dataSnapshot) {
		String 16digitno = dataSnapshot.child("16digitno").getValue(String.class); 
		String expirationdate = dataSnapshot.child("expirationdate").getValue(String.class);
		String cvvcode = dataSnapshot.child("cvvcode").getValue(String.class);
		
		
		//Display the profile information
	 //If the logs don't work, add showData: in the quotation marks before the value names e.g. "showData: 16digitno: "
		Log.d(TAG, "16digitno: " + User.getUser16DigitNo());
		Log.d(TAG, "expirationdate: " + User.getUserExpirationDate());
		Log.d(TAG, "cvvcode: " + User.getUserCVVCode());
		


}

@Override
public void onCancelled(DatabaseError dbError) {}

};

idReference.addListenerForSingleValueEvent(valueEventListener);
 };

