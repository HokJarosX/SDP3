package Notifications;

import Channels.Channel;

public class Reminder extends Notification{
    public Reminder(int id, String message, Channel channel){
        super(id, message, channel);
    }
    @Override
    public String execute(){
        return channel.send("Reminder:" + " " + message);
    }
}
