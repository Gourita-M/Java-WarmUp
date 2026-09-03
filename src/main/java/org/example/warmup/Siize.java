package org.example.warmup;

import java.nio.file.Path;
import java.io.IOException;
import java.nio.file.Files;

public class Siize {
    public String filePath;

    public Siize(String filePath){
        this.filePath = filePath;
    }

    public void getFileSize() throws IOException
    {
        Path path = Path.of(filePath);

        long size = Files.size(path);

        System.out.println(path.getFileName() + " : " + size + " Bytes");
    }
}
