package BehaviouralPattern.MementoPattern;

import org.w3c.dom.Text;

import java.sql.PreparedStatement;
import java.util.Stack;

public class History {

    private final Stack<EditorMemento> history=new Stack<>();

    public void saveState(TextEditor textEditor){
        history.push(textEditor.save());
    }
    public void undo(TextEditor textEditor){
        if(!history.isEmpty()){
            history.pop();
            textEditor.restore(history.peek());
        }
    }

}
