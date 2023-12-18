package SupportingFunctions;

import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Paths;

public class FileManipulations {
    public static String readFile(String path, Charset utf8) throws IOException {
        {
            byte[] encoded = Files.readAllBytes(Paths.get(path));
            return new String(encoded, utf8);
        }
    }
}
