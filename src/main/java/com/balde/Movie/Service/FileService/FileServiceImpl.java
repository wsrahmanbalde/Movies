package com.balde.Movie.Service.FileService;

import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
@Service
public class FileServiceImpl implements FileService{
    @Override
    public String UploadFile(String path, MultipartFile file) throws IOException {
        return null;
    }

    @Override
    public InputStream getResourceFile(String path, String name) throws FileNotFoundException {
        return null;
    }
}
