package MarkdownToHTML;

interface IHandler {

    void setNext(IHandler handler);

    void handle();

}
