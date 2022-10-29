package com.example.resumecreatorproject.dto.language;

import com.example.resumecreatorproject.enums.Proficiency;
import lombok.*;

/**
 * @author "Otajonov Dilshodbek
 * @since 10/29/22 2:21 PM (Saturday)
 * ResumeCreatorProject/IntelliJ IDEA
 */
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class LanguageCreateDTO {
    private String name;
    private Proficiency proficiency;
}
