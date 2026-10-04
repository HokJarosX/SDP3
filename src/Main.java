import Channels.EmailChannel;
import Channels.SMSChannel;
import Notifications.Notification;
import Notifications.Reminder;
import Notifications.UrgentAlert;

public class Main {
    public static void main(String[] args) {

        Notification n1 = new Reminder(1, "Do homework", new EmailChannel());
        Notification n2 = new Reminder(2, "Do homework", new SMSChannel());
        Notification n3 = new UrgentAlert(3, "Server is down", new EmailChannel());
        Notification n4 = new UrgentAlert(4, "Server is down", new SMSChannel());

        System.out.println(n1.execute());
        System.out.println(n2.execute());
        System.out.println(n3.execute());
        System.out.println(n4.execute());
    }
}
