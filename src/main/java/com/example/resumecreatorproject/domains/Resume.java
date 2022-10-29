package com.example.resumecreatorproject.domains;

import lombok.*;

import javax.persistence.*;
import java.util.List;

/**
 * @author "Otajonov Dilshodbek
 * @since 10/26/22 10:00 AM (Wednesday)
 * ResumeCreatorProject/IntelliJ IDEA
 */

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Builder
@Entity
public class Resume {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @OneToOne(cascade = CascadeType.ALL)
    private Header header;
    private String templateName;
    @Column(columnDefinition = "text")
    private String about;
    @OneToMany(cascade = CascadeType.ALL)
    private List<Skill> skills;
    @OneToMany(cascade = CascadeType.ALL)
    private List<SocialMediaAccount> socialMediaAccounts;
    @OneToMany(cascade = CascadeType.ALL)
    private List<Education> educations;
    @OneToMany(cascade = CascadeType.ALL)
    private List<Experience> experiences;
    @OneToMany(cascade = CascadeType.ALL)
    private List<Language> languages;
    @OneToOne(cascade = CascadeType.ALL)
    private Picture picture;
}
