package com.example.resumecreatorproject.service.file;

import com.example.resumecreatorproject.domains.Picture;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardCopyOption;

/**
 * @author "Otajonov Dilshodbek
 * @since 10/29/22 2:45 PM (Saturday)
 * ResumeCreatorProject/IntelliJ IDEA
 */
@Service
@RequiredArgsConstructor
public class FileServiceImpl implements FileService {
    private static Path rootPath = Path.of("/home/dilshodbek/uploads");

    @Override
    public Picture uploadPicture(MultipartFile picture) {
        try {
            String contentType = picture.getContentType();
            String originalFilename = picture.getOriginalFilename();
            long size = picture.getSize();
            String filename = StringUtils.getFilename(originalFilename);
            String filenameExtension = StringUtils.getFilenameExtension(originalFilename);
            String generatedName = System.currentTimeMillis() + "." + filenameExtension;
            Path uploadPath = rootPath.resolve(generatedName);
            Picture uploads = Picture
                    .builder()
                    .contentType(contentType)
                    .originalName(filename)
                    .size(size)
                    .generatedName(generatedName)
                    .path(uploadPath.toString())
                    .build();
            Files.copy(picture.getInputStream(), uploadPath, StandardCopyOption.REPLACE_EXISTING);
            return uploads;
        } catch (IOException e) {
            e.printStackTrace();
            throw new RuntimeException("Something wrong try again");
        }
    }
}
