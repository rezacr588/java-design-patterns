public class Factory {

    interface Notification {
        void notifyUser();
    }
    
    static class EmailNotification implements Notification {
        @Override 
        public void notifyUser(){
            System.out.println("EmailNotification");
        }
    }
    
    static class SMSNotification implements Notification {
        @Override 
        public void notifyUser(){
            System.out.println("SMSNotification");
        }
    }
    
    static class PushNotification implements Notification {
        @Override 
        public void notifyUser(){
            System.out.println("PushNotification");
        }
    }

    static class SlackNotification implements Notification {
        @Override
        public void notifyUser() {
            System.out.println("Slack Notification");
        }
    }
    
    static class NotificationFactory {
        public Notification createNotification(String channel) {
            if(channel == null || channel.isEmpty()) 
                return null;
            switch (channel) {
                case "email":
                    return new EmailNotification();        
                case "sms":
                    return new SMSNotification();
                case "push":
                    return new PushNotification();
                case "slack":
                    return new SlackNotification();
                default:
                    throw new IllegalArgumentException("Unknown channel " + channel);
            }
        }
    }

    public static void main(String[] args) {
        NotificationFactory notificationFactory = new NotificationFactory();
        Notification notification;
        notification = notificationFactory.createNotification("email");
        notification.notifyUser();  // Corrected method call
        notification = notificationFactory.createNotification("sms");
        notification.notifyUser();  // Corrected method call
        notification = notificationFactory.createNotification("push");
        notification.notifyUser();  // Corrected method call
        notification = notificationFactory.createNotification("slack");
        notification.notifyUser();
    }
    
}