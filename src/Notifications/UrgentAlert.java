package Notifications;

import Channels.Channel;

public class UrgentAlert extends Notification{
    public UrgentAlert(int id, String message, Channel channel){
        super(id, message, channel);
    }
    @Override
    public String execute(){
        return channel.send("ALERT:" + " " + message);
    }
}

