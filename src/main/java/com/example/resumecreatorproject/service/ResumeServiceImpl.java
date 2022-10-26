package com.example.resumecreatorproject.service;

import com.example.resumecreatorproject.domains.Resume;
import com.example.resumecreatorproject.dto.ResumeCreateDTO;
import com.example.resumecreatorproject.dto.ResumeDTO;
import com.example.resumecreatorproject.mappers.ResumeMapper;
import com.example.resumecreatorproject.repository.ResumeRepository;
import com.example.resumecreatorproject.utils.TemplateUtils;
import com.itextpdf.html2pdf.ConverterProperties;
import com.itextpdf.html2pdf.HtmlConverter;
import com.itextpdf.kernel.geom.PageSize;
import com.itextpdf.kernel.pdf.PdfDocument;
import com.itextpdf.kernel.pdf.PdfWriter;
import freemarker.template.Template;
import freemarker.template.TemplateException;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.ui.freemarker.FreeMarkerTemplateUtils;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Map;

/**
 * @author "Otajonov Dilshodbek
 * @since 10/25/22 8:32 PM (Tuesday)
 * ResumeCreatorProject/IntelliJ IDEA
 */

@Service
@RequiredArgsConstructor
public class ResumeServiceImpl implements ResumeService {
    private final ResumeMapper resumeMapper;
    private final ResumeRepository resumeRepository;

    @Override
    public ResumeDTO create(ResumeCreateDTO dto) {
        Resume resume = resumeMapper.fromCreateDTO(dto);
        Resume savedResume = resumeRepository.save(resume);
        ResumeDTO response = resumeMapper.fromResume(savedResume);
        return response;
    }

    @Override
    public byte[] generateAsPDF(Long resumeId) {
        Resume resume = resumeRepository.getReferenceById(resumeId);
        Template template = TemplateUtils.getTemplate(resume.getTemplateName());
        try (FileOutputStream pdfStream = new FileOutputStream("resume.pdf");) {
            String responsePage = FreeMarkerTemplateUtils.processTemplateIntoString(template,
                    Map.of("resume", resume));
            PdfWriter pdfWriter = new PdfWriter(pdfStream);
            PdfDocument document = new PdfDocument(pdfWriter);
            document.setDefaultPageSize(new PageSize(800f, 1200f));
            ConverterProperties converterProperties = new ConverterProperties();
            converterProperties.setBaseUri("https://fonts.googleapis.com/css?family=Montserrat:400,500,700&display=swap");
            HtmlConverter.convertToPdf(responsePage, document, converterProperties);
            FileInputStream fileInputStream = new FileInputStream("resume.pdf");
            byte[] response = fileInputStream.readAllBytes();
            fileInputStream.close();
            return response;
        } catch (IOException e) {
            e.printStackTrace();
            throw new RuntimeException("Oops something went wrong");
        } catch (TemplateException e) {
            e.printStackTrace();
            throw new RuntimeException("Template not found");
        }finally {
            try {
                Files.deleteIfExists(Path.of("resume.pdf"));
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
