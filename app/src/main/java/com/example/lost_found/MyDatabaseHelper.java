package com.example.lost_found;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

public class MyDatabaseHelper extends SQLiteOpenHelper {

    public static final String MyDatabase="mydatabase.db";

    public static final int VERSION=1;

    public MyDatabaseHelper(@Nullable Context context) {
        super(context, MyDatabase, null, VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL("CREATE TABLE MyTable (id INTEGER PRIMARY KEY, PostType TEXT, Name TEXT, Phone TEXT, Description TEXT, Date TEXT, Location TEXT)");
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP TABLE IF EXISTS MyTable");
    }
    public Cursor getdata()
    {
        SQLiteDatabase db=this.getWritableDatabase();
        Cursor cursor=db.rawQuery("SELECT * FROM MyTable",null);
        return cursor;
    }
}
