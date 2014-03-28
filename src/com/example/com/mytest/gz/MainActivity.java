package com.example.com.mytest.gz;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.SeekBar;

public class MainActivity extends Activity {
	
	Button btnStart = null;
	ProgressBar spinningBar = null;
	SeekBar seekBar1 = null;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		btnStart = (Button)findViewById(R.id.btnStart);
		spinningBar = (ProgressBar)findViewById(R.id.spinningBar1);
		seekBar1 = (SeekBar)findViewById(R.id.seekBar1);
		//seekBar1.setMax(1000);
		
		btnStart.setOnClickListener(new View.OnClickListener() {
		    public void onClick(View v) {
		    	btnStart_Click();
		    }
		});
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}
	
	private void btnStart_Click(){
		int i = spinningBar.getVisibility();
		int j = spinningBar.VISIBLE;
		if (spinningBar.getVisibility() == 4){
			spinningBar.setVisibility(0);
		}
		else{
			spinningBar.setVisibility(4);
		}
	}
}
