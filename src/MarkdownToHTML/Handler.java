package MarkdownToHTML;

abstract class Handler implements IHandler {

    private IHandler nextHandler;

    public void setNext(IHandler nextHandler) {
        this.nextHandler = nextHandler;
    }

    public abstract void handle();

}
