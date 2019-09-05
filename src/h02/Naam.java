package h02;

import java.awt.*;
import java.applet.*;

public class Naam extends Applet {

    //een (lege) methode die de Applet initialiseer
    public void init() {
        setBackground(Color.MAGENTA);
    }

    //een methode die de inhoud van het scherm tekent
    public void paint(Graphics g) {
        setBackground(Color.RED);
        g.drawString("Hensley Hubert", 50, 60 );
    }
}


