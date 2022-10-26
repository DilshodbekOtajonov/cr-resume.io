package com.example.resumecreatorproject.service;

import com.example.resumecreatorproject.dto.ResumeCreateDTO;
import com.example.resumecreatorproject.dto.ResumeDTO;
import org.springframework.stereotype.Service;

/**
 * @author "Otajonov Dilshodbek
 * @since 10/25/22 8:31 PM (Tuesday)
 * ResumeCreatorProject/IntelliJ IDEA
 */

@Service
public interface ResumeService {
    ResumeDTO create(ResumeCreateDTO dto);

    byte[] generateAsPDF(Long resumeId);
}
