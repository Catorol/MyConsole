import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class MyPanel extends JPanel {
    public MyPanel() {
        setBorder(BorderFactory.createLineBorder(Color.black));
    }

    public Dimension getPreferredSize() {
        return new Dimension(1560, 700);
    }

    private int x = 0;
    private int y = 0;
    private int width = 100;
    private int height = 100;
    private int delta = 10;
    private ArrayList<Rectangle> outlist = new ArrayList<Rectangle>();
    public void setSymbols(String parm) {
        segment(1);
        segment(2);
        segment(3);
        segment(4);
        segment(5);
        segment(6);
        segment(7);
    }
    private void segment(int number) {
        switch (number){
            case 1: outlist.add(new Rectangle(x+delta,y,width-delta,y));
                break;
            case 2: outlist.add(new Rectangle(width,y+delta,width,y+(height/2)-delta));
                break;
            case 3: outlist.add(new Rectangle(x+delta,y,width-delta,y));
                break;
            case 4: outlist.add(new Rectangle(width,y+(height/2)+delta,width,y+height-delta));
                break;
            case 5: outlist.add(new Rectangle(x+delta,y+height,width-delta,y+height));
                break;
            case 6: outlist.add(new Rectangle(x,y+(height/2)+delta,x,y+height-delta));
                break;
            case 7: outlist.add(new Rectangle(x,y+delta,x,y+(height/2)-delta));
                break;
        }
    }

    public void paintComponent(Graphics g) {
        super.paintComponent(g);

        // Draw Text
        // g.drawSting("This is my custom Panel!",10,20);
        for (Rectangle rect:outlist) {
            g.drawLine(rect.x, rect.y, rect.width, rect.height);
        }
    }
    private String[] numbers = null;
    private int otstup = 1;

    public void paintComponent(Graphics g) {
        super.paintComponent(g);

        //Draw Text
        //g.drawString("This is my custom Panel!",10,20);
        g.drawLine(x, y, width, height);
    }
}