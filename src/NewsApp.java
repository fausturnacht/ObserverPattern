public class NewsApp {
    public static void main(String[] args) {
        NewsAgency newsAgency = new NewsAgency();

        Subscriber salem = new Subscriber("Salem");
        Subscriber berkeley = new Subscriber("Berkeley");
        Subscriber charlie = new Subscriber("Charlie");

        newsAgency.subscribe(salem);
        newsAgency.subscribe(berkeley);
        newsAgency.publishNews("Breaking News: Observer Pattern Has Been Created!");

        newsAgency.unsubscribe(salem);
        newsAgency.subscribe(charlie);

        newsAgency.publishNews("Breaking News: Now Checking Observer Functionality!");
    }
}
