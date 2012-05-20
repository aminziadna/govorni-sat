package nidzo.govorni.sat;

import android.app.Activity;
import android.content.Context;
import android.text.format.Time;
import android.os.Bundle;
import android.media.MediaPlayer;
import android.media.AudioManager;

public class GovornisatActivity extends Activity {
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.main);
        AudioManager aManager=(AudioManager) getSystemService(Context.AUDIO_SERVICE);
        int maxVolume=aManager.getStreamMaxVolume(AudioManager.STREAM_MUSIC);
        int userVolume=aManager.getStreamVolume(AudioManager.STREAM_MUSIC);
        aManager.setStreamVolume(AudioManager.STREAM_MUSIC, maxVolume, 0);
        Time currentTime=new Time();
        currentTime.setToNow();
        int h=currentTime.hour;
        int m=currentTime.minute;
        MediaPlayer reciI=MediaPlayer.create(this, R.raw.i);    
        sati(h);
        reciI.start();
        cekaj();
        minuti(m);
        reciI.release();
        reciI=null;
        aManager.setStreamVolume(AudioManager.STREAM_MUSIC, userVolume, 0);
        this.finish();
    }
    public void onDestroy()
    {
    	System.runFinalizersOnExit(true);
    	System.exit(0);
    }
    public static void cekaj()
    {
        try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    }
    public void sati(int h)
    {
    	int h1=h/10;
    	int h2=h%10;
    	MediaPlayer reciBroj;
    	MediaPlayer reciJedinicu;
    	if (h1==1) //za brojeve čudnih imena 10-19
    	{
    		switch(h2)
    		{
    		case 0:
    			reciBroj=MediaPlayer.create(this, R.raw.deset);
    			reciBroj.start();
    			cekaj();
    			reciBroj.release();
    			reciBroj=null;
    			break;
    		case 1:
    			reciBroj=MediaPlayer.create(this, R.raw.jedanaest);
    			reciBroj.start();
    			cekaj();
    			reciBroj.stop();
    			reciBroj.release();
    			reciBroj=null;
    			break;
    		case 2:
    			reciBroj=MediaPlayer.create(this, R.raw.dvanaest);
    			reciBroj.start();
    			cekaj();
    			reciBroj.release();
    			reciBroj=null;
    			break;
    		case 3:
    			reciBroj=MediaPlayer.create(this, R.raw.trinaest);
    			reciBroj.start();
    			cekaj();
    			reciBroj.release();
    			reciBroj=null;
    			break;
    		case 4:
    			reciBroj=MediaPlayer.create(this, R.raw.cetrnaest);
    			reciBroj.start();
    			cekaj();
    			reciBroj.release();
    			reciBroj=null;
    			break;
    		case 5:
    			reciBroj=MediaPlayer.create(this, R.raw.petnaest);
    			reciBroj.start();
    			cekaj();
    			reciBroj.release();
    			reciBroj=null;
    			break;
    		case 6:
    			reciBroj=MediaPlayer.create(this, R.raw.sesnaest);
    			reciBroj.start();
    			cekaj();
    			reciBroj.release();
    			reciBroj=null;
    			break;
    		case 7:
    			reciBroj=MediaPlayer.create(this, R.raw.sedamnaest);
    			reciBroj.start();
    			cekaj();
    			reciBroj.release();
    			reciBroj=null;
    			break;
    		case 8:
    			reciBroj=MediaPlayer.create(this, R.raw.osamnaest);
    			reciBroj.start();
    			cekaj();
    			reciBroj.release();
    			reciBroj=null;
    			break;
    		case 9:
    			reciBroj=MediaPlayer.create(this, R.raw.devetnaest);
    			reciBroj.start();
    			cekaj();
    			reciBroj.release();
    			reciBroj=null;
    			break;
    		}
    		reciJedinicu=MediaPlayer.create(this, R.raw.sati);
    		reciJedinicu.start();
    		cekaj();
    		reciJedinicu.release();
    		reciJedinicu=null;
    		return;
    	}
    	else //za brojeve sa logičnim imenima
    	{
    		switch(h1)
    		{
    		case 0:
    			if (h2==0)
    			{
    				reciBroj=MediaPlayer.create(this, R.raw.nula); 
    				reciJedinicu=MediaPlayer.create(this, R.raw.sati);
        			reciBroj.start();
        			cekaj();		
        			reciJedinicu.start();
        			cekaj();
        			reciBroj.release();  
        			reciJedinicu.release();
        			reciBroj=null;  
        			reciJedinicu=null;
        			return;
    			}
    			break;
    		case 2:
    			reciBroj=MediaPlayer.create(this, R.raw.dvadeset);
    			reciBroj.start();
    			cekaj();
    			reciBroj.reset();
    			break;
    		}
    		switch(h2)
    		{
    		case 0:
    			reciJedinicu=MediaPlayer.create(this, R.raw.sati);
    			reciJedinicu.start();
    			cekaj();
    			reciJedinicu.release();
    			reciJedinicu=null;    			
    			return;
    		case 1:
    			reciBroj=MediaPlayer.create(this, R.raw.jedan);
    			reciJedinicu=MediaPlayer.create(this, R.raw.sat);
    			reciBroj.start();
    			cekaj();
    			reciJedinicu.start();
    			cekaj();
    			reciBroj.release();
    			reciJedinicu.release();
    			reciBroj=null;
    			reciJedinicu=null;
    			return;
    		case 2:
    			reciBroj=MediaPlayer.create(this, R.raw.dva);
    			reciJedinicu=MediaPlayer.create(this, R.raw.sata);
    			reciBroj.start();
    			cekaj();
    			reciJedinicu.start();
    			cekaj();
    			reciBroj.release();
    			reciJedinicu.release();
    			reciBroj=null;
    			reciJedinicu=null;
    			return;
    		case 3:
    			reciBroj=MediaPlayer.create(this, R.raw.tri);
    			reciJedinicu=MediaPlayer.create(this, R.raw.sata);
    			reciBroj.start();
    			cekaj();
    			reciJedinicu.start();
    			cekaj();
    			reciBroj.release();
    			reciJedinicu.release();
    			reciBroj=null;
    			reciJedinicu=null;
    			return;
    		case 4:
    			reciBroj=MediaPlayer.create(this, R.raw.cetiri);
    			reciJedinicu=MediaPlayer.create(this, R.raw.sata);
    			reciBroj.start();
    			cekaj();
    			reciJedinicu.start();
    			cekaj();
    			reciBroj.release();
    			reciJedinicu.release();
    			reciBroj=null;
    			reciJedinicu=null;
    			return;
    		case 5:
    			reciBroj=MediaPlayer.create(this, R.raw.pet);
    			reciJedinicu=MediaPlayer.create(this, R.raw.sati);
    			reciBroj.start();
    			cekaj();
    			reciJedinicu.start();
    			cekaj();
    			reciBroj.release();
    			reciJedinicu.release();
    			reciBroj=null;
    			reciJedinicu=null;
    			return;
    		case 6:
    			reciBroj=MediaPlayer.create(this, R.raw.sest);
    			reciJedinicu=MediaPlayer.create(this, R.raw.sati);
    			reciBroj.start();
    			cekaj();
    			reciJedinicu.start();
    			cekaj();
    			reciBroj.release();
    			reciJedinicu.release();
    			reciBroj=null;
    			reciJedinicu=null;
    			return;
    		case 7:
    			reciBroj=MediaPlayer.create(this, R.raw.sedam);
    			reciJedinicu=MediaPlayer.create(this, R.raw.sati);
    			reciBroj.start();
    			cekaj();
    			reciJedinicu.start();
    			cekaj();
    			reciBroj.release();
    			reciJedinicu.release();
    			reciBroj=null;
    			reciJedinicu=null;
    			return;
    		case 8:
    			reciBroj=MediaPlayer.create(this, R.raw.osam);
    			reciJedinicu=MediaPlayer.create(this, R.raw.sati);
    			reciBroj.start();
    			cekaj();
    			reciJedinicu.start();
    			cekaj();
    			reciBroj.release();
    			reciJedinicu.release();
    			reciBroj=null;
    			reciJedinicu=null;
    			return;
    		case 9:
    			reciBroj=MediaPlayer.create(this, R.raw.devet);
    			reciJedinicu=MediaPlayer.create(this, R.raw.sati);
    			reciBroj.start();
    			cekaj();
    			reciJedinicu.start();
    			cekaj();
    			reciBroj.release();
    			reciJedinicu.release();
    			reciBroj=null;
    			reciJedinicu=null;
    			return;
    		}
		}
   }
   public void minuti(int m)
   {
   		int m1=m/10;
   		int m2=m%10;
   		MediaPlayer reciBroj;
   		MediaPlayer reciJedinicu;
   		if (m1==1) //za brojeve čudnih imena 10-19
   		{
   			switch(m2)
   			{
   			case 0:
   				reciBroj=MediaPlayer.create(this, R.raw.deset);
   				reciBroj.start();
   				cekaj();
   				reciBroj.release();
   				reciBroj=null;
   				break;
   			case 1:
   				reciBroj=MediaPlayer.create(this, R.raw.jedanaest);
   				reciBroj.start();
   				cekaj();
   				reciBroj.stop();
   				reciBroj.release();
   				reciBroj=null;
   				break;
   			case 2:
   				reciBroj=MediaPlayer.create(this, R.raw.dvanaest);
   				reciBroj.start();
   				cekaj();
   				reciBroj.release();
   				reciBroj=null;
   				break;
   			case 3:
   				reciBroj=MediaPlayer.create(this, R.raw.trinaest);
   				reciBroj.start();
   				cekaj();
   				reciBroj.release();
   				reciBroj=null;
   				break;
   			case 4:
   				reciBroj=MediaPlayer.create(this, R.raw.cetrnaest);
   				reciBroj.start();
   				cekaj();
   				reciBroj.release();
   				reciBroj=null;
   				break;
   			case 5:
   				reciBroj=MediaPlayer.create(this, R.raw.petnaest);
   				reciBroj.start();
   				cekaj();
   				reciBroj.release();
   				reciBroj=null;
   				break;
   			case 6:
   				reciBroj=MediaPlayer.create(this, R.raw.sesnaest);
   				reciBroj.start();
   				cekaj();
   				reciBroj.release();
   				reciBroj=null;
   				break;
   			case 7:
   				reciBroj=MediaPlayer.create(this, R.raw.sedamnaest);
   				reciBroj.start();
   				cekaj();
   				reciBroj.release();
   				reciBroj=null;
   				break;
   			case 8:
   				reciBroj=MediaPlayer.create(this, R.raw.osamnaest);
   				reciBroj.start();
   				cekaj();
   				reciBroj.release();
   				reciBroj=null;
   				break;
   			case 9:
   				reciBroj=MediaPlayer.create(this, R.raw.devetnaest);
   				reciBroj.start();
   				cekaj();
   				reciBroj.release();
   				reciBroj=null;
   				break;
   			}
   			reciJedinicu=MediaPlayer.create(this, R.raw.minuta);
   			reciJedinicu.start();
   			cekaj();
   			reciJedinicu.release();
   			reciJedinicu=null;
   			return;
   		}
   		else //za brojeve sa logičnim imenima
   		{
   			switch(m1)
   			{
   			case 0:
   				if (m2==0)
   				{
   					reciBroj=MediaPlayer.create(this, R.raw.nula); 
   					reciJedinicu=MediaPlayer.create(this, R.raw.minuta);
   					reciBroj.start();
   					cekaj();		
   					reciJedinicu.start();
   					cekaj();
   					reciBroj.release();  
   					reciJedinicu.release();
   					reciBroj=null;  
   					reciJedinicu=null;
   					return;
   				}
   				break;
   			case 2:
   				reciBroj=MediaPlayer.create(this, R.raw.dvadeset);
   				reciBroj.start();
   				cekaj();
   				reciBroj.reset();
   				break;
   			case 3:
   				reciBroj=MediaPlayer.create(this, R.raw.trideset);
   				reciBroj.start();
   				cekaj();
   				reciBroj.reset();
   				break;
   			case 4:
   				reciBroj=MediaPlayer.create(this, R.raw.cetrdeset);
   				reciBroj.start();
   				cekaj();
   				reciBroj.reset();
   				break;
   			case 5:
   				reciBroj=MediaPlayer.create(this, R.raw.pedeset);
   				reciBroj.start();
   				cekaj();
   				reciBroj.reset();
   				break;
   			}
   			switch(m2)
   			{
   			case 0:
   				reciJedinicu=MediaPlayer.create(this, R.raw.minuta);
   				reciJedinicu.start();
   				cekaj();
   				reciJedinicu.release();
   				reciJedinicu=null;    			
   				return;
   			case 1:
   				reciBroj=MediaPlayer.create(this, R.raw.jedan);
   				reciJedinicu=MediaPlayer.create(this, R.raw.minut);
   				reciBroj.start();
   				cekaj();
   				reciJedinicu.start();
   				cekaj();
   				reciBroj.release();
   				reciJedinicu.release();
   				reciBroj=null;
   				reciJedinicu=null;
   				return;
   			case 2:
   				reciBroj=MediaPlayer.create(this, R.raw.dva);
   				reciJedinicu=MediaPlayer.create(this, R.raw.minuta);
   				reciBroj.start();
   				cekaj();
   				reciJedinicu.start();
   				cekaj();
   				reciBroj.release();
   				reciJedinicu.release();
   				reciBroj=null;
   				reciJedinicu=null;
   				return;
   			case 3:
   				reciBroj=MediaPlayer.create(this, R.raw.tri);
   				reciJedinicu=MediaPlayer.create(this, R.raw.minuta);
   				reciBroj.start();
   				cekaj();
   				reciJedinicu.start();
   				cekaj();
   				reciBroj.release();
   				reciJedinicu.release();
   				reciBroj=null;
   				reciJedinicu=null;
   				return;
   			case 4:
   				reciBroj=MediaPlayer.create(this, R.raw.cetiri);
   				reciJedinicu=MediaPlayer.create(this, R.raw.minuta);
   				reciBroj.start();
   				cekaj();
   				reciJedinicu.start();
   				cekaj();
   				reciBroj.release();
   				reciJedinicu.release();
   				reciBroj=null;
   				reciJedinicu=null;
   				return;
   			case 5:
   				reciBroj=MediaPlayer.create(this, R.raw.pet);
   				reciJedinicu=MediaPlayer.create(this, R.raw.minuta);
   				reciBroj.start();
   				cekaj();
   				reciJedinicu.start();
   				cekaj();
   				reciBroj.release();
   				reciJedinicu.release();
   				reciBroj=null;
   				reciJedinicu=null;
   				return;
   			case 6:
   				reciBroj=MediaPlayer.create(this, R.raw.sest);
   				reciJedinicu=MediaPlayer.create(this, R.raw.minuta);
   				reciBroj.start();
   				cekaj();
   				reciJedinicu.start();
   				cekaj();
   				reciBroj.release();
   				reciJedinicu.release();
   				reciBroj=null;
   				reciJedinicu=null;
   				return;
   			case 7:
   				reciBroj=MediaPlayer.create(this, R.raw.sedam);
   				reciJedinicu=MediaPlayer.create(this, R.raw.minuta);
   				reciBroj.start();
   				cekaj();
   				reciJedinicu.start();
   				cekaj();
   				reciBroj.release();
   				reciJedinicu.release();
   				reciBroj=null;
   				reciJedinicu=null;
   				return;
   			case 8:
   				reciBroj=MediaPlayer.create(this, R.raw.osam);
   				reciJedinicu=MediaPlayer.create(this, R.raw.minuta);
   				reciBroj.start();
   				cekaj();
   				reciJedinicu.start();
   				cekaj();
   				reciBroj.release();
   				reciJedinicu.release();
   				reciBroj=null;
   				reciJedinicu=null;
   				return;
   			case 9:
   				reciBroj=MediaPlayer.create(this, R.raw.devet);
   				reciJedinicu=MediaPlayer.create(this, R.raw.minuta);
   				reciBroj.start();
   				cekaj();
   				reciJedinicu.start();
   				cekaj();
   				reciBroj.release();
   				reciJedinicu.release();
   				reciBroj=null;
   				reciJedinicu=null;
   				return;
   			}
   		}
   	}
}