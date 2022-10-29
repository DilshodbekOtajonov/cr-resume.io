package com.example.resumecreatorproject.dto.header;

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
public class HeaderCreateDTO {
    private String fullName;
    private String address;
    private String country;
    private String job;
    private String phoneNumber;
    private String email;
    private String site;
}
