package StructuralDesignPattern.CompositePattern.Problem;

public class FileSystemApp {
    static void main() {
        File file1=new File("File1.txt");
        File file2=new File("File2.txt");
        Folder folder=new Folder("Documents");
        folder.addfile(file1);
        folder.addfile(file2);

        folder.showDetails();
    }
}
