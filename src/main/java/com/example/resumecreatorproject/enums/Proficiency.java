package com.example.resumecreatorproject.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * @author "Otajonov Dilshodbek
 * @since 10/29/22 2:19 PM (Saturday)
 * ResumeCreatorProject/IntelliJ IDEA
 */
@Getter
@AllArgsConstructor
public enum Proficiency {
    ELEMENTARY("Elementary proficiency"),
    LIMITED("Limited working proficiency"),
    PROFESSIONAL("Professional working proficiency"),
    FULL_PROFESSIONAL("Full professional working proficiency"),
    NATIVE("Native or bilingual proficiency");
    private String description;
}
