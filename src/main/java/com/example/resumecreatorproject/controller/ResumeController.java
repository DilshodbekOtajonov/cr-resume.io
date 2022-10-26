package com.example.resumecreatorproject.controller;

import com.example.resumecreatorproject.dto.ResumeCreateDTO;
import com.example.resumecreatorproject.dto.ResumeDTO;
import com.example.resumecreatorproject.service.ResumeService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;

/**
 * @author "Otajonov Dilshodbek
 * @since 10/25/22 6:56 PM (Tuesday)
 * ResumeCreatorProject/IntelliJ IDEA
 */

@RestController
@RequestMapping("/resume")
@RequiredArgsConstructor
public class ResumeController {
    private final ResumeService resumeService;

    @PostMapping("/create")
    public ResponseEntity<ResumeDTO> generateResume(@RequestBody ResumeCreateDTO dto) {
        ResumeDTO response = resumeService.create(dto);
        return new ResponseEntity<>(response, HttpStatus.CREATED);
    }

    @GetMapping(value = "/generateAsPDF")
    public ResponseEntity<byte[]> generateAsPDF(@RequestParam Long resumeId) throws IOException {
        byte[] bytes = resumeService.generateAsPDF(resumeId);
        String fileName = "Response.pdf";
        return ResponseEntity.ok()
                .contentType(MediaType.APPLICATION_PDF)
                .contentLength(bytes.length)
                .header(HttpHeaders.CONTENT_DISPOSITION,
                        "attachment; filename=\"" + fileName + "\"")
                .body(bytes);
    }
}
