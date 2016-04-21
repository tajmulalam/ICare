package com.project.droidbabies.icare.Manager;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

import com.project.droidbabies.icare.Helper.DBHelper;
import com.project.droidbabies.icare.Model.UserModel;

import java.util.ArrayList;

/**
 * Created by Sumon on 4/21/2016.
 */
public class UserManager {
    private UserModel user;
    private DBHelper helper;
    private SQLiteDatabase database;

    public UserManager(Context context) {
        this.helper = new DBHelper(context);
    }


    private void open() {
        database = helper.getWritableDatabase();
    }

    private void close() {
        helper.close();
    }

    public boolean addUser(UserModel user) {

        this.open();
        ContentValues values = new ContentValues();
        values.put(DBHelper.USER_FULL_NAME_KEY, user.getFullName());
        values.put(DBHelper.USER_AGE_KEY, user.getAge());
        values.put(DBHelper.USER_BLOOD_GROUP_KEY, user.getBloodGroup());
        values.put(DBHelper.USER_MAJOR_DISEASE_KEY, user.getMajorDisease());
        values.put(DBHelper.USER_HEIGHT_KEY, user.getHeight());
        values.put(DBHelper.USER_WEIGHT_KEY, user.getWeight());
        long isInserted = database.insert(DBHelper.TABLE_USER, null, values);
        this.close();
        if (isInserted == -1) {

            return false;
        } else {
            return true;
        }
    }

    public ArrayList<UserModel> getAllUser() {
        this.open();
        ArrayList<UserModel> users = new ArrayList<>();
        Cursor cursor = database.query(DBHelper.TABLE_USER, new String[]{DBHelper.USER_ID_KEY, DBHelper.USER_FULL_NAME_KEY,
                DBHelper.USER_AGE_KEY, DBHelper.USER_BLOOD_GROUP_KEY, DBHelper.USER_HEIGHT_KEY, DBHelper.HOSPITAL_WEBSITE_KEY}, null, null, null, null, null);
        cursor.moveToFirst();
        if (cursor != null && cursor.getCount() > 0) {
            for (int i = 0; i < cursor.getCount(); i++) {
                int userid = cursor.getInt(cursor.getColumnIndex(DBHelper.USER_ID_KEY));
                String fullName = cursor.getString(cursor.getColumnIndex(DBHelper.USER_FULL_NAME_KEY));
                String age = cursor.getString(cursor.getColumnIndex(DBHelper.USER_AGE_KEY));
                String bloodGroup = cursor.getString(cursor.getColumnIndex(DBHelper.USER_BLOOD_GROUP_KEY));
                String majorDisease = cursor.getString(cursor.getColumnIndex(DBHelper.USER_MAJOR_DISEASE_KEY));
                String height = cursor.getString(cursor.getColumnIndex(DBHelper.USER_HEIGHT_KEY));
                String weight = cursor.getString(cursor.getColumnIndex(DBHelper.USER_WEIGHT_KEY));

                user = new UserModel(userid, fullName, age, bloodGroup, majorDisease, height, weight);
                users.add(user);
                cursor.moveToNext();
            }

        }
        this.close();
        return users;
    }

}
