package PictureFileRead;
import java.io.*;

public class ReadWritePictureFile {

    public static void main(String[] args) {
        String inputFilePath = "src/PictureFileRead/dog.png";
        String outputFilePath = "src/PictureFileRead/dog_copy.png";

        FileInputStream fis = null;
        FileOutputStream fos = null;

        try {
            fis = new FileInputStream(inputFilePath);
            fos = new FileOutputStream(outputFilePath);


            byte[] buffer = new byte[1024];
            int bytesRead;


            while ((bytesRead = fis.read(buffer)) != -1) {
                fos.write(buffer, 0, bytesRead);
            }

            System.out.println("Image file copied successfully.");

        } catch (IOException e) {
            System.err.println("Error reading/writing the image file: " + e.getMessage());
            e.printStackTrace();
        } finally {
            try {
                if (fis != null) {
                    fis.close();
                }
                if (fos != null) {
                    fos.close();
                }
            } catch (IOException e) {
                System.err.println("Error closing streams: " + e.getMessage());
                e.printStackTrace();
            }
        }
    }
}
