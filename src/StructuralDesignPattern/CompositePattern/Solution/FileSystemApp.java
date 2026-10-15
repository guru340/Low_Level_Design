package StructuralDesignPattern.CompositePattern.Solution;

public class FileSystemApp {
    static void main() {
        FileSystemComponent file1=new File("File1.txt");
        FileSystemComponent file2=new File("File2.txt");
        Folder folder=new Folder("Documents");
        folder.addComponents(file1);
        folder.addComponents(file2);

//        SubFolder
        Folder subfolder=new Folder("Subfolder");
        FileSystemComponent file3=new File("File3.txt");

        subfolder.addComponents(file3);
        folder.addComponents(subfolder);

        folder.showdetails();
    }
}
