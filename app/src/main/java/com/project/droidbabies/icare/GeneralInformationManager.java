package com.project.droidbabies.icare;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

import java.util.ArrayList;

/**
 * Created by Mobile App Develop on 20-4-16.
 */
public class GeneralInformationManager {
    private GeneralInformationModel generalInformationModel;
    private DBHelper dBhelper;
    private SQLiteDatabase database;

    public GeneralInformationManager(Context context) {
        dBhelper = new DBHelper(context);
    }

    private void open() {
        database = dBhelper.getWritableDatabase();
    }

    private void close() {
        dBhelper.close();
    }

    public ArrayList<GeneralInformationModel> getGeneralInfos() {
        this.open();
        ArrayList<GeneralInformationModel> generalInformationModelArrayList = new ArrayList<>();
        Cursor cursor = database.query(DBHelper.TABLE_GENERAL_INFO, new String[]{DBHelper.GENERAL_INFO_ID_KEY, DBHelper.GENERAL_INFO_TITLE_KEY, DBHelper.GENERAL_INFO_DESCRIPTION_KEY, DBHelper.GENERAL_INFO_COLLECTED_FROM_KEY}, null, null, null, null, null);
        cursor.moveToFirst();
        if (cursor != null && cursor.getCount() > 0) {
            for (int i = 0; i < cursor.getCount(); i++) {

                int generalInfoId = cursor.getInt(cursor.getColumnIndex(DBHelper.GENERAL_INFO_ID_KEY));
                String generalInfoTitle = cursor.getString(cursor.getColumnIndex(DBHelper.GENERAL_INFO_TITLE_KEY));
                String description = cursor.getString(cursor.getColumnIndex(DBHelper.GENERAL_INFO_DESCRIPTION_KEY));
                String collectedFrom = cursor.getString(cursor.getColumnIndex(DBHelper.GENERAL_INFO_COLLECTED_FROM_KEY));


                generalInformationModel = new GeneralInformationModel(generalInfoId, generalInfoTitle, description, collectedFrom);
                generalInformationModelArrayList.add(generalInformationModel);
                cursor.moveToNext();

            }
        }
        this.close();
        return generalInformationModelArrayList;
    }
}
