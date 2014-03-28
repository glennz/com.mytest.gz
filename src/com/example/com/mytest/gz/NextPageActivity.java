package com.example.com.mytest.gz;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.widget.Button;

public class NextPageActivity extends Activity {

	Button btnGoBack = null;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_next_page);
		
		btnGoBack = (Button)findViewById(R.id.btnGoBack);
		
		btnGoBack.setOnClickListener(new View.OnClickListener() {
		    public void onClick(View v) {
		    	btnGoBack_Click();
		    }
		});
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.next_page, menu);
		return true;
	}
	
	private void btnGoBack_Click()
	{
		Intent intent = new Intent(this, MainActivity.class);
		startActivity(intent);
		overridePendingTransition(R.anim.left_in, R.anim.right_out);
	}
}
