public class Notification {
    private String recipient;
    private String message ;
    private String type;
    public Notification(String recipient  , String type){
        
        this.type=type;
        this.recipient=recipient;
        if(type=="Email"){
            System.out.println("Email verification sent to ur email ");
        }else{
            System.out.println("Phone verification code sent to ur phone number ");
        }
    }
    public void send_email(String message){
        
        System.out.println("[EMAIL] To: " + recipient + " | " + message);
        
        
    }
}
