package com.codeclan.example.filesAndFolders.components;

import com.codeclan.example.filesAndFolders.models.File;
import com.codeclan.example.filesAndFolders.models.Folder;
import com.codeclan.example.filesAndFolders.models.User;
import com.codeclan.example.filesAndFolders.repositories.FileRepository;
import com.codeclan.example.filesAndFolders.repositories.FolderRepository;
import com.codeclan.example.filesAndFolders.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements ApplicationRunner {

    @Autowired
    UserRepository userRepository;
    @Autowired
    FolderRepository folderRepository;
    @Autowired
    FileRepository fileRepository;

    public DataLoader() {
    }
    public void run(ApplicationArguments args) {
        User robert = new User("Robert");
        userRepository.save(robert);
        User natalie = new User("Natalie");
        userRepository.save(natalie);
        Folder taxes = new Folder("Taxes", natalie);
        folderRepository.save(taxes);
        Folder writing = new Folder("Writing", robert);
        folderRepository.save(writing);
        File taxes2019 = new File("taxes_2019", "txt", 80, taxes);
        fileRepository.save(taxes2019);
        File chapter1 = new File("Chapter 1", "doc", 100, writing);
        fileRepository.save(chapter1);
        taxes.addFile(taxes2019);
        writing.addFile(chapter1);
        folderRepository.save(taxes);
        chapter1.addFolder(writing);
        fileRepository.save(chapter1);
        fileRepository.save(taxes2019);
    }


}
