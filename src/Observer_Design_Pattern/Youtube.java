package Observer_Design_Pattern;

public class Youtube {

    public static void main(String[] args) {
        Channel telusko = new Channel();
        Subscriber s1 = new Subscriber("Manoj");
        Subscriber s2 = new Subscriber("Swapna");
        Subscriber s3 = new Subscriber("Vissu");
        Subscriber s4 = new Subscriber("Siri");
        Subscriber s5 = new Subscriber("Tulasi");

        telusko.subscribe(s1);
        telusko.subscribe(s2);
        telusko.subscribe(s3);
        telusko.subscribe(s4);
        telusko.subscribe(s5);

        s1.subscribedChannel(telusko);
        s2.subscribedChannel(telusko);
        s3.subscribedChannel(telusko);
        s4.subscribedChannel(telusko);
        s5.subscribedChannel(telusko);

        telusko.upload("Design Patterns");

    }
}
