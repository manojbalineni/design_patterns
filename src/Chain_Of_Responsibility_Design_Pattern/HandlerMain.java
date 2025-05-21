package Chain_Of_Responsibility_Design_Pattern;

public class HandlerMain {
    public static void main(String[] args) {
        Handler auth = new AuthHandler();
        Handler log = new LoggingHandler();
        Handler data = new DataHandler();
        auth.setNext(log);
        log.setNext(data);
        auth.handleRequest("LOG");    // Output: LoggingHandler handled the request.
        auth.handleRequest("DATA");   // Output: DataHandler handled the request.
        auth.handleRequest("UNKNOWN");// Output: No handler found for: UNKNOWN
    }
}