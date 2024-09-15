package org.example;

import java.util.ArrayList;
import java.util.List;

public class Folder extends FileSystemEntity {

    private final List<FileSystemEntity> subs = new ArrayList<>();
//    private Folder parentFolder;

    public Folder(String name, Folder parent) {
        super(name, parent);
    }

    public Folder(String name) {
        super(name);
    }

    public void addToSubs(FileSystemEntity newSub){
        subs.add(newSub);
    }

    public void delete(){
        super.delete();
        for(FileSystemEntity fileSystemEntity : subs){
           fileSystemEntity.delete();
        }
    }

    @Override
    public void print(int indentation) {
        super.print(indentation);
        for(FileSystemEntity fileSystemEntity : subs){
            fileSystemEntity.print(indentation+1);
        }
    }
}
