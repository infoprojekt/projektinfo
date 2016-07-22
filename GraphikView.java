
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.geom.*;

public class View_Graphik extends JFrame implements Beobachter
{
    public View_Graphik()
    {
        super("Graphik1");
        setBounds(300, 300, 1000, 1000);
        setVisible(true);
    }
    public void update(Model model){
    
    }
    public void paint(Graphics g){
        super.paint(g);
        spielfeld(g);
        
        Shape circle = new Ellipse2D.Float(105.0f, 705.0f, 90.0f, 90.0f);
        Graphics2D ga = (Graphics2D)g;
        ga.setPaint(Color.red);
        ga.draw(circle);
        ga.fill(circle);
        
        Graphics2D ga1 = (Graphics2D)g;
        ga1.setPaint(Color.blue);
        Shape circle1 = new Ellipse2D.Float(205.0f, 705.0f, 90.0f, 90.0f);
        ga1.draw(circle1);
        ga1.fill(circle1);
    }
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
}
