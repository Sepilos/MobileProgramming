package com.bliss.csc.mydiary;

import android.app.Activity;
import android.content.Intent;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;

public class WriteDiaryActivity extends Activity  {
	
	private DBManager manager;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.writediary);

    }

    public void saveData(View v) {

    	EditText et_name = (EditText)findViewById(R.id.edit_name);
		String diary_date = et_name.getText().toString();

        EditText et_name2 = (EditText)findViewById(R.id.edit_dairy);
        String diary_content = et_name2.getText().toString();


		

		
        try {
            manager = new DBManager(this);
            
            SQLiteDatabase sdb;
            
            sdb = manager.getWritableDatabase();
            sdb.execSQL("insert into diaryTB values('" + diary_date + "', '" + diary_content +  "');");
            manager.close();
        } catch (SQLiteException e) {
        }
    	
		Intent it = new Intent(this, MainActivity.class);
		startActivity(it);
		finish();
    }    
}