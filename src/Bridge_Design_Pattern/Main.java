package Bridge_Design_Pattern;

public class Main {
    public static void main(String[] args) {
        Device tv = new TV();
        Remote tvRemote = new Remote(tv);
        tvRemote.pressPowerButton(); // TV is turned ON

        Device radio = new Radio();
        Remote radioRemote = new Remote(radio);
        radioRemote.pressPowerButton(); // Radio is turned ON
    }
}

