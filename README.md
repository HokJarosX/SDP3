# Assignment 3: Bridge Pattern

Name: Iaroslav Samonov
Group: SE-2530
Topic: B Notifications


## Overview

This project demonstrates the Bridge design pattern using notifications and delivery channels.

The notification types are `Reminder` and `UrgentAlert`.  
The delivery channels are `EmailChannel`, `SMSChannel`, and `PushChannel`.

Bridge allows notification types and delivery channels to vary independently.

## Role Map

Abstraction: Notification: src/Notifications/Notification.java
A1: Reminder: src/Notifications/Reminder.java
A2: UrgentAlert: src/Notifications/UrgentAlert.java
Implementor: Channel: src/Channels/Channel.java
I1: EmailChannel: src/Channels/EmailChannel.java
I2: SMSChannel: src/Channels/SMSChannel.java
I3: PushChannel: src/Channels/PushChannel.java
Client: Main: src/Main.java

## Bridge Structure

Bridge field: src/Notifications/Notification.java
Notification stores a reference to the Channel interface.
execute(): implemented in Reminder and UrgentAlert.
setImplementation(): implemented in Notification and allows the channel to be changed at runtime.
T5: implemented in src/Main.java.

## Demonstration

The program demonstrates these combinations:

- Reminder with EmailChannel
- Reminder with SMSChannel
- UrgentAlert with EmailChannel
- UrgentAlert with SMSChannel
- Runtime channel switching on the same Notification object
- Reminder with PushChannel
- UrgentAlert with PushChannel
