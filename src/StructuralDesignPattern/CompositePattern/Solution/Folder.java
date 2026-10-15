package StructuralDesignPattern.CompositePattern.Solution;

import java.util.ArrayList;
import java.util.List;

public class Folder implements FileSystemComponent {
    private String name;

    private List<FileSystemComponent> components=new ArrayList<>();

    public Folder (String name){
        this.name=name;
    }

    public void addComponents(FileSystemComponent component){
        components.add(component);
    }

    @Override
    public void showdetails(){
        System.out.println("Folder:"+ name);
        for(FileSystemComponent component:components){
            component.showdetails();
        }
    }


}
