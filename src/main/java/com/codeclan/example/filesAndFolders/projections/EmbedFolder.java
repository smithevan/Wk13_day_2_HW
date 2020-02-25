package com.codeclan.example.filesAndFolders.projections;

import com.codeclan.example.filesAndFolders.models.Folder;
import com.codeclan.example.filesAndFolders.models.User;
import org.springframework.data.rest.core.config.Projection;


@Projection(name = "embedFolder", types = Folder.class)
public interface EmbedFolder {
    String getTitle();
    User getUser();
}

