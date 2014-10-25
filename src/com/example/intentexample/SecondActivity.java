package com.example.intentexample;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

public class SecondActivity extends Activity {
	public static final String NAME_REF="name";
	public static final String ROLL_REF="roll";
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_second);
		((TextView) findViewById(R.id.tvName)).setText(getIntent().getStringExtra(NAME_REF)); 
		((TextView) findViewById(R.id.tvRoll)).setText(getIntent().getStringExtra(ROLL_REF)); 
	}
}
