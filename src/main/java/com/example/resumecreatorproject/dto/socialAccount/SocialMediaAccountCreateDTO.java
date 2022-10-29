package com.example.resumecreatorproject.dto.socialAccount;

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
public class SocialMediaAccountCreateDTO {
    private String name;
    private String url;
}
