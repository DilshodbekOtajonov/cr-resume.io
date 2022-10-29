package com.example.resumecreatorproject.mappers;

import com.example.resumecreatorproject.domains.Resume;
import com.example.resumecreatorproject.dto.resume.ResumeCreateDTO;
import com.example.resumecreatorproject.dto.resume.ResumeDTO;
import org.mapstruct.Mapper;

/**
 * @author "Otajonov Dilshodbek
 * @since 10/26/22 11:51 AM (Wednesday)
 * ResumeCreatorProject/IntelliJ IDEA
 */

@Mapper(componentModel = "spring")
public interface ResumeMapper {
    Resume fromCreateDTO(ResumeCreateDTO dto);

    ResumeDTO fromResume(Resume resume);
}
