package nidzo.govorni.satICS;

import android.app.Activity;
import android.text.format.Time;
import android.os.Bundle;
import android.media.MediaPlayer;

public class GovorniSatICSActivity extends Activity {
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        Time t=new Time();
        t.setToNow();
        int h=t.hour;
        int m=t.minute;    
        MediaPlayer i=MediaPlayer.create(this, R.raw.i);    
        sati(h);
        i.start();
        cekaj();
        minuti(m);
        cekaj();
        i.release();
        System.runFinalizersOnExit(true);
        System.exit(0);
    }
    public void cekaj()
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
    	MediaPlayer sat=MediaPlayer.create(this, R.raw.sat);
        MediaPlayer sati=MediaPlayer.create(this, R.raw.sati);
        MediaPlayer sata=MediaPlayer.create(this, R.raw.sata);
    	int h1=h/10;
    	int h2=h%10;
    	if (h1==0)
    	{
    		if (h2==0)
    		{
    			MediaPlayer s=MediaPlayer.create(this, R.raw.nula);
    			s.start();
    			cekaj();
    			sati.start();
    			cekaj();
    			s.release();
    		}
    		if (h2==1)
    		{
    			MediaPlayer s=MediaPlayer.create(this, R.raw.jedan);
    			s.start();
    			cekaj();
    			sat.start();
    			cekaj();
    			s.release();
    		}
    		if (h2==2)
    		{
    			MediaPlayer s=MediaPlayer.create(this, R.raw.dva);
    			s.start();
    			cekaj();
    			sata.start();
    			cekaj();
    			s.release();
    		}
    		if (h2==3)
    		{
    			MediaPlayer s=MediaPlayer.create(this, R.raw.tri);
    			s.start();
    			cekaj();
    			sata.start();
    			cekaj();
    			s.release();
    		}
    		if (h2==4)
    		{
    			MediaPlayer s=MediaPlayer.create(this, R.raw.cetiri);
    			s.start();
    			cekaj();
    			sata.start();
    			cekaj();
    			s.release();
    		}
    		if (h2==5)
    		{
    			MediaPlayer s=MediaPlayer.create(this, R.raw.pet);
    			s.start();
    			cekaj();
    			sati.start();
    			cekaj();
    			s.release();
    		}
    		if (h2==6)
    		{
    			MediaPlayer s=MediaPlayer.create(this, R.raw.sest);
    			s.start();
    			cekaj();
    			sati.start();
    			cekaj();
    			s.release();
    		}
    		if (h2==7)
    		{
    			MediaPlayer s=MediaPlayer.create(this, R.raw.sedam);
    			s.start();
    			cekaj();
    			sati.start();
    			cekaj();
    			s.release();
    		}
    		if (h2==8)
    		{
    			MediaPlayer s=MediaPlayer.create(this, R.raw.osam);
    			s.start();
    			cekaj();
    			sati.start();
    			cekaj();
    			s.release();
    		}
    		if (h2==9)
    		{
    			MediaPlayer s=MediaPlayer.create(this, R.raw.devet);
    			s.start();
    			cekaj();
    			sati.start();
    			cekaj();
    			s.release();
    		}
    	}
    	if (h1==1)
    	{
    		if (h2==0)
    		{
    			MediaPlayer s=MediaPlayer.create(this, R.raw.deset);
    			s.start();
    			cekaj();
    			sati.start();
    			cekaj();
    			s.release();
    		}
    		if (h2==1)
    		{
    			MediaPlayer s=MediaPlayer.create(this, R.raw.jedanaest);
    			s.start();
    			cekaj();
    			sati.start();
    			cekaj();
    			s.release();
    		}
    		if (h2==2)
    		{
    			MediaPlayer s=MediaPlayer.create(this, R.raw.dvanaest);
    			s.start();
    			cekaj();
    			sati.start();
    			cekaj();
    			s.release();
    		}
    		if (h2==3)
    		{
    			MediaPlayer s=MediaPlayer.create(this, R.raw.trinaest);
    			s.start();
    			cekaj();
    			sati.start();
    			cekaj();
    			s.release();
    		}
    		if (h2==4)
    		{
    			MediaPlayer s=MediaPlayer.create(this, R.raw.cetrnaest);
    			s.start();
    			cekaj();
    			sati.start();
    			cekaj();
    			s.release();
    		}
    		if (h2==5)
    		{
    			MediaPlayer s=MediaPlayer.create(this, R.raw.petnaest);
    			s.start();
    			cekaj();
    			sati.start();
    			cekaj();
    			s.release();
    		}
    		if (h2==6)
    		{
    			MediaPlayer s=MediaPlayer.create(this, R.raw.sesnaest);
    			s.start();
    			cekaj();
    			sati.start();
    			cekaj();
    			s.release();
    		}
    		if (h2==7)
    		{
    			MediaPlayer s=MediaPlayer.create(this, R.raw.sedamnaest);
    			s.start();
    			cekaj();
    			sati.start();
    			cekaj();
    			s.release();
    		}
    		if (h2==8)
    		{
    			MediaPlayer s=MediaPlayer.create(this, R.raw.osamnaest);
    			s.start();
    			cekaj();
    			sati.start();
    			cekaj();
    			s.release();
    		}
    		if (h2==9)
    		{
    			MediaPlayer s=MediaPlayer.create(this, R.raw.devetnaest);
    			s.start();
    			cekaj();
    			sati.start();
    			cekaj();
    			s.release();
    		}
    	}
    	if (h1==2)
    	{
    		if (h2==0)
    		{
    			MediaPlayer s=MediaPlayer.create(this, R.raw.dvadeset);
    			s.start();
    			cekaj();
    			sati.start();
    			cekaj();
    			s.release();
    		}
    		if (h2==1)
    		{
    			MediaPlayer s1=MediaPlayer.create(this, R.raw.dvadeset);
    			MediaPlayer s2=MediaPlayer.create(this, R.raw.jedan);
    			s1.start();
    			cekaj();
    			s2.start();
    			cekaj();
    			sat.start();
    			cekaj();
    			s1.release();
    			s2.release();
    		}
    		if (h2==2)
    		{
    			MediaPlayer s1=MediaPlayer.create(this, R.raw.dvadeset);
    			MediaPlayer s2=MediaPlayer.create(this, R.raw.dva);
    			s1.start();
    			cekaj();
    			s2.start();
    			cekaj();
    			sata.start();
    			cekaj();
    			s2.release();
    			s1.release();
    		}
    		if (h2==3)
    		{
    			MediaPlayer s1=MediaPlayer.create(this, R.raw.dvadeset);
    			MediaPlayer s2=MediaPlayer.create(this, R.raw.tri);
    			s1.start();
    			cekaj();
    			s2.start();
    			cekaj();
    			sata.start();
    			cekaj();
    			s2.release();
    			s1.release();
    		}
    	}
    	sati.release();
    	sat.release();
    	sata.release();
    }
    public void minuti(int m)
    {
    	MediaPlayer minut=MediaPlayer.create(this, R.raw.minut);
        MediaPlayer minuta=MediaPlayer.create(this, R.raw.minuta);
        int m1=m/10;
        int m2=m%10;
        if (m1==0 && m2==0)
        {
        	MediaPlayer mi=MediaPlayer.create(this, R.raw.nula);
    		mi.start();
    		cekaj();
    		minuta.start();
    		cekaj();
    		mi.release();
        }
        if (m1==1)
        {
        	if (m2==0)
        	{
        		MediaPlayer mi=MediaPlayer.create(this, R.raw.deset);
        		mi.start();
        		cekaj();
        		minuta.start();
        		cekaj();
        		mi.release();
        	}
        	if (m2==1)
        	{
        		MediaPlayer mi=MediaPlayer.create(this, R.raw.jedanaest);
        		mi.start();
        		cekaj();
        		minuta.start();
        		cekaj();
        		mi.release();
        	}
        	if (m2==2)
        	{
        		MediaPlayer mi=MediaPlayer.create(this, R.raw.dvanaest);
        		mi.start();
        		cekaj();
        		minuta.start();
        		cekaj();
        		mi.release();
        	}
        	if (m2==3)
        	{
        		MediaPlayer mi=MediaPlayer.create(this, R.raw.trinaest);
        		mi.start();
        		cekaj();
        		minuta.start();
        		cekaj();
        		mi.release();
        	}
        	if (m2==4)
        	{
        		MediaPlayer mi=MediaPlayer.create(this, R.raw.cetrnaest);
        		mi.start();
        		cekaj();
        		minuta.start();
        		cekaj();
        		mi.release();
        	}
        	if (m2==5)
        	{
        		MediaPlayer mi=MediaPlayer.create(this, R.raw.petnaest);
        		mi.start();
        		cekaj();
        		minuta.start();
        		cekaj();
        		mi.release();
        	}
        	if (m2==6)
        	{
        		MediaPlayer mi=MediaPlayer.create(this, R.raw.sesnaest);
        		mi.start();
        		cekaj();
        		minuta.start();
        		cekaj();
        		mi.release();
        	}
        	if (m2==7)
        	{
        		MediaPlayer mi=MediaPlayer.create(this, R.raw.sedamnaest);
        		mi.start();
        		cekaj();
        		minuta.start();
        		cekaj();
        		mi.release();
        	}
        	if (m2==8)
        	{
        		MediaPlayer mi=MediaPlayer.create(this, R.raw.osamnaest);
        		mi.start();
        		cekaj();
        		minuta.start();
        		cekaj();
        		mi.release();
        	}
        	if (m2==9)
        	{
        		MediaPlayer mi=MediaPlayer.create(this, R.raw.devetnaest);
        		mi.start();
        		cekaj();
        		minuta.start();
        		cekaj();
        		mi.release();
        	}
        	
        }
        if (m1>1)
        {
        	if (m1==2)
        	{
        		MediaPlayer mi=MediaPlayer.create(this, R.raw.dvadeset);
        		mi.start();
        		cekaj();
        		if (m2==0)
        		{
        			minuta.start();
        			cekaj();
        		}
        		mi.release();
        	}
        	if (m1==3)
        	{
        		MediaPlayer mi=MediaPlayer.create(this, R.raw.trideset);
        		mi.start();
        		cekaj();
        		if (m2==0)
        		{
        			minuta.start();
        			cekaj();
        		}
        		mi.release();
        	}
        	if (m1==4)
        	{
        		MediaPlayer mi=MediaPlayer.create(this, R.raw.cetrdeset);
        		mi.start();
        		cekaj();
        		if (m2==0)
        		{
        			minuta.start();
        			cekaj();
        		}
        		mi.release();
        	}
        	if (m1==5)
        	{
        		MediaPlayer mi=MediaPlayer.create(this, R.raw.pedeset);
        		mi.start();
        		cekaj();if (m2==0)
        		{
        			minuta.start();
        			cekaj();
        		}
        		mi.release();
        	}
        	if (m2==1)
        	{
        		MediaPlayer mi=MediaPlayer.create(this, R.raw.jedan);
        		mi.start();
        		cekaj();
        		minut.start();
        		cekaj();
        		mi.release();
        	}
        	if (m2==2)
        	{
        		MediaPlayer mi=MediaPlayer.create(this, R.raw.dva);
        		mi.start();
        		cekaj();
        		minuta.start();
        		cekaj();
        		mi.release();
        	}
        	if (m2==3)
        	{
        		MediaPlayer mi=MediaPlayer.create(this, R.raw.tri);
        		mi.start();
        		cekaj();
        		minuta.start();
        		cekaj();
        		mi.release();
        	}
        	if (m2==4)
        	{
        		MediaPlayer mi=MediaPlayer.create(this, R.raw.cetiri);
        		mi.start();
        		cekaj();
        		minuta.start();
        		cekaj();
        		mi.release();
        	}
        	if (m2==5)
        	{
        		MediaPlayer mi=MediaPlayer.create(this, R.raw.pet);
        		mi.start();
        		cekaj();
        		minuta.start();
        		cekaj();
        		mi.release();
        	}
        	if (m2==6)
        	{
        		MediaPlayer mi=MediaPlayer.create(this, R.raw.sest);
        		mi.start();
        		cekaj();
        		minuta.start();
        		cekaj();
        		mi.release();
        	}
        	if (m2==7)
        	{
        		MediaPlayer mi=MediaPlayer.create(this, R.raw.sedam);
        		mi.start();
        		cekaj();
        		minuta.start();
        		cekaj();
        		mi.release();
        	}
        	if (m2==8)
        	{
        		MediaPlayer mi=MediaPlayer.create(this, R.raw.osam);
        		mi.start();
        		cekaj();
        		minuta.start();
        		cekaj();
        		mi.release();
        	}
        	if (m2==9)
        	{
        		MediaPlayer mi=MediaPlayer.create(this, R.raw.devet);
        		mi.start();
        		cekaj();
        		minuta.start();
        		cekaj();
        		mi.release();
        	}
        }
        if (m1==0 && m2>0)
        {
        	if (m2==1)
        	{
        		MediaPlayer mi=MediaPlayer.create(this, R.raw.jedan);
        		mi.start();
        		cekaj();
        		minut.start();
        		cekaj();
        		mi.release();
        	}
        	if (m2==2)
        	{
        		MediaPlayer mi=MediaPlayer.create(this, R.raw.dva);
        		mi.start();
        		cekaj();
        		minuta.start();
        		cekaj();
        		mi.release();
        	}
        	if (m2==3)
        	{
        		MediaPlayer mi=MediaPlayer.create(this, R.raw.tri);
        		mi.start();
        		cekaj();
        		minuta.start();
        		cekaj();
        		mi.release();
        	}
        	if (m2==4)
        	{
        		MediaPlayer mi=MediaPlayer.create(this, R.raw.cetiri);
        		mi.start();
        		cekaj();
        		minuta.start();
        		cekaj();
        		mi.release();
        	}
        	if (m2==5)
        	{
        		MediaPlayer mi=MediaPlayer.create(this, R.raw.pet);
        		mi.start();
        		cekaj();
        		minuta.start();
        		cekaj();
        		mi.release();
        	}
        	if (m2==6)
        	{
        		MediaPlayer mi=MediaPlayer.create(this, R.raw.sest);
        		mi.start();
        		cekaj();
        		minuta.start();
        		cekaj();
        		mi.release();
        	}
        	if (m2==7)
        	{
        		MediaPlayer mi=MediaPlayer.create(this, R.raw.sedam);
        		mi.start();
        		cekaj();
        		minuta.start();
        		cekaj();
        		mi.release();
        	}
        	if (m2==8)
        	{
        		MediaPlayer mi=MediaPlayer.create(this, R.raw.osam);
        		mi.start();
        		cekaj();
        		minuta.start();
        		cekaj();
        		mi.release();
        	}
        	if (m2==9)
        	{
        		MediaPlayer mi=MediaPlayer.create(this, R.raw.devet);
        		mi.start();
        		cekaj();
        		minuta.start();
        		cekaj();
        		mi.release();
        	}
        }
        minut.release();
        minuta.release();
    }
}