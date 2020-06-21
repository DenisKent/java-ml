package textRecognition;

import net.sourceforge.tess4j.ITesseract;
import net.sourceforge.tess4j.Tesseract;
import net.sourceforge.tess4j.TesseractException;

import java.io.File;

public class TextRecognition {
    public static void main(String[] args) {
        ITesseract image = new Tesseract();
        image.setDatapath("C:\\Users\\Hypaman\\IdeaProjects\\OSRS\\tessdata");
        try {
            String str = image.doOCR(new File("C:\\Users\\Hypaman\\Pictures\\snapshot3.png"));
            System.out.println("datta from Image is " + str);
        } catch (TesseractException e) {
            System.out.println("Exception details" + e.getMessage());
            e.printStackTrace();
        }
    }
}

// two helpful videos:
// https://www.youtube.com/watch?v=6sdhCwfP-lg
// https://www.youtube.com/watch?v=5DqW9KP-aQo&t=191s

// extension, locate the text in the image before feeding it to tess4j:
// https://www.pyimagesearch.com/2018/09/17/opencv-ocr-and-text-recognition-with-tesseract/
// https://www.pyimagesearch.com/2018/08/20/opencv-text-detection-east-text-detector/


//import org.opencv.core.Core;
//import org.opencv.core.Mat;
//import org.opencv.core.CvType;
//import org.opencv.core.Scalar;