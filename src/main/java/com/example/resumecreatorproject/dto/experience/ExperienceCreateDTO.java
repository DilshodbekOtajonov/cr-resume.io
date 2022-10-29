package com.example.resumecreatorproject.dto.experience;

import lombok.*;

/**
 * @author "Otajonov Dilshodbek
 * @since 10/29/22 1:45 PM (Saturday)
 * ResumeCreatorProject/IntelliJ IDEA
 */

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class ExperienceCreateDTO {
    private String date;
    private String company;
    private String description;
}
