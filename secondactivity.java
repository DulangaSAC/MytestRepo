package com.example.vrbrf;

import java.util.ArrayList;

import android.app.Activity;
import android.os.Bundle;
import android.speech.RecognizerIntent;
import android.view.MenuItem;
import android.widget.EditText;
import android.widget.Toast;
import android.annotation.SuppressLint;
import android.content.ActivityNotFoundException;
import android.content.Intent;

public class secondactivity extends Activity{
	
	EditText text1;
	EditText text2;
	static final int RESULT_SPEECH=1;
	@Override
	@SuppressLint("NewApi")
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.place_to_place);
		getActionBar().setDisplayHomeAsUpEnabled(true);
		
	}
	
	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// TODO Auto-generated method stub
		if(item.getItemId()==android.R.id.home){
			finish();
		}
		return super.onOptionsItemSelected(item);
	}
	
}
