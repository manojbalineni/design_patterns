package Chain_Of_Responsibility_Design_Pattern;

class LoggingHandler extends Handler {
    @Override
    public void handleRequest(String request) {
        if (request.equals("LOG")) {
            System.out.println("LoggingHandler handled the request.");
        } else if (next != null) {
            next.handleRequest(request);
        }
    }
}