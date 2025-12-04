public class MailUser implements Subscriber {
    private final String username;

    public MailUser(String username){
        this.username = username;
    }

    public void update(String news){
        System.out.println("Notifying " + username + " of the news: "+ news);
    }
}
