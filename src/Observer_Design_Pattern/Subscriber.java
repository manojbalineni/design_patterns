package Observer_Design_Pattern;

public class Subscriber implements Observer {


    private String name;
    private Channel channel = new Channel();
    public Subscriber(String name) {
        this.name = name;
    }


    @Override
    public void update(){
        System.out.println("Hey " + name +  " Video uploaded!");
    }


    @Override
    public void subscribedChannel(Channel ch){
        channel = ch;
    }


}
