package com.example.sridhar123.syclo;

import android.app.Application;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.storage.FirebaseStorage;
import com.google.firebase.storage.StorageReference;

/**
 * Created by sridhar123 on 27/10/17.
 */

public class SieverBaseActivity extends AppCompatActivity{

    protected FragmentManager manager;
    protected SieaverApplication application;
    protected PrefManager prefManager;
    public DatabaseReference mDatabase;
    public FirebaseDatabase database;
    public FirebaseStorage mFirebaseStorage;
    public StorageReference mStorageReference;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        application = (SieaverApplication) getApplication();
        prefManager = application.getPrefManager();

        database=FirebaseDatabase.getInstance();
        mDatabase = database.getReference().child("users");

        mFirebaseStorage = FirebaseStorage.getInstance();
        mStorageReference = mFirebaseStorage.getReference().child("pan_photos");

    }
}
