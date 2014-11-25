package q5;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 * <p>Pie Chart.java makes a Pie Chart with different color in each slices
 * while making it inside the circle provided by the template.</p>
 *
 * @author Juven Ardine Hernanto Putra
 * @version 1.0
 */
public class PieChart extends JFrame {
    /**
     * <p>Generated serialVersionUID.</p>
     */
    private static final long serialVersionUID = -5890104607890453878L;

    /**
     * <p>The x position of the text.</p>
     */
    private static final int X_POSITION = 20;

    /**
     * <p>The y position of the text.</p>
     */
    private static final int Y_POSITION = 20;
    
    /**
     * <p>The x position of the Pie Chart.</p>
     */
    private static final int POS_X = 50;
    
    /**
     * <p>The y position of the Pie Chart.</p>
     */
    private static final int POS_Y = 50;

    /**
     * <p>X size of the Pie Chart.</p>
     */
    private static final int X_SIZE = 80;

    /**
     * <p>Y size of the Pie Chart.</p>
     */
    private static final int Y_SIZE = 80;
    
    /**
     * <p> Sets the angles for the Pie Chart.</p>
     */

    private static final int ANGLE45 = 45;
    
    private static final int ANGLE90 = 90;
    
    private static final int ANGLE135 = 135;
    
    private static final int ANGLE180 = 180;
    
    private static final int ANGLE225 = 225;
    
    private static final int ANGLE270 = 270;
    
    private static final int ANGLE315 = 315;
    
    /**
     * <p>The default constructor which sets the title of this app, sets the
     * default close operation to exit, creates a new content pane and finally
     * sets size and sets the visibility of this frame to true (show).</p>
     */
    public PieChart() {
        super("Cut the pie!");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setContentPane(new PieChartPanel());
        setSize(350, 220); // you can change this size but don't make it HUGE!
        setVisible(true);
    }

    /**
     * <p>A panel that acts as the Frame's content pane.</p>
     */
    class PieChartPanel extends JPanel {

        /**
         * <p>Generated serialVersionUID.</p>
         */
        private static final long serialVersionUID = 9016261747983490808L;
        /**
         * <p>An image object that can be used to paint to the panel.</p>
         */
        Image img = null;

        /**
         * <p>The default contructor that retreives an image to draw.</p>
         */
        public PieChartPanel() {
        }

        /**
         * <p>Called by the environment when the frame needs to be updated.</p>
         *
         * @param g the graphics context with which we paint into.
         */
        public void paintComponent(Graphics g) {
            super.paintComponent(g);
            setBackground(new Color(60, 255, 140));
            g.setColor(new Color(140, 50, 200));
            g.drawString("Something interesting ...", X_POSITION, Y_POSITION);
            g.drawOval(50, 50, 80, 80);
            
            
            
            g.setColor(Color.red);
            g.drawOval(POS_X, POS_Y, X_SIZE, Y_SIZE);
            
            g.setColor(Color.orange);
            g.fillArc(POS_X, POS_Y, X_SIZE, Y_SIZE, 0, ANGLE45);
            
            g.setColor(Color.blue);
            g.fillArc(POS_X, POS_Y, X_SIZE, Y_SIZE, ANGLE45, ANGLE45);
            
            g.setColor(Color.gray);
            g.fillArc(POS_X, POS_Y, X_SIZE, Y_SIZE, ANGLE90, ANGLE45);
            
            g.setColor(Color.green);
            g.fillArc(POS_X, POS_Y, X_SIZE, Y_SIZE, ANGLE135, ANGLE45);
            
            g.setColor(Color.pink);
            g.fillArc(POS_X, POS_Y, X_SIZE, Y_SIZE, ANGLE180, ANGLE45);
            
            g.setColor(Color.white);
            g.fillArc(POS_X, POS_Y, X_SIZE, Y_SIZE, ANGLE225, ANGLE45);
            
            g.setColor(Color.black);
            g.fillArc(POS_X, POS_Y, X_SIZE, Y_SIZE, ANGLE270, ANGLE45);
            
            g.setColor(Color.cyan);
            g.fillArc(POS_X, POS_Y, X_SIZE, Y_SIZE, ANGLE315, ANGLE45);
            
        }
    }

    /**
     * <p>The main method.</p>
     */
    public static void main(String[] args) {
        /**
         * <p>This is the main method (entry point) 
         * that gets called by the JVM.</p>
         *
         * @param args
         */
        new PieChart();
        
        
    }

}
