package BehaviouralPattern.VisitorPattern;

public interface Document {
    void accept(DocumentVisitor visitor);
}