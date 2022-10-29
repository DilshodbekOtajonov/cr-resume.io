package com.example.resumecreatorproject.domains;

import com.example.resumecreatorproject.enums.Proficiency;
import lombok.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * @author "Otajonov Dilshodbek
 * @since 10/29/22 2:17 PM (Saturday)
 * ResumeCreatorProject/IntelliJ IDEA
 */
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
public class Language {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String name;
    private Proficiency proficiency;
}
