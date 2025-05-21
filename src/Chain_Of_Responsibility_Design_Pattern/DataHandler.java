package Chain_Of_Responsibility_Design_Pattern;

class DataHandler extends Handler {
    @Override
    public void handleRequest(String request) {
        if (request.equals("DATA")) {
            System.out.println("DataHandler handled the request.");
        } else if (next != null) {
            next.handleRequest(request);
        } else {
            System.out.println("No handler found for: " + request);
        }
    }
}