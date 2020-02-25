package com.codeclan.example.filesAndFolders.repositories;


import com.codeclan.example.filesAndFolders.models.File;
import com.codeclan.example.filesAndFolders.projections.EmbedUser;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;

@Repository
public interface FileRepository extends JpaRepository<File, Long> {
}
