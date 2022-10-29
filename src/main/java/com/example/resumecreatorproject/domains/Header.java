package com.example.resumecreatorproject.domains;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * @author "Otajonov Dilshodbek
 * @since 10/26/22 11:39 AM (Wednesday)
 * ResumeCreatorProject/IntelliJ IDEA
 */

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
public class Header {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String fullName;
    private String address;
    private String country;
    private String job;
    private String phoneNumber;
    private String email;
    private String site;

}
