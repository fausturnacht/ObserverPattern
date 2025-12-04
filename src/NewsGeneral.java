import java.util.ArrayList;
import java.util.List;

public class NewsGeneral implements NewsAgency {
    private final List<Subscriber> subscriberList;

    public NewsGeneral(){
        subscriberList = new ArrayList<>();
    }

    public void subscribe(Subscriber subscriber){
        subscriberList.add(subscriber);
    }

    public void unsubscribe(Subscriber subscriber){
        subscriberList.remove(subscriber);
    }

    public void publishNews(String news){
        for(Subscriber subscriber : subscriberList){
            subscriber.update(news);
        }
    }
}
