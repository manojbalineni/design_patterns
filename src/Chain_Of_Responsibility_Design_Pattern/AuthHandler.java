package Chain_Of_Responsibility_Design_Pattern;

class AuthHandler extends Handler {
    @Override
    public void handleRequest(String request) {
        if (request.equals("AUTH")) {
            System.out.println("AuthHandler handled the request.");
        } else if (next != null) {
            next.handleRequest(request);
        }
    }
}