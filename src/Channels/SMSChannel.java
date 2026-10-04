package Channels;

public class SMSChannel implements Channel{
    @Override
    public String send(String message) {
        return "SMS: " + message;
    }

}
