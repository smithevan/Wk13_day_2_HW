package com.codeclan.example.filesAndFolders.repositories;


import com.codeclan.example.filesAndFolders.models.Folder;
import com.codeclan.example.filesAndFolders.projections.EmbedFolder;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(excerptProjection = EmbedFolder.class)
public interface FolderRepository extends JpaRepository<Folder, Long> {
}
