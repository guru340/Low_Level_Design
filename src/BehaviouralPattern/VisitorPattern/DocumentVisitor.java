package BehaviouralPattern.VisitorPattern;

public interface DocumentVisitor {
    void visitPDF(PDFDocument document);
    void visitWord(WordDocument document);
    void visitText(TextDocument document);
}