package SOLIDPRINCIPLE.LSP.GoodCode;

public class WriteableFile extends ReadableFile implements Writeable{
    @Override
    public void write() {
        System.out.println("Writing to a file");
    }
}
