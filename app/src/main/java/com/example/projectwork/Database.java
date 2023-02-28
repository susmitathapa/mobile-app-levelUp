package com.example.projectwork;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

public class Database extends SQLiteOpenHelper {
    public Database(@Nullable Context context, @Nullable String name, @Nullable SQLiteDatabase.CursorFactory factory, int version) {
        super(context, name, factory, version);
    }

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {  //creating table if not existing in db
        String qry1="create table users(username text, email text, password text)";
        sqLiteDatabase.execSQL(qry1);  //executing sql query using sqlite db object
    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {  //updating table

    }
    //explicit function
    public void register(String username, String email, String password){
        ContentValues cv = new ContentValues();
        cv.put("username",username);
        cv.put("email",email);
        cv.put("password",password);
        SQLiteDatabase db = getWritableDatabase();//we need to insert that data to table(for insertiion,updation,deletion getwritable db)
        db.insert("users",null,cv);
        db.close();
    }
    public int login(String username, String password){
        int result=0;
        String str[]=new String[2];
        str[0]=username;
        str[1]=password;
        SQLiteDatabase db = getReadableDatabase();
        Cursor c =db.rawQuery("select * from users where username=? and password=?",str);
        if (c.moveToFirst()){  //if there is record
            result=1;
        }
        return result;
    }
}
