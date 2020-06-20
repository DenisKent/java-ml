package screenCapture;
import java.awt.Toolkit;
import java.awt.Dimension;
import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Rectangle;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;

public class ScreenCapture {
    public ScreenCapture (){

    }
    public static void main(String[] args) throws AWTException, IOException {
        System.out.println("running main");
        ScreenCapture capture = new ScreenCapture();
        BufferedImage image = capture.getSnapshot();
        ImageIO.write(image, "jpg", new File("C:\\Users\\Hypaman\\IdeaProjects\\OSRS\\snapshots/fullWindow.jpg"));
        System.out.println("Wrote file.");
    }

    public BufferedImage getSnapshot() throws AWTException {
        Toolkit t = Toolkit.getDefaultToolkit();
        Dimension d = t.getScreenSize();
        Rectangle rectangle = new Rectangle(0, 0, d.width, d.height);
        return new Robot().createScreenCapture(rectangle);
    }

}
