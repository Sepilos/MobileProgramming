package com.bliss.csc.mydiary;

import android.app.TabActivity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TabHost;
import android.widget.TextView;

public class MainActivity extends TabActivity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
    	super.onCreate(savedInstanceState);    
    	setContentView(R.layout.activity_main);

    	TabHost tabHost = getTabHost();
    	TabHost.TabSpec spec;

    	Intent intent = new Intent().setClass(this, ShowMyData.class);

    	spec = tabHost.newTabSpec("show").setIndicator("일기보기").setContent(intent);
    	tabHost.addTab(spec);

    	intent = new Intent().setClass(this, WriteDiaryActivity.class);
    	spec = tabHost.newTabSpec("write").setIndicator("일기쓰기").setContent(intent);
    	tabHost.addTab(spec);    
    	
    	intent = new Intent().setClass(this, AppHelpActivity.class);
    	spec = tabHost.newTabSpec("help").setIndicator("제작자").setContent(intent);
		tabHost.addTab(spec);

    	tabHost.setCurrentTab(0);
    }
}