package org.example;

abstract class FileSystemEntity {
    private String name;
    private boolean isDeleted;

    public FileSystemEntity(String name, Folder parent) {
        this.name = name;
        if(parent != null) parent.addToSubs(this);
        this.isDeleted = false;
    }
    public FileSystemEntity(String name) {
        this.name = name;
        this.isDeleted = false;
    }

    public String getName() {return name;}
    public boolean isDeleted() {return isDeleted;}
    public void setName(String name) {this.name = name;}
    public void setDeleted(boolean deleted) {isDeleted = deleted;}

    public void delete(){this.isDeleted = true;};
    public void print(int indentation){
        if(!isDeleted){
            for (int i = 0; i < indentation; i++) {
                System.out.print("\t");
            }
            System.out.printf("|—— %s\n", getName());
        }
    }
}
