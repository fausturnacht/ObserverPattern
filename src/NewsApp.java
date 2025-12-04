public class NewsApp {
    public static void main(String[] args) {
        NewsAgency newsGeneral = new NewsGeneral();

        Subscriber salem = new MailUser("Salem");
        Subscriber berkeley = new MailUser("Berkeley");
        Subscriber charlie = new MailUser("Charlie");

        newsGeneral.subscribe(salem);
        newsGeneral.subscribe(berkeley);
        newsGeneral.publishNews("Breaking News: Observer Pattern Has Been Created!");

        newsGeneral.unsubscribe(salem);
        newsGeneral.subscribe(charlie);

        newsGeneral.publishNews("Breaking News: Now Checking Observer Functionality!");
    }
}
