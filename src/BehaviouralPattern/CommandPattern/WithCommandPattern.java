package BehaviouralPattern.CommandPattern;

//Command Interface
interface Command{
    void execute();
}
//Concrete Class for Commands
class BoldButtonCommand implements Command{
    private TextEditorII textEditorII;

    public BoldButtonCommand(TextEditorII textEditorII) {
        this.textEditorII = textEditorII;
    }

    @Override
    public void execute() {
        textEditorII.bold();
    }
}


class Button{
    private Command command;

    public Command getCommand() {
        return command;
    }

    public void setCommand(Command command) {
        this.command = command;
    }

    public Button(Command command) {
        this.command = command;
    }
    public void click(){
        command.execute();
    }
}


//Receiver:Texteditor Class
class TextEditorII {
    public void bold(){
        System.out.println("Text are became Bold");
    }

    public void italic(){
        System.out.println("Text are became italic");
    }

    public void underlined(){
        System.out.println("Text are became underlined");
    }
}


public class WithCommandPattern {
    public static void main(String[] args) {
        TextEditorII textEditorII=new TextEditorII();
        Button button=new Button(new BoldButtonCommand(textEditorII));
        button.click();
    }
}
