package com.example.resumecreatorproject.service.resume;

import com.example.resumecreatorproject.domains.Picture;
import com.example.resumecreatorproject.dto.resume.ResumeCreateDTO;
import com.example.resumecreatorproject.dto.resume.ResumeDTO;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;

/**
 * @author "Otajonov Dilshodbek
 * @since 10/25/22 8:31 PM (Tuesday)
 * ResumeCreatorProject/IntelliJ IDEA
 */

@Service
public interface ResumeService {
    ResumeDTO create(ResumeCreateDTO dto);

    byte[] generateAsPDF(Long resumeId) throws IOException;

    Picture attachPicture(MultipartFile file, Long resumeId);
}
