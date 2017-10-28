package com.example.sridhar123.sieaver;

import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.ActivityCompat;
import android.support.v4.content.ContextCompat;
import android.view.View;
import android.widget.Toast;

import com.desmond.squarecamera.CameraActivity;
import com.example.sridhar123.sieaver.GeneralConstants.GeneralConstants;
import com.google.firebase.storage.FirebaseStorage;
import com.google.firebase.storage.StorageReference;

/**
 * Created by sridhar123 on 28/10/17.
 */
public class PanKycDocsActivity extends SieverBaseActivity {


    private static final int REQUEST_CAMERA_PERMISSION = 1;
    private static final int REQUEST_CAMERA_SELFIE = 100;
    private static final int REQUEST_CAMERA_PAN = 101;
    private static final int REQUEST_CAMERA_ADDRESS_FRONT = 102;
    private static final int REQUEST_CAMERA_ADDRESS_BACK = 103;
    private static final int REQUEST_CAMERA_SIGN = 104;
    private FirebaseStorage mFirebaseStorage;
    private StorageReference mStorageReference;
//    private Uri photoUri;
    private String permission;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.pan_kyc_docs_activity);
        requestForCameraPermission();
    }

    // Check for camera permission in MashMallow
    public void requestForCameraPermission() {
        permission = android.Manifest.permission.CAMERA;
        if (ContextCompat.checkSelfPermission(PanKycDocsActivity.this, permission)
                != PackageManager.PERMISSION_GRANTED) {
            if (ActivityCompat.shouldShowRequestPermissionRationale(PanKycDocsActivity.this, permission)) {
                // Show permission rationale
//                showPermissionRationaleDialog("Test", permission);
            } else {
                // Handle the result in Activity#onRequestPermissionResult(int, String[], int[])
//                ActivityCompat.requestPermissions(PanKycDocsActivity.this, new String[]{permission}, REQUEST_CAMERA_PERMISSION);
            requestForPermission(permission);
            }
        } else {
            // Start CameraActivity
            launchCamera(GeneralConstants.camera_user_flag);
        }
    }

    private void launchCamera(int flag) {
        Intent intent = new Intent(PanKycDocsActivity.this, CameraActivity.class);
        if (flag == GeneralConstants.camera_user_flag) {
            intent.putExtra(GeneralConstants.camera_flag, flag);
            startActivityForResult(intent, REQUEST_CAMERA_SELFIE);
        } else if (flag == GeneralConstants.camera_pan_flag) {
            intent.putExtra(GeneralConstants.camera_flag, flag);
            startActivityForResult(intent, REQUEST_CAMERA_PAN);
        } else if (flag == GeneralConstants.camera_address_front_flag) {
            intent.putExtra(GeneralConstants.camera_flag, flag);
            startActivityForResult(intent, REQUEST_CAMERA_ADDRESS_FRONT);
        } else if (flag == GeneralConstants.camera_address_back_flag) {
            intent.putExtra(GeneralConstants.camera_flag, flag);
            startActivityForResult(intent, REQUEST_CAMERA_ADDRESS_BACK);
        } else if (flag == GeneralConstants.camera_sign_flag) {
            intent.putExtra(GeneralConstants.camera_flag, flag);
            startActivityForResult(intent, REQUEST_CAMERA_SIGN);
        }

    }
    private void requestForPermission(final String permission) {
        ActivityCompat.requestPermissions(PanKycDocsActivity.this, new String[]{permission}, REQUEST_CAMERA_PERMISSION);
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        Uri photoUri;
        if(resultCode!=RESULT_OK)
            return;

        if(requestCode == REQUEST_CAMERA_SELFIE){
            photoUri = data.getData();

            launchCamera(GeneralConstants.camera_pan_flag);
        } else if (requestCode == REQUEST_CAMERA_PAN) {
            photoUri = data.getData();
            launchCamera(GeneralConstants.camera_address_front_flag);
        } else if (requestCode == REQUEST_CAMERA_ADDRESS_FRONT) {
            photoUri = data.getData();
            launchCamera(GeneralConstants.camera_address_back_flag);
        } else if (requestCode == REQUEST_CAMERA_ADDRESS_BACK) {
            photoUri = data.getData();
            launchCamera(GeneralConstants.camera_sign_flag);
        } else if (requestCode == REQUEST_CAMERA_SIGN) {
            photoUri = data.getData();
            Toast.makeText(this, "Upload completed!", Toast.LENGTH_SHORT).show();
            Intent intent = new Intent(PanKycDocsActivity.this, PanKycUploadSuccessActivity.class);
            startActivity(intent);
        }
        super.onActivityResult(requestCode, resultCode, data);
    }

    @Override
    public void onRequestPermissionsResult(int requestCode, @NonNull String[] permissions, @NonNull int[] grantResults) {
        switch (requestCode) {
            case REQUEST_CAMERA_PERMISSION:
                final int numOfRequest = grantResults.length;
                final boolean isGranted = numOfRequest == 1
                        && PackageManager.PERMISSION_GRANTED == grantResults[numOfRequest - 1];
                if (isGranted) {
                    launchCamera(GeneralConstants.camera_user_flag);
                }
                break;

            default:
                super.onRequestPermissionsResult(requestCode, permissions, grantResults);
        }
    }

}
