package de.derandroidpro.adventskalender;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ImageView;

public class FotoActivity extends Activity {
	
	ImageView iv1;
	
	int [] bilder ={R.drawable.tag1,R.drawable.tag2,R.drawable.tag3,R.drawable.tag4,R.drawable.tag5,R.drawable.tag6,R.drawable.tag7,
			R.drawable.tag8,R.drawable.tag9,R.drawable.tag10,R.drawable.tag11,R.drawable.tag12,R.drawable.tag13,R.drawable.tag14,
			R.drawable.tag15,R.drawable.tag16,R.drawable.tag17,R.drawable.tag18,R.drawable.tag19,R.drawable.tag20,R.drawable.tag21,
			R.drawable.tag22,R.drawable.tag23,R.drawable.tag24};

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_foto);
		
		iv1 = (ImageView) findViewById(R.id.imageView1);
		
		final Bundle auswertung= getIntent().getExtras();
		if (auswertung != null){
			
			int tageszahl = auswertung.getInt("itemzahl");
			
			iv1.setImageResource(bilder[tageszahl -1]);
			
			getActionBar().setTitle(tageszahl + " .Dezember");
			
			
			
		}
		
		
	}


}
