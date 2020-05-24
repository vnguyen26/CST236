/*
 * CST361-Java Design Patterns
 * Vien Nguyen
 * */
public class Logger implements Observer {
 
    @Override
    public void update(User user) {
        System.out.println("Logger: " + user);
    }
}