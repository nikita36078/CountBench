package ru.androdev.countbench;

import android.os.Bundle;
import android.app.Activity;
import android.widget.Toast;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		long before = System.currentTimeMillis();
		  for (int x = 0; x<50000; x++)
				{double	y = (float) (x * 2.54 + 1234);
			    System.out.println(y);
			}
		  long after = System.currentTimeMillis();
		  long diff = after - before;
		  String str = Long.toString(diff);
		  Toast.makeText(this, "Время: "+str+" мс", Toast.LENGTH_LONG).show();
	}
}
