import java.awt.Dimension;
import java.awt.GraphicsDevice;
import java.awt.GraphicsEnvironment;
import javax.swing.JFrame;

public class FullScreenDimensions {

    public static void main(String[] args) {
        // Get the default screen device
        GraphicsEnvironment env = GraphicsEnvironment.getLocalGraphicsEnvironment();
        GraphicsDevice device = env.getDefaultScreenDevice();

        // Create a JFrame and set it to full screen
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setUndecorated(true); // Remove window decorations (title bar, borders, etc.)

        // Set the JFrame to full screen mode
        device.setFullScreenWindow(frame);

        // Get the dimensions of the full screen
        Dimension screenSize = frame.getSize();
        int screenWidth = screenSize.width;
        int screenHeight = screenSize.height;

        System.out.println("Screen width: " + screenWidth);
        System.out.println("Screen height: " + screenHeight);

        // Exit full screen and restore the windowed mode
        device.setFullScreenWindow(null);
    }
}