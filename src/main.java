import Channels.EmailChannel;
import Notifications.Notification;
import Notifications.Reminder;

public class main {
    public static void main(String args[]){
        Notification n1 = new Reminder(1, "ААА", new EmailChannel());
        System.out.println(n1.execute());
    }
}
