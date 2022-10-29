package com.example.resumecreatorproject.dto.skill;

import lombok.*;

/**
 * @author "Otajonov Dilshodbek
 * @since 10/29/22 1:46 PM (Saturday)
 * ResumeCreatorProject/IntelliJ IDEA
 */

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class SkillCreateDTO {
    private String name;
    private byte progress;
}
