package se.lexicon.g34.bl.util;

import java.io.*;
import java.sql.SQLOutput;

public class CopyFile {
    public static void copyFile(String source, String dest) {
        BufferedInputStream from = null;
        BufferedOutputStream to = null;
        try {
            from = new BufferedInputStream(new FileInputStream(source));
            to = new BufferedOutputStream(new FileOutputStream(dest));
            int buffer = 0;
            while (buffer != -1) {
                buffer = from.read();
                to.write(buffer);
            }
        } catch (FileNotFoundException e) {
            System.out.println("Something went wrong. Back to the drawingboards");
        } catch (IOException e) {
            System.out.println("Couldnät read or write file. Back to the drawingboard");
        } finally {
            try {
                to.flush();
            } catch (IOException e) {
                System.out.println("Couldn't flush the buffers. Back to the Drawingboard");
                e.printStackTrace();
            }
            try {
                if (to != null) to.close();
                if (from != null) from.close();
            } catch (IOException e) {
                System.out.println("Couldn't close the files");
            }

        }
    }
}
