package com.example.sridhar123.sieaver;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.example.sridhar123.sieaver.FirebaseDatabase.InputDetailsModel;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

/**
 * Created by sridhar123 on 27/10/17.
 */

public class InputDetailsActivity extends SieverBaseActivity{

    private DatabaseReference mDatabase;
    private FirebaseDatabase database;
    private EditText etName , etEmail,etReferralCode;
    private Button btn;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.input_details);

        etName = (EditText) findViewById(R.id.etName);
        etEmail= (EditText) findViewById(R.id.etEmail);
        etReferralCode = (EditText) findViewById(R.id.etReferralCode);
        btn = (Button) findViewById(R.id.btnForward);

        database=FirebaseDatabase.getInstance();
        mDatabase = database.getReference().child("users");

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                writeNewUser(etName.getText().toString(),etEmail.getText().toString(),etReferralCode.getText().toString());
            }
        });}

    private void writeNewUser(String name, String email, String code) {
        InputDetailsModel input=  new InputDetailsModel(name,email,code);
        mDatabase.push().setValue(input);
    }
}
