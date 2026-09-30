package SOLIDPRINCIPLE.LSP.GoodCode;

public class Main {
    public static void readAnyFile(ReadableFile file){
        file.read();
    }
    public static void main(String[] args) {
        ReadableFile readableFile=new ReadOnlyFile();
        readableFile.read();

        WriteableFile writeable=new WriteableFile();
        writeable.read();
        writeable.write();

        readAnyFile(readableFile);
        readAnyFile(writeable);
    }

}
