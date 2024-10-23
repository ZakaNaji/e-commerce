package com.znaji.ecommerce_app.service.impl;

import com.znaji.ecommerce_app.service.FileService;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardCopyOption;

@Service
public class FileServiceImpl implements FileService {

    @Override
    public String uploadImage(MultipartFile image) throws IOException {
        final String fileName = StringUtils.cleanPath(image.getOriginalFilename());
        final File folder = new File("src/main/resources/static/images");
        if (!folder.exists()) {
            folder.mkdirs();
        }
        final Path path = Path.of(folder.getPath() +File.separator +  fileName);
        Files.copy(image.getInputStream(), path, StandardCopyOption.REPLACE_EXISTING);
        return fileName;
    }
}
