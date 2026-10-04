package Notifications;

import Channels.Channel;

public abstract class Notification {
    protected int id;
    protected String message;
    protected Channel channel;

    public Notification(int id, String message, Channel channel){
        this.id = id;
        this.message = message;
        this.channel = channel;
    }

    public abstract String execute();

    public void setImplemintation(Channel channel){
        this.channel = channel;
    }
}
