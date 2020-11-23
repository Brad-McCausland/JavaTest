import java.awt.Graphics;
import java.awt.Color;

public class App {
    public static void main(String[] args) throws Exception {
        DrawingPanel panel = new DrawingPanel(600, 400);
        Graphics g = panel.getGraphics();
        panel.setBackground(Color.RED);
    }
}
