package BehaviouralPattern.TemplateMethodPattern;
abstract class DataParser{
    public final void parse(){
        openFile();
        parseFile();
        closeFile();
    }

    protected void openFile(){
        System.out.println("Opening a File");
    }
    protected void closeFile(){
        System.out.println("Closing a File");
    }
    protected abstract void parseFile();
}


class CSVParserII extends DataParser {

    @Override
    protected void parseFile() {
        System.out.println("Parsing a CSV File");
    }
}


class JSONParseII extends DataParser{

    @Override
    protected void parseFile() {
        System.out.println("Parsing a JSON File");
    }
}


public class WithTemplatepattern {
    public static void main(String[] args) {
        CSVParserII csvParserII=new CSVParserII();
        csvParserII.parseFile();
        JSONParseII jsonParseII=new JSONParseII();
        jsonParseII.parseFile();
    }

}
