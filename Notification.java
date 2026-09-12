public class Notification {
    private String recipient;
    public Notification(String recipient){
        this.recipient=recipient;
    }
    public void send_email(String message){
        
        System.out.println("[EMAIL] To: " + recipient + " | " + message);
        
        
    }
}
