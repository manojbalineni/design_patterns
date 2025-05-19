package Observer_Design_Pattern;

import java.util.ArrayList;
import java.util.List;

public class Channel implements Subject {

    private List<Subscriber> subs = new ArrayList<>();
    private String title;


    @Override
    public void subscribe(Subscriber subscriber){
        subs.add(subscriber);
    }

    @Override
    public void unSubscribe(Subscriber subscriber){
        subs.remove(subscriber);
    }

    @Override
    public void notifySubscriber(){
        for(Subscriber sub : subs){
            sub.update();
        }

    }

    @Override
    public void upload(String title){
        this.title = title;
        notifySubscriber();
    }
}
