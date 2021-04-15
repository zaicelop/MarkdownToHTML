package MarkdownToHTML;

/**
 * Interface required for implementation CoR pattern
 */
interface IHandler {

    void setNext(IHandler handler);

    Object handle(Object request);

}
