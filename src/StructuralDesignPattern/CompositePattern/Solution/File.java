package StructuralDesignPattern.CompositePattern.Solution;

public class File implements FileSystemComponent {

    private String name;

    public File(String name){
        this.name=name;
    }


    @Override
    public void showdetails() {
        System.out.println("File"+name);
    }
}
