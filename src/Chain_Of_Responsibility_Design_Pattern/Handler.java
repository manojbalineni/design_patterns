package Chain_Of_Responsibility_Design_Pattern;

public abstract class Handler {

    public Handler next;

    public void setNext(Handler next){
        this.next = next;
    }

    public abstract void handleRequest(String request);
}
