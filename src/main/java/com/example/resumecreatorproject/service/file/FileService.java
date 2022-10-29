package com.example.resumecreatorproject.service.file;

import com.example.resumecreatorproject.domains.Picture;
import org.springframework.web.multipart.MultipartFile;

/**
 * @author "Otajonov Dilshodbek
 * @since 10/29/22 2:45 PM (Saturday)
 * ResumeCreatorProject/IntelliJ IDEA
 */
public interface FileService {
    Picture uploadPicture(MultipartFile picture);
}
