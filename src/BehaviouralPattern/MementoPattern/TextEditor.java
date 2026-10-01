package BehaviouralPattern.MementoPattern;

public class TextEditor {
    private String content;

    public void   write(String text){
        this.content=text;
    }
//    save the current State
      public EditorMemento save(){
        return new EditorMemento(content);
      }

      // Restore-(Update the current state of the current content
    public void restore(EditorMemento editorMemento){
        content=editorMemento.getContent();
    }

    public String getContent(){
        return content;
    }
}
