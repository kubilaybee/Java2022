package Task3.Core.Logging;

public class FileLogger implements ILogger{
    @Override
    public void log(String data) {
        System.out.printf("File Logger: "+data);
    }
}
