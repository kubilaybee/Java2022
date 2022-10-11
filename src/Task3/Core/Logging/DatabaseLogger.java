package Task3.Core.Logging;

public class DatabaseLogger implements ILogger{
    @Override
    public void log(String data) {
        System.out.printf("Database Logger: "+ data);
    }
}
