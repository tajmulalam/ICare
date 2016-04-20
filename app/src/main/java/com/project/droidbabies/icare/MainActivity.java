package com.project.droidbabies.icare;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.project.droidbabies.icare.generalinformation.GeneralInformationManager;
import com.project.droidbabies.icare.generalinformation.GeneralInformationModel;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

GeneralInformationManager manager;
    ArrayList<GeneralInformationModel> generalInformationList;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        manager=new GeneralInformationManager(this);
        generalInformationList=new ArrayList<>();
        generalInformationList=manager.getGeneralInfos();

        Toast.makeText(MainActivity.this, String.valueOf(generalInformationList.size()), Toast.LENGTH_SHORT).show();

    }

    public void addNewProfile(View view) {
        Intent newProfileIntent=new Intent(MainActivity.this,AddProfileActivity.class);
        startActivity(newProfileIntent);
        finish();
    }
}
