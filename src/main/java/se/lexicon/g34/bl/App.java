package se.lexicon.g34.bl;

import se.lexicon.g34.bl.util.CopyFile;

/**
 * Java I/O and Serialization practices
 * 4. Create a method that can copy a file using both BufferedInputStream and BufferedOutputStream.
 */
public class App {
    public static void main(String[] args) {
        CopyFile.copyFile("BL013954.jpg", "Copy of BL013954.jpg");


    }
}
