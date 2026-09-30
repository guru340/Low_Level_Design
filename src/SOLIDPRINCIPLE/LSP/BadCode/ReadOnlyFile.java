package SOLIDPRINCIPLE.LSP.BadCode;

public class ReadOnlyFile extends File {
    public void write(){
        throw new UnsupportedOperationException("Can't not write a file only read a file");
    }
}
