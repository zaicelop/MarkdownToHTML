package MarkdownToHTML;

public class Request {
    public String[] data;
    public void setData(String[] data){
        this.data = data;
    }
    public Request() {}
    public Request(String[] data){
        Request request = new Request(data);
    }
}
