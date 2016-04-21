package com.project.droidbabies.icare.Helper;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.os.Build;

/**
 * Created by Sumon on 3/16/2016.
 */
public class DBHelper extends SQLiteOpenHelper {

    private static final int DATABASE_VERSION = 1;
    static final String DATABASE_NAME = "icareDB";

    // TODO: 20-4-16 All Table Names here

    public static final String TABLE_USER = "userTable";
    public static final String TABLE_DIET = "dietTable";
    public static final String TABLE_GENERAL_INFO = "generalInfoTable";
    public static final String TABLE_VACCINE = "vaccineTable";
    public static final String TABLE_DOCTOR = "doctorTable";
    public static final String TABLE_MEDICAL_HISTORY = "medicalHistoryTable";
    public static final String TABLE_HOSPITAL = "hospitalTable";
    public static final String TABLE_NOTE = "noteTable";


    // TODO: 20-4-16 tableUser column names
    public static final String USER_ID_KEY = "user_id";
    public static final String USER_FULL_NAME_KEY = "user_full_name";
    public static final String USER_AGE_KEY = "age";
    public static final String USER_BLOOD_GROUP_KEY = "blood_group";
    public static final String USER_MAJOR_DISEASE_KEY = "major_disease";
    public static final String USER_HEIGHT_KEY = "height";
    public static final String USER_WEIGHT_KEY = "weight";


    // TODO: 20-4-16  DietTable column names

    public static final String DIET_ID_KEY = "diet_id";
    public static final String DIET_TYPE_KEY = "diet_type";
    public static final String DIET_MENU_KEY = "menu";
    public static final String DIET_DATE_KEY = "diet_date";
    public static final String DIET_TIME_KEY = "diet_time";
    public static final String DIET_STATE_KEY = "status";

    // TODO: 20-4-16  GeneralInfoTable column names
    public static final String GENERAL_INFO_ID_KEY = "info_id";
    public static final String GENERAL_INFO_TITLE_KEY = "info_title";
    public static final String GENERAL_INFO_DESCRIPTION_KEY = "info_description";
    public static final String GENERAL_INFO_COLLECTED_FROM_KEY = "collected_from";


    // TODO: 20-4-16  VaccineTable column names
    public static final String VACCINE_ID_KEY = "vaccine_id";
    public static final String VACCINE_NAME_KEY = "vaccine_name";
    public  static final String VACCINE_DATE_KEY = "vaccine_date";
    public static final String VACCINE_DETAILS_KEY = "vaccine_details";
    public static final String VACCINE_STATE_KEY = "status";


    // TODO: 20-4-16 DoctorTable column names

    public static final String DOCTOR_ID_KEY = "doctor_id";
    public static final String DOCTOR_NAME_KEY = "doctor_name";
    public static final String DOCTOR_DETAILS_KEY = "doctor_details";
    public static final String DOCTOR_APPOINTMENT_KEY = "appointment";
    public static final String DOCTOR_PHONE_KEY = "phone";
    public static final String DOCTOR_EMAIL_KEY = "email";

    // TODO: 20-4-16 MedicalHistoryTable column names

    public static final String MEDICAL_HISTORY_ID_KEY = "history_id";
    public static final String MEDICAL_HISTORY_PHOTO_KEY = "photo";
    public static final String MEDICAL_HISTORY_DOCTOR_NAME_KEY = "doctor_name";
    public static final String MEDICAL_HISTORY_DETAILS_KEY = "details";
    public static final String MEDICAL_HISTORY_DATE_KEY = "history_date";


    // TODO: 20-4-16 HospitalsTable column names

    public static final String HOSPITAL_ID_KEY = "hospital_id";
    public static final String HOSPITAL_NAME_KEY = "hospital_name";
    public static final String HOSPITAL_ADDRESS_KEY = "hospital_address";
    public static final String HOSPITAL_LATITUDE_KEY = "hospital_latitude";
    public static final String HOSPITAL_LONGITUDE_KEY = "hospital_longitude";
    public static final String HOSPITAL_PHONE_KEY = "hospital_phone";
    public static final String HOSPITAL_WEBSITE_KEY = "hospital_website";

    // TODO: 20-4-16 NoteTable column names

    public static final String NOTE_ID_KEY = "note_id";
    public static final String NOTE_DATE_KEY = "note_date";
    public static final String NOTE_DESCRIPTION_KEY = "note_description";

    // TODO: 20-4-16 UserTable create statement

    private static final String CREATE_TABLE_USER = "CREATE TABLE " + TABLE_USER
            + "(" + USER_ID_KEY + " INTEGER PRIMARY KEY," + USER_AGE_KEY + " DATETIME,"+USER_FULL_NAME_KEY +" TEXT, "
            + USER_BLOOD_GROUP_KEY + " TEXT," + USER_MAJOR_DISEASE_KEY + " TEXT," + USER_HEIGHT_KEY + " TEXT," + USER_WEIGHT_KEY + " TEXT " + ")";

    // TODO: 20-4-16   GeneralInfoTable create statement

    private static final String CREATE_TABLE_GENERAL_INFO = "CREATE TABLE " + TABLE_GENERAL_INFO
            + "(" + GENERAL_INFO_ID_KEY + " INTEGER PRIMARY KEY," + GENERAL_INFO_TITLE_KEY + " TEXT,"
            + GENERAL_INFO_DESCRIPTION_KEY + " TEXT," + GENERAL_INFO_COLLECTED_FROM_KEY + " TEXT " + ")";

    // TODO: 20-4-16 HospitalTable create statement

    private static final String CREATE_TABLE_HOSPITAL = "CREATE TABLE " + TABLE_HOSPITAL
            + "(" + HOSPITAL_ID_KEY + " INTEGER PRIMARY KEY," + HOSPITAL_NAME_KEY + " TEXT,"
            + HOSPITAL_ADDRESS_KEY + " TEXT," + HOSPITAL_LATITUDE_KEY + " TEXT," + HOSPITAL_LONGITUDE_KEY + " TEXT," + HOSPITAL_PHONE_KEY + " TEXT," + HOSPITAL_WEBSITE_KEY + " TEXT " + ")";


    // TODO: 20-4-16 NoteTable Create Statement

    private static final String CREATE_TABLE_NOTE = "CREATE TABLE " + TABLE_NOTE
            + "(" + NOTE_ID_KEY + " INTEGER PRIMARY KEY," + NOTE_DATE_KEY + " DATETIME,"
            + NOTE_DESCRIPTION_KEY + " TEXT" + ")";

    // TODO: 20-4-16 DietTable Create Statement

    private static final String CREATE_TABLE_DIET = "CREATE TABLE "
            + TABLE_DIET + "(" + DIET_ID_KEY + " INTEGER PRIMARY KEY," + DIET_TYPE_KEY
            + " TEXT," + DIET_MENU_KEY + " TEXT," + DIET_DATE_KEY + " DATETIME," + DIET_TIME_KEY
            + " DATETIME," + DIET_STATE_KEY + " INTEGER, " + USER_ID_KEY + " INTEGER," + " FOREIGN KEY( " + USER_ID_KEY + " ) REFERENCES " + TABLE_USER + " ( " + USER_ID_KEY + " ) ON DELETE CASCADE" + ")";


    // TODO: 20-4-16 VaccineTable Create Statement

    private static final String CREATE_TABLE_VACCINE = "CREATE TABLE "
            + TABLE_VACCINE + "(" + VACCINE_ID_KEY + " INTEGER PRIMARY KEY," + VACCINE_NAME_KEY
            + " TEXT," + VACCINE_DATE_KEY + " DATETIME," + VACCINE_DETAILS_KEY + " TEXT," + VACCINE_STATE_KEY + " INTEGER, " + USER_ID_KEY + " INTEGER," + " FOREIGN KEY( " + USER_ID_KEY + " ) REFERENCES " + TABLE_USER + " ( " + USER_ID_KEY + " ) ON DELETE CASCADE" + ")";


    // TODO: 20-4-16 DoctorTable Create Statement

    private static final String CREATE_TABLE_DOCTOR = "CREATE TABLE "
            + TABLE_DOCTOR + "(" + DOCTOR_ID_KEY + " INTEGER PRIMARY KEY," + DOCTOR_NAME_KEY
            + " TEXT," + DOCTOR_DETAILS_KEY + " TEXT," + DOCTOR_APPOINTMENT_KEY + " DATETIME," + DOCTOR_PHONE_KEY + " TEXT, " + DOCTOR_EMAIL_KEY + " TEXT," + USER_ID_KEY + " INTEGER," + " FOREIGN KEY( " + USER_ID_KEY + " ) REFERENCES " + TABLE_USER + " ( " + USER_ID_KEY + " ) ON DELETE CASCADE" + ")";


    // TODO: 20-4-16 MedicalHistoryTable Create Statement

    private static final String CREATE_TABLE_MEDICAL_HISTORY = "CREATE TABLE "
            + TABLE_MEDICAL_HISTORY + "(" + MEDICAL_HISTORY_ID_KEY + " INTEGER PRIMARY KEY," + MEDICAL_HISTORY_PHOTO_KEY
            + " TEXT," + MEDICAL_HISTORY_DOCTOR_NAME_KEY + " TEXT," + MEDICAL_HISTORY_DETAILS_KEY + " TEXT," + MEDICAL_HISTORY_DATE_KEY + " DATETIME," + USER_ID_KEY + " INTEGER," + " FOREIGN KEY( " + USER_ID_KEY + " ) REFERENCES " + TABLE_USER + " ( " + USER_ID_KEY + " ) ON DELETE CASCADE" + ")";


    public DBHelper(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        // creating required tables
        db.execSQL(CREATE_TABLE_USER);
        db.execSQL(CREATE_TABLE_DIET);
        db.execSQL(CREATE_TABLE_GENERAL_INFO);
        db.execSQL(CREATE_TABLE_VACCINE);
        db.execSQL(CREATE_TABLE_DOCTOR);
        db.execSQL(CREATE_TABLE_MEDICAL_HISTORY);
        db.execSQL(CREATE_TABLE_HOSPITAL);
        db.execSQL(CREATE_TABLE_NOTE);

    }

    @Override
    public void onOpen(SQLiteDatabase db) {
        super.onOpen(db);
        if (!db.isReadOnly()) {
            // Enable foreign key constraints
//            db.execSQL("PRAGMA foreign_keys=ON;");
            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.JELLY_BEAN) {
                db.setForeignKeyConstraintsEnabled(true);
            }


        }
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        // on upgrade drop older tables
        db.execSQL("DROP TABLE IF EXISTS " + TABLE_USER);
        db.execSQL("DROP TABLE IF EXISTS " + TABLE_DIET);
        db.execSQL("DROP TABLE IF EXISTS " + TABLE_GENERAL_INFO);
        db.execSQL("DROP TABLE IF EXISTS " + TABLE_VACCINE);
        db.execSQL("DROP TABLE IF EXISTS " + TABLE_DOCTOR);
        db.execSQL("DROP TABLE IF EXISTS " + TABLE_MEDICAL_HISTORY);
        db.execSQL("DROP TABLE IF EXISTS " + TABLE_HOSPITAL);
        db.execSQL("DROP TABLE IF EXISTS " + TABLE_NOTE);


        // create new tables
        onCreate(db);
    }
}

