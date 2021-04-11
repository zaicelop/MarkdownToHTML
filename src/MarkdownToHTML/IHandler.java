package MarkdownToHTML;

interface IHandler {

    void setNext(Handler handler);

    void handle();

}
