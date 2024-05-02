package com.balde.Movie.Service.FileService;

import org.springframework.web.multipart.MultipartFile;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public interface FileService {
    String UploadFile(String path , MultipartFile file) throws IOException;
    InputStream getResourceFile(String path , String name) throws FileNotFoundException;
}
