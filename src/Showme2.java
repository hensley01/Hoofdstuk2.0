package h02;

import java.awt.*;
import java.applet.*;

    //een klasse met de naam Show van het type Applet
    public class Showme2 extends Applet {

        //een (lege) methode die de Applet initialiseert
        public void init() {setBackground(Color.BLUE);}

        //een methode die de inhoud van het scherm tekent
        public void paint(Graphics g) {
            g.setColor(Color.YELLOW);
            g.drawString("Welcome to Java!!", 50, 60 );

        }
}
