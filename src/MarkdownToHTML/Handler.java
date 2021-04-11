package MarkdownToHTML;

abstract class Handler {

    private IHandler nextHandler;

    public void setNext(IHandler nextHandler) {
        this.nextHandler = nextHandler;
    }

    public abstract void handle();

}
