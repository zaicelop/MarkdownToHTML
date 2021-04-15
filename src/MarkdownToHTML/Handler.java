package MarkdownToHTML;

/**
 * Abstract class needed to inherit methods
 * and fields needed for CoR
 */
abstract class Handler implements IHandler {

    protected IHandler nextHandler;

    public void setNext(IHandler nextHandler) {
        this.nextHandler = nextHandler;
    }

    public abstract Object handle(Object request);

}
