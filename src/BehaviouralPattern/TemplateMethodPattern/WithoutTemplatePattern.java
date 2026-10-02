package BehaviouralPattern.TemplateMethodPattern;

class CSVParser{
    public void parser(){
        openFile();
        System.out.println("Parsing a CSV File");
        closeFile();
    }

    public void openFile(){
        System.out.println("Opening a File");
    }

    public void closeFile(){
        System.out.println("Closing a File");
    }
}

class JSONParser{
    public void parser(){
        openFile();
        System.out.println("Parsing a JSON File");
        closeFile();
    }

    public void openFile(){
        System.out.println("Opening a File");
    }

    public void closeFile(){
        System.out.println("Closing a File");
    }
}


public class WithoutTemplatePattern {
    public static void main(String[] args) {
        CSVParser csvParser=new CSVParser();
        csvParser.parser();
        JSONParser jsonParser=new JSONParser();
        jsonParser.parser();
    }

}
