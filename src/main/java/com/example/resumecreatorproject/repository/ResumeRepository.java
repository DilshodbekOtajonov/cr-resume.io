package com.example.resumecreatorproject.repository;

import com.example.resumecreatorproject.domains.Resume;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @author "Otajonov Dilshodbek
 * @since 10/26/22 11:54 AM (Wednesday)
 * ResumeCreatorProject/IntelliJ IDEA
 */
@Repository
public interface ResumeRepository extends JpaRepository<Resume, Long> {
}
