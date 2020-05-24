/*
 * CST361-Java Design Patterns
 * Vien Nguyen
 * */
public class Protector implements Observer {
 
    @Override
    public void update(User user) {
        if (user.getStatus() == LoginStatus.INVALID) {
            System.out.println("Protector: User " + user.getEmail() + " is invalid. "
                    + "IP " + user.getIp() + " is blocked");
        }
    }
}