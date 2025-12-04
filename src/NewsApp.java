public class NewsApp {
    public static void main(String[] args) {
        NewsAgency newsAgency = new NewsAgency();

        Subscriber salem = new MailUser("Salem");
        Subscriber berkeley = new MailUser("Berkeley");
        Subscriber charlie = new MailUser("Charlie");

        newsAgency.subscribe(salem);
        newsAgency.subscribe(berkeley);
        newsAgency.publishNews("Breaking News: Observer Pattern Has Been Created!");

        newsAgency.unsubscribe(salem);
        newsAgency.subscribe(charlie);

        newsAgency.publishNews("Breaking News: Now Checking Observer Functionality!");
    }
}
