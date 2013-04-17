package ru.androdev.countbench;

import android.os.Bundle;
import android.app.Activity;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends Activity {
	TextView display;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		long before = System.currentTimeMillis();
		  for (int x = 0; x<10000; x++)
				{double	y = (float) (x * 2.54 + 1234);
			    System.out.println(y);
			}
		long after = System.currentTimeMillis();
		long diff = after - before;
		String str = Long.toString(diff);
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		String ms = getString(R.string.ms);
		String time = getString(R.string.time);
		display = (TextView) findViewById(R.id.textView2);
		display.append(str+ms);
		Toast.makeText(this, time+str+ms, Toast.LENGTH_LONG).show();
	  }
	 @Override
	  protected void onDestroy() {
	    super.onDestroy();
	  }
}
