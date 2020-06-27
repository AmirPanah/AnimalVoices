package panah.amir.AnimalVoice;

//import com.example.PanahwebSite.R;

import panah.amir.AnimalVoice.R;

import android.app.Dialog;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.ImageButton;



public class MainActivity extends ActionBarActivity {
	
	
	private Button about;
	private ImageButton ibtnfrog;
	private ImageButton ibtndog;
	private ImageButton ibtnelephant;
	private ImageButton ibtnhorse;
	private ImageButton ibtncow;
	private ImageButton ibtnsheep;
	private ImageButton ibtndonkey;
	private ImageButton ibtnduck;
	private ImageButton ibtnrooster;
	private ImageButton ibtnqanary;
	private ImageButton ibtnfly;
	private ImageButton ibtnwolf;
	private ImageButton ibtnsparrow;
	private ImageButton ibtncrow;
	private ImageButton ibtngoose;
	private ImageButton ibtnchick;
	private ImageButton ibtnbear;
	private ImageButton ibtnbee;
	private ImageButton ibtncat;
	private ImageButton ibtnlapwing;
	private ImageButton ibtnlion;
	private ImageButton ibtnowl;
	private ImageButton ibtnparrot;
	private ImageButton ibtnpeacock;
	private ImageButton ibtnpigeon;
	private ImageButton ibtntiger;
	private ImageButton ibtnwoodpecker;
	
	
	
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        about = (Button) findViewById(R.id.buttonabout);
        ibtnfrog = (ImageButton) findViewById(R.id.imageButtonfrog);
        ibtncow = (ImageButton) findViewById(R.id.imageButtoncow);
        ibtndog = (ImageButton) findViewById(R.id.imageButtondog);
        ibtnelephant = (ImageButton) findViewById(R.id.imageButtonelephant);
        ibtnhorse = (ImageButton) findViewById(R.id.imageButtonhorse);
        ibtnsheep = (ImageButton) findViewById(R.id.imageButtonsheep);
        ibtndonkey = (ImageButton) findViewById(R.id.imageButtondonkey);
        ibtnduck = (ImageButton) findViewById(R.id.imageButtonduck);
        ibtnrooster = (ImageButton) findViewById(R.id.imageButtonrooster);
        ibtnqanary = (ImageButton) findViewById(R.id.imageButtoncanary);
        ibtnfly = (ImageButton) findViewById(R.id.imageButtonfly);
        ibtnwolf = (ImageButton) findViewById(R.id.imageButtonwolf);
        ibtnsparrow = (ImageButton) findViewById(R.id.imageButtonsparrow);
        ibtncrow = (ImageButton) findViewById(R.id.imageButtoncrow);
        ibtngoose = (ImageButton) findViewById(R.id.imageButtongoose);
        ibtnchick = (ImageButton) findViewById(R.id.imageButtonchick);
        ibtnbear = (ImageButton) findViewById(R.id.imageButtonbear);
        ibtnbee = (ImageButton) findViewById(R.id.imageButtonbee);
        ibtncat = (ImageButton) findViewById(R.id.imageButtoncat);
        ibtnlapwing = (ImageButton) findViewById(R.id.imageButtonlapwing);
        ibtnlion = (ImageButton) findViewById(R.id.imageButtonlion);
        ibtnowl = (ImageButton) findViewById(R.id.imageButtonowl);
        ibtnparrot = (ImageButton) findViewById(R.id.imageButtonparrot);
        ibtnpeacock = (ImageButton) findViewById(R.id.imageButtonpeacock);
        ibtnpigeon = (ImageButton) findViewById(R.id.imageButtonpigeon);
        ibtntiger = (ImageButton) findViewById(R.id.imageButtontiger);
        ibtnwoodpecker = (ImageButton) findViewById(R.id.imageButtonwoodpecker);
        
      
        about.setOnClickListener(new OnClickListener() {
			public void onClick(View arg0) {
			
				
				Dialog d = new Dialog(MainActivity.this); 
				d.setContentView(R.layout.dialogabout);
				String title = getResources().getString(R.string.dialogabout_title); 
				d.setTitle(title); 
				d.show();
			}
		}); 


        ibtnfrog.setOnClickListener(new OnClickListener() {
			public void onClick(View arg0) {
			
				MediaPlayer player = MediaPlayer.create(MainActivity.this, R.raw.ghoorbaghe); 
				//player.setLooping(true); // Set looping 
				player.setVolume(100,100); 
				player.start();
				
				//Toast.makeText(getApplicationContext(), "Forg", Toast.LENGTH_SHORT).show();
				
				Dialog d = new Dialog(MainActivity.this); 
				d.setContentView(R.layout.dialog);
				String title = getResources().getString(R.string.dialog_title); 
				d.setTitle(title); 
				d.show();
			}
		});

        ibtndog.setOnClickListener(new OnClickListener() {
    			public void onClick(View arg0) {
    			
    				MediaPlayer player = MediaPlayer.create(MainActivity.this, R.raw.dog); 
    				//player.setLooping(true); // Set looping 
    				player.setVolume(100,100); 
    				player.start();
    				
    				//Toast.makeText(getApplicationContext(), "Forg", Toast.LENGTH_SHORT).show();
    				
    				Dialog d = new Dialog(MainActivity.this); 
    				d.setContentView(R.layout.dialogdog);
    				String title = getResources().getString(R.string.dialogdog_title); 
    				d.setTitle(title); 
    				d.show();
    			}
    		});


        ibtnelephant.setOnClickListener(new OnClickListener() {
    			public void onClick(View arg0) {
    			
    				MediaPlayer player = MediaPlayer.create(MainActivity.this, R.raw.fil); 
    				//player.setLooping(true); // Set looping 
    				player.setVolume(100,100); 
    				player.start();
    				
    				//Toast.makeText(getApplicationContext(), "Forg", Toast.LENGTH_SHORT).show();
    				
    				Dialog d = new Dialog(MainActivity.this); 
    				d.setContentView(R.layout.dialogelephant);
    				String title = getResources().getString(R.string.dialogelephant_title); 
    				d.setTitle(title); 
    				d.show();
    			}
    		});

        ibtnhorse.setOnClickListener(new OnClickListener() {
			public void onClick(View arg0) {
			
				MediaPlayer player = MediaPlayer.create(MainActivity.this, R.raw.asb); 
				//player.setLooping(true); // Set looping 
				player.setVolume(100,100); 
				player.start();
				
				//Toast.makeText(getApplicationContext(), "Forg", Toast.LENGTH_SHORT).show();
				
				Dialog d = new Dialog(MainActivity.this); 
				d.setContentView(R.layout.dialoghorse);
				String title = getResources().getString(R.string.dialoghorse_title); 
				d.setTitle(title); 
				d.show();
			}
		});

        ibtncow.setOnClickListener(new OnClickListener() {
			public void onClick(View arg0) {
			
				MediaPlayer player = MediaPlayer.create(MainActivity.this, R.raw.gav); 
				//player.setLooping(true); // Set looping 
				player.setVolume(100,100); 
				player.start();
				
				//Toast.makeText(getApplicationContext(), "Forg", Toast.LENGTH_SHORT).show();
				
				Dialog d = new Dialog(MainActivity.this); 
				d.setContentView(R.layout.dialogcow);
				String title = getResources().getString(R.string.dialogcow_title); 
				d.setTitle(title); 
				d.show();
			}
		});
        
        
        ibtnsheep.setOnClickListener(new OnClickListener() {
			public void onClick(View arg0) {
			
				MediaPlayer player = MediaPlayer.create(MainActivity.this, R.raw.gosfand); 
				//player.setLooping(true); // Set looping 
				player.setVolume(100,100); 
				player.start();
				
				//Toast.makeText(getApplicationContext(), "Forg", Toast.LENGTH_SHORT).show();
				
				Dialog d = new Dialog(MainActivity.this); 
				d.setContentView(R.layout.dialogsheep);
				String title = getResources().getString(R.string.dialogsheep_title); 
				d.setTitle(title); 
				d.show();
			}
		});
        
        
        ibtndonkey.setOnClickListener(new OnClickListener() {
			public void onClick(View arg0) {
			
				MediaPlayer player = MediaPlayer.create(MainActivity.this, R.raw.donkey); 
				//player.setLooping(true); // Set looping 
				player.setVolume(100,100); 
				player.start();
				
				//Toast.makeText(getApplicationContext(), "Forg", Toast.LENGTH_SHORT).show();
				
				Dialog d = new Dialog(MainActivity.this); 
				d.setContentView(R.layout.dialogdonkey);
				String title = getResources().getString(R.string.dialogdonkey_title); 
				d.setTitle(title); 
				d.show();
			}
		});
        
        ibtnduck.setOnClickListener(new OnClickListener() {
			public void onClick(View arg0) {
			
				MediaPlayer player = MediaPlayer.create(MainActivity.this, R.raw.ordak); 
				//player.setLooping(true); // Set looping 
				player.setVolume(100,100); 
				player.start();
				
				//Toast.makeText(getApplicationContext(), "Forg", Toast.LENGTH_SHORT).show();
				
				Dialog d = new Dialog(MainActivity.this); 
				d.setContentView(R.layout.dialogduck);
				String title = getResources().getString(R.string.dialogduck_title); 
				d.setTitle(title); 
				d.show();
			}
		});

        ibtnrooster.setOnClickListener(new OnClickListener() {
			public void onClick(View arg0) {
			
				MediaPlayer player = MediaPlayer.create(MainActivity.this, R.raw.khoros); 
				//player.setLooping(true); // Set looping 
				player.setVolume(100,100); 
				player.start();
				
				//Toast.makeText(getApplicationContext(), "Forg", Toast.LENGTH_SHORT).show();
				
				Dialog d = new Dialog(MainActivity.this); 
				d.setContentView(R.layout.dialogrooster);
				String title = getResources().getString(R.string.dialogrooster_title); 
				d.setTitle(title); 
				d.show();
			}
		});
        
        ibtnqanary.setOnClickListener(new OnClickListener() {
			public void onClick(View arg0) {
			
				MediaPlayer player = MediaPlayer.create(MainActivity.this, R.raw.qanari); 
				//player.setLooping(true); // Set looping 
				player.setVolume(100,100); 
				player.start();
				
				//Toast.makeText(getApplicationContext(), "Forg", Toast.LENGTH_SHORT).show();
				
				Dialog d = new Dialog(MainActivity.this); 
				d.setContentView(R.layout.dialogqanary);
				String title = getResources().getString(R.string.dialogqanary_title); 
				d.setTitle(title); 
				d.show();
			}
		});
        
        ibtnfly.setOnClickListener(new OnClickListener() {
     			public void onClick(View arg0) {
     			
     				MediaPlayer player = MediaPlayer.create(MainActivity.this, R.raw.fly); 
     				//player.setLooping(true); // Set looping 
     				player.setVolume(100,100); 
     				player.start();
     				
     				//Toast.makeText(getApplicationContext(), "Forg", Toast.LENGTH_SHORT).show();
     				
     				Dialog d = new Dialog(MainActivity.this); 
     				d.setContentView(R.layout.dialogfly);
     				String title = getResources().getString(R.string.dialogfly_title); 
     				d.setTitle(title); 
     				d.show();
     			}
     		});
        
        ibtnwolf.setOnClickListener(new OnClickListener() {
 			public void onClick(View arg0) {
 			
 				MediaPlayer player = MediaPlayer.create(MainActivity.this, R.raw.wolf); 
 				//player.setLooping(true); // Set looping 
 				player.setVolume(100,100); 
 				player.start();
 				
 				//Toast.makeText(getApplicationContext(), "Forg", Toast.LENGTH_SHORT).show();
 				
 				Dialog d = new Dialog(MainActivity.this); 
 				d.setContentView(R.layout.dialogwolf);
 				String title = getResources().getString(R.string.dialogwolf_title); 
 				d.setTitle(title); 
 				d.show();
 			}
 		});
        
        ibtnsparrow.setOnClickListener(new OnClickListener() {
 			public void onClick(View arg0) {
 			
 				MediaPlayer player = MediaPlayer.create(MainActivity.this, R.raw.sparrow); 
 				//player.setLooping(true); // Set looping 
 				player.setVolume(100,100); 
 				player.start();
 				
 				//Toast.makeText(getApplicationContext(), "Forg", Toast.LENGTH_SHORT).show();
 				
 				Dialog d = new Dialog(MainActivity.this); 
 				d.setContentView(R.layout.dialogsparrow);
 				String title = getResources().getString(R.string.dialogsparrow_title); 
 				d.setTitle(title); 
 				d.show();
 			}
 		});
        
        ibtncrow.setOnClickListener(new OnClickListener() {
 			public void onClick(View arg0) {
 			
 				MediaPlayer player = MediaPlayer.create(MainActivity.this, R.raw.crow); 
 				//player.setLooping(true); // Set looping 
 				player.setVolume(100,100); 
 				player.start();
 				
 				//Toast.makeText(getApplicationContext(), "Forg", Toast.LENGTH_SHORT).show();
 				
 				Dialog d = new Dialog(MainActivity.this); 
 				d.setContentView(R.layout.dialogcrow);
 				String title = getResources().getString(R.string.dialogcrow_title); 
 				d.setTitle(title); 
 				d.show();
 			}
 		});
        
        ibtngoose.setOnClickListener(new OnClickListener() {
 			public void onClick(View arg0) {
 			
 				MediaPlayer player = MediaPlayer.create(MainActivity.this, R.raw.goose); 
 				//player.setLooping(true); // Set looping 
 				player.setVolume(100,100); 
 				player.start();
 				
 				//Toast.makeText(getApplicationContext(), "Forg", Toast.LENGTH_SHORT).show();
 				
 				Dialog d = new Dialog(MainActivity.this); 
 				d.setContentView(R.layout.dialoggoose);
 				String title = getResources().getString(R.string.dialoggoose_title); 
 				d.setTitle(title); 
 				d.show();
 			}
 		});
        
        ibtnchick.setOnClickListener(new OnClickListener() {
 			public void onClick(View arg0) {
 			
 				MediaPlayer player = MediaPlayer.create(MainActivity.this, R.raw.chick); 
 				//player.setLooping(true); // Set looping 
 				player.setVolume(100,100); 
 				player.start();
 				
 				//Toast.makeText(getApplicationContext(), "Forg", Toast.LENGTH_SHORT).show();
 				
 				Dialog d = new Dialog(MainActivity.this); 
 				d.setContentView(R.layout.dialogchick);
 				String title = getResources().getString(R.string.dialogchick_title); 
 				d.setTitle(title); 
 				d.show();
 			}
 		});
        
        ibtnbear.setOnClickListener(new OnClickListener() {
 			public void onClick(View arg0) {
 			
 				MediaPlayer player = MediaPlayer.create(MainActivity.this, R.raw.bear); 
 				//player.setLooping(true); // Set looping 
 				player.setVolume(100,100); 
 				player.start();
 				
 				//Toast.makeText(getApplicationContext(), "Forg", Toast.LENGTH_SHORT).show();
 				
 				Dialog d = new Dialog(MainActivity.this); 
 				d.setContentView(R.layout.dialogbear);
 				String title = getResources().getString(R.string.dialogbear_title); 
 				d.setTitle(title); 
 				d.show();
 			}
 		});
        
        ibtnbee.setOnClickListener(new OnClickListener() {
 			public void onClick(View arg0) {
 			
 				MediaPlayer player = MediaPlayer.create(MainActivity.this, R.raw.bee); 
 				//player.setLooping(true); // Set looping 
 				player.setVolume(100,100); 
 				player.start();
 				
 				//Toast.makeText(getApplicationContext(), "Forg", Toast.LENGTH_SHORT).show();
 				
 				Dialog d = new Dialog(MainActivity.this); 
 				d.setContentView(R.layout.dialogbee);
 				String title = getResources().getString(R.string.dialogbee_title); 
 				d.setTitle(title); 
 				d.show();
 			}
 		});
        
        ibtncat.setOnClickListener(new OnClickListener() {
 			public void onClick(View arg0) {
 			
 				MediaPlayer player = MediaPlayer.create(MainActivity.this, R.raw.cat); 
 				//player.setLooping(true); // Set looping 
 				player.setVolume(100,100); 
 				player.start();
 				
 				//Toast.makeText(getApplicationContext(), "Forg", Toast.LENGTH_SHORT).show();
 				
 				Dialog d = new Dialog(MainActivity.this); 
 				d.setContentView(R.layout.dialogcat);
 				String title = getResources().getString(R.string.dialogcat_title); 
 				d.setTitle(title); 
 				d.show();
 			}
 		});
        
        ibtnlapwing.setOnClickListener(new OnClickListener() {
 			public void onClick(View arg0) {
 			
 				MediaPlayer player = MediaPlayer.create(MainActivity.this, R.raw.lapwing); 
 				//player.setLooping(true); // Set looping 
 				player.setVolume(100,100); 
 				player.start();
 				
 				//Toast.makeText(getApplicationContext(), "Forg", Toast.LENGTH_SHORT).show();
 				
 				Dialog d = new Dialog(MainActivity.this); 
 				d.setContentView(R.layout.dialoglapwing);
 				String title = getResources().getString(R.string.dialoglapwing_title); 
 				d.setTitle(title); 
 				d.show();
 			}
 		});
        
        ibtnlion.setOnClickListener(new OnClickListener() {
 			public void onClick(View arg0) {
 			
 				MediaPlayer player = MediaPlayer.create(MainActivity.this, R.raw.lion); 
 				//player.setLooping(true); // Set looping 
 				player.setVolume(100,100); 
 				player.start();
 				
 				//Toast.makeText(getApplicationContext(), "Forg", Toast.LENGTH_SHORT).show();
 				
 				Dialog d = new Dialog(MainActivity.this); 
 				d.setContentView(R.layout.dialoglion);
 				String title = getResources().getString(R.string.dialoglion_title); 
 				d.setTitle(title); 
 				d.show();
 			}
 		});
        
        ibtnowl.setOnClickListener(new OnClickListener() {
 			public void onClick(View arg0) {
 			
 				MediaPlayer player = MediaPlayer.create(MainActivity.this, R.raw.owl); 
 				//player.setLooping(true); // Set looping 
 				player.setVolume(100,100); 
 				player.start();
 				
 				//Toast.makeText(getApplicationContext(), "Forg", Toast.LENGTH_SHORT).show();
 				
 				Dialog d = new Dialog(MainActivity.this); 
 				d.setContentView(R.layout.dialogowl);
 				String title = getResources().getString(R.string.dialogowl_title); 
 				d.setTitle(title); 
 				d.show();
 			}
 		});
        
        ibtnparrot.setOnClickListener(new OnClickListener() {
 			public void onClick(View arg0) {
 			
 				MediaPlayer player = MediaPlayer.create(MainActivity.this, R.raw.parrot); 
 				//player.setLooping(true); // Set looping 
 				player.setVolume(100,100); 
 				player.start();
 				
 				//Toast.makeText(getApplicationContext(), "Forg", Toast.LENGTH_SHORT).show();
 				
 				Dialog d = new Dialog(MainActivity.this); 
 				d.setContentView(R.layout.dialogparrot);
 				String title = getResources().getString(R.string.dialogparrot_title); 
 				d.setTitle(title); 
 				d.show();
 			}
 		});
       
        ibtnpeacock.setOnClickListener(new OnClickListener() {
 			public void onClick(View arg0) {
 			
 				MediaPlayer player = MediaPlayer.create(MainActivity.this, R.raw.peacock); 
 				//player.setLooping(true); // Set looping 
 				player.setVolume(100,100); 
 				player.start();
 				
 				//Toast.makeText(getApplicationContext(), "Forg", Toast.LENGTH_SHORT).show();
 				
 				Dialog d = new Dialog(MainActivity.this); 
 				d.setContentView(R.layout.dialogpeacock);
 				String title = getResources().getString(R.string.dialogpeacock_title); 
 				d.setTitle(title); 
 				d.show();
 			}
 		});
        
        ibtnpigeon.setOnClickListener(new OnClickListener() {
 			public void onClick(View arg0) {
 			
 				MediaPlayer player = MediaPlayer.create(MainActivity.this, R.raw.pigeon); 
 				//player.setLooping(true); // Set looping 
 				player.setVolume(100,100); 
 				player.start();
 				
 				//Toast.makeText(getApplicationContext(), "Forg", Toast.LENGTH_SHORT).show();
 				
 				Dialog d = new Dialog(MainActivity.this); 
 				d.setContentView(R.layout.dialogpigeon);
 				String title = getResources().getString(R.string.dialogpigeon_title); 
 				d.setTitle(title); 
 				d.show();
 			}
 		});
        
        ibtntiger.setOnClickListener(new OnClickListener() {
 			public void onClick(View arg0) {
 			
 				MediaPlayer player = MediaPlayer.create(MainActivity.this, R.raw.tiger); 
 				//player.setLooping(true); // Set looping 
 				player.setVolume(100,100); 
 				player.start();
 				
 				//Toast.makeText(getApplicationContext(), "Forg", Toast.LENGTH_SHORT).show();
 				
 				Dialog d = new Dialog(MainActivity.this); 
 				d.setContentView(R.layout.dialogtiger);
 				String title = getResources().getString(R.string.dialogtiger_title); 
 				d.setTitle(title); 
 				d.show();
 			}
 		});
        
        ibtnwoodpecker.setOnClickListener(new OnClickListener() {
 			public void onClick(View arg0) {
 			
 				MediaPlayer player = MediaPlayer.create(MainActivity.this, R.raw.woodpecker); 
 				//player.setLooping(true); // Set looping 
 				player.setVolume(100,100); 
 				player.start();
 				
 				//Toast.makeText(getApplicationContext(), "Forg", Toast.LENGTH_SHORT).show();
 				
 				Dialog d = new Dialog(MainActivity.this); 
 				d.setContentView(R.layout.dialogwoopecker);
 				String title = getResources().getString(R.string.dialogwoodpecker_title); 
 				d.setTitle(title); 
 				d.show();
 			}
 		});
        
    }
}
