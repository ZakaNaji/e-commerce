package com.znaji.ecommerce_app.service;

import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;

public interface FileService {
    String uploadImage(MultipartFile image) throws IOException;
}
