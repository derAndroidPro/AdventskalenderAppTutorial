package de.derandroidpro.adventskalender;

import java.util.Calendar;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends Activity {

	Calendar c1 = Calendar.getInstance();
	
	ListView lv1;
	int month;
	int day;
	int intentcode = 15;
	
	
	String[] tage = {"1. Dezember","2. Dezember","3. Dezember","4. Dezember","5. Dezember","6. Dezember","7. Dezember","8. Dezember",
			"9. Dezember","10. Dezember","11. Dezember","12. Dezember","13. Dezember","14. Dezember","15. Dezember","16. Dezember",
			"17. Dezember","18. Dezember","19. Dezember","20. Dezember","21. Dezember","22. Dezember","23. Dezember","24. Dezember"};
	
	int[] tageInt= {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24};
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		lv1 = (ListView) findViewById(R.id.listView1);
		
		ArrayAdapter< String> listadapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, tage);
		lv1.setAdapter(listadapter);
		lv1.setOnItemClickListener(new OnItemClickListener() {

			@Override
			public void onItemClick(AdapterView<?> arg0, View v1, int arg2,
					long arg3) {
				
				month = c1.get(Calendar.MONTH);
				
				if (month == 11){
					
		
					day = c1.get(Calendar.DAY_OF_MONTH);
					if ( tageInt[lv1.getPositionForView(v1)] <= day){
						
						int ItemDay = tageInt[lv1.getPositionForView(v1)];
						
						Intent i1 = new Intent(MainActivity.this, FotoActivity.class);
						i1.putExtra("itemzahl", ItemDay);
						startActivityForResult(i1, intentcode);
						
						
						
						
					} else if ( tageInt[lv1.getPositionForView(v1)] > day){
						
						Toast.makeText(getApplicationContext(), "Es ist noch zu früh!", Toast.LENGTH_SHORT).show();
						
					}
					
					
					
					
				} else if (month != 11){
					
					
					
					Toast.makeText(getApplicationContext(), "Es ist nicht Dezember!", Toast.LENGTH_SHORT).show();
					
				}
				
				
			}
		});
		
		
	}


}
