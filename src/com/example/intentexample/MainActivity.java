package com.example.intentexample;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends Activity implements OnClickListener{

	Button btnSumbit;
	EditText etName,etRoll;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		init();
		
	}

	private void init() {
		btnSumbit = (Button) findViewById(R.id.btnSubmit);
		etName = (EditText) findViewById(R.id.etName);
		etRoll = (EditText) findViewById(R.id.etRoll);
		
		btnSumbit.setOnClickListener(this);
	}

	@Override
	public void onClick(View v) {
		String name = etName.getText().toString();
		String roll = etRoll.getText().toString();
		Intent intent = new Intent(MainActivity.this, SecondActivity.class);
		intent.putExtra(SecondActivity.NAME_REF, name);
		intent.putExtra(SecondActivity.ROLL_REF, roll);
		startActivity(intent);
	}

}
