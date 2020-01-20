import static java.lang.System.*;

import java.awt.*;
import java.awt.image.*;
import java.io.*;

import javax.imageio.ImageIO;

public class Smallbat extends Monster implements Thing
{
	private Image img;
	private boolean imgFound;

	public Smallbat()
	{
		super("Smallbat",new Position(0,0),5,20);
	}
    public Smallbat(String n,Position p,int de,int da)
    {
    	super(n,p,de,da);
    	currentHealth = 100;
    	maxHealth = 100;
    }
    public String getType()
    {
    	return "Smallbat";
    }
    public void draw(Graphics window,int x,int y)
    {
    		window.setColor(Color.BLUE);
    		window.fillOval(x+8, y+11, 45-16, 45-16);
    		window.setColor(Color.BLACK);
   		 	window.fillOval(x+14, y+15, 5, 5); //eyes
   		 	window.fillOval(x+25, y+15, 5, 5); //eyes
    		imgFound = false;
    		//window.drawString("Slime", x+7, y+33);

		//health bar
		window.setColor(Color.RED);
		window.fillRect(x,y,45,9);
		window.setColor(Color.GREEN);
		window.fillRect(x,y,(int)((double)currentHealth/(double)(maxHealth)*45),9);

    }
    public void draw(Graphics window, int scale, int x, int y)
    {
    		window.setColor(Color.BLUE);
    		window.fillOval(x+8*scale/45, y+11*scale/45, scale-16*scale/45, scale-16*scale/45);
    		window.setColor(Color.BLACK);
   		 	window.fillOval(x+14*scale/45, y+15*scale/45, 5*scale/45, 5*scale/45); //eyes
   		 	window.fillOval(x+25*scale/45, y+15*scale/45, 5*scale/45, 5*scale/45); //eyes
    		imgFound = false;
    		//window.drawString("Slime", x+7*scale/45, y+33*scale/45);


		//health bar
		window.setColor(Color.RED);
		window.fillRect(x,y,scale-1,9*scale/45);
		window.setColor(Color.GREEN);
		window.fillRect(x,y,(int)((double)currentHealth/(double)(maxHealth)*(scale-1)),9*scale/45);

    }
    public String toString()
    {
		return super.toString()+" damage: "+damage;
    }
}
