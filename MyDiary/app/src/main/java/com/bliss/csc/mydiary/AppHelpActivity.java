package com.bliss.csc.mydiary;

import android.app.Activity;
import android.os.Bundle;

import android.widget.TextView;


public class AppHelpActivity extends Activity{
	public void onCreate(Bundle savedInstanceSTate){
		super.onCreate(savedInstanceSTate);
		TextView textView = new TextView(this);
		textView.setTextSize(20);
		textView.setText("20143058 문석현" );
		setContentView(textView);
	}
}


