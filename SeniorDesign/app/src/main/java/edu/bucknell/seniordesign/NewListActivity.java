package edu.bucknell.seniordesign;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;


public class NewListActivity extends AppCompatActivity {

    private Button mNewListButton;
    private FirebaseDatabase db;
    public static DatabaseReference mRef;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new_list);

        //mRef = new FirebaseDatabase("https://natparksdb.firebaseio.com/");
        db = FirebaseDatabase.getInstance();
        DatabaseReference mRef = db.getReference("https://natparksdb.firebaseio.com/");


        mNewListButton = (Button) findViewById(R.id.newListButton);

        mNewListButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View viw) {
                DatabaseReference mRefChild = mRef.child("Name");

            }
        });

    }
}