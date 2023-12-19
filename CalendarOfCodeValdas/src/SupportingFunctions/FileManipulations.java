package SupportingFunctions;

import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Paths;

public class FileManipulations {
    public static String readFile(String path, Charset utf8) throws IOException {
        {
            System.out.println(path);

            //For checking all current files
            //File file = new File(".");
            //for(String fileNames : file.list()) System.out.println(fileNames);

            byte[] encoded = Files.readAllBytes(Paths.get(path));
            return new String(encoded, utf8);
        }
    }
}
