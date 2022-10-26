package com.example.resumecreatorproject.dto;

import com.example.resumecreatorproject.domains.*;
import lombok.*;

import java.util.List;

/**
 * @author "Otajonov Dilshodbek
 * @since 10/25/22 6:57 PM (Tuesday)
 * ResumeCreatorProject/IntelliJ IDEA
 */

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class ResumeDTO {
    private Long id;
    private Header header;
    private String templateName;
    private String about;
    private List<Skill> skills;
    private List<SocialMediaAccount> socialMediaAccounts;
    private List<Education> educations;
    private List<Experience> experiences;
}
