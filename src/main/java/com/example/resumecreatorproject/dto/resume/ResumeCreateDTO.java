package com.example.resumecreatorproject.dto.resume;

import com.example.resumecreatorproject.domains.*;
import com.example.resumecreatorproject.dto.education.EducationCreateDTO;
import com.example.resumecreatorproject.dto.experience.ExperienceCreateDTO;
import com.example.resumecreatorproject.dto.header.HeaderCreateDTO;
import com.example.resumecreatorproject.dto.language.LanguageCreateDTO;
import com.example.resumecreatorproject.dto.skill.SkillCreateDTO;
import com.example.resumecreatorproject.dto.socialAccount.SocialMediaAccountCreateDTO;
import lombok.*;
import org.springframework.web.multipart.MultipartFile;

import javax.persistence.CascadeType;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import java.util.List;

/**
 * @author "Otajonov Dilshodbek
 * @since 10/25/22 6:59 PM (Tuesday)
 * ResumeCreatorProject/IntelliJ IDEA
 */

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class ResumeCreateDTO {
    private HeaderCreateDTO header;
    private String templateName;
    private String about;
    private List<SkillCreateDTO> skills;
    private List<SocialMediaAccountCreateDTO> socialMediaAccounts;
    private List<EducationCreateDTO> educations;
    private List<ExperienceCreateDTO> experiences;
    private List<LanguageCreateDTO> languages;
    private MultipartFile file;

}
