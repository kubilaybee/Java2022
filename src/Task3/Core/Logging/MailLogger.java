package Task3.Core.Logging;

public class MailLogger implements ILogger{
    @Override
    public void log(String data) {
        System.out.println("Mail Logger: "+ data);
    }
}
