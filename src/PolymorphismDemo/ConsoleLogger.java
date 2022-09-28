package PolymorphismDemo;

public class ConsoleLogger extends BaseLogger{
    @Override
    public void log(String message) {
        super.log("Logged to Console : "+message);
    }
}
