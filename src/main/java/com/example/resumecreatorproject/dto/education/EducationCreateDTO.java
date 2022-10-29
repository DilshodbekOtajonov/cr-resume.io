package com.example.resumecreatorproject.dto.education;

import lombok.*;

/**
 * @author "Otajonov Dilshodbek
 * @since 10/29/22 1:44 PM (Saturday)
 * ResumeCreatorProject/IntelliJ IDEA
 */

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class EducationCreateDTO {
    private String date;
    private String name;
    private String description;
}
