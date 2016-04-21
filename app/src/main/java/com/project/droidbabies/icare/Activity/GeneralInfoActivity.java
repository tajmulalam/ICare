package com.project.droidbabies.icare.Activity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;
import android.widget.Toast;

import com.project.droidbabies.icare.Adapter.AdapterForGeneralInfo;
import com.project.droidbabies.icare.Manager.GeneralInformationManager;
import com.project.droidbabies.icare.Model.GeneralInformationModel;
import com.project.droidbabies.icare.R;

import java.util.ArrayList;

public class GeneralInfoActivity extends AppCompatActivity {
    GeneralInformationManager manager;
    ArrayList<GeneralInformationModel> generalInformationList;
    AdapterForGeneralInfo adapter;
    ListView generalHealthInfoListView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_general_info);
        generalHealthInfoListView = (ListView) findViewById(R.id.generalHealthInfoListView);
        manager = new GeneralInformationManager(this);
        generalInformationList = new ArrayList<>();
        generalInformationList = manager.getGeneralInfos();
        adapter = new AdapterForGeneralInfo(this, generalInformationList);
        generalHealthInfoListView.setAdapter(adapter);
        Toast.makeText(GeneralInfoActivity.this, String.valueOf(generalInformationList.size()), Toast.LENGTH_SHORT).show();

    }
}
