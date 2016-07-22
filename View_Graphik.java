import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.geom.*;

public class View_Graphik extends JFrame implements Beobachter
{
    private Graphics2D a;
    private Graphics gh;
    public View_Graphik()
    {
        super("Graphik1");
        setBounds(100, 50, 850, 850);
        setVisible(true);
    }

    public void paint(Graphics g){
        a = (Graphics2D) g;
        gh = g;
        super.paint(g);
        spielfeld(g);
        /*
        Wenn updateView() in der paint methode aufgerufen wird, funktionierts, unter 
        der laufzeit aber ned
        */
        

        Graphics2D ga = (Graphics2D)g;
        ga.setPaint(Color.red);
        Shape circle = new Ellipse2D.Float(105.0f, 705.0f, 90.0f, 90.0f);
        ga.draw(circle);
        ga.fill(circle);
        
        Graphics2D ga1 = (Graphics2D)g;
        ga1.setPaint(Color.blue);
        Shape circle1 = new Ellipse2D.Float(205.0f, 705.0f, 90.0f, 90.0f);
        ga1.draw(circle1);
        ga1.fill(circle1);
        
        //updateView();
    }

    public void updateView(){
        //??????????????????????????????????????????????????????????????????????????
        Graphics2D ga = a;
        ga.setPaint(Color.blue);
        Shape circle2 = new Ellipse2D.Float(105.0f, 605.0f, 90.0f, 90.0f);
        ga.draw(circle2);
        ga.fill(circle2);
    }

    /*public void zeichnen(String farbe, int x){
        if(farbe == "rot"){
            final Graphics2D ga = (Graphics2D)g;
            ga.setPaint(Color.red);
            Shape circle = new Ellipse2D.Float(105.0f, 705.0f, 90.0f, 90.0f);
            ga.draw(circle);
            ga.fill(circle);
        }
        if(farbe == "blau"){
            Graphics2D ga1 = (Graphics2D)g;
            ga1.setPaint(Color.blue);
            Shape circle1 = new Ellipse2D.Float(205.0f, 705.0f, 90.0f, 90.0f);
            ga1.draw(circle1);
            ga1.fill(circle1);
        }
    }
    */
   
    public void spielfeld(Graphics g){
        Graphics2D sf = (Graphics2D)g;
        sf.setPaint(Color.black);
        for(int i=0; i<7; i++){
            for(int j=0; j<7; j++){
                Shape x = new Rectangle2D.Float((i+1) * 100.0f, (j+1) * 100.0f, 100.0f, 100.0f);
                sf.draw(x);
            }
        }
    }
    
    public void knoepfe(Graphics g){
        Graphics2D k = (Graphics2D)g;
        k.setPaint(Color.black);
    }

    private Graphics getGraph(){
        return a;
    }
}
