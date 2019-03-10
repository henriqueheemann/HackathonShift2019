package model;

import com.aspose.ocr.ImageStream;
import view.camSec;

public class Main {

    public static void main(String[] args) {
        new camSec().setVisible(true);

    }

    public static String identificaUsandoOCR(String imagem) {

        com.aspose.ocr.OcrEngine engine = new com.aspose.ocr.OcrEngine();

        engine.setImage(ImageStream.fromFile(imagem));

        try {
            if (engine.process()) {
                System.out.println(engine.getText());
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        return engine.getText().toString();
    }
}
