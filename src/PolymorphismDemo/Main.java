package PolymorphismDemo;

public class Main {
    public static void main(String[] args){
        // polymorphism
//        EmailLogger emailLogger = new EmailLogger();
//        emailLogger.Log("Log Message");
        BaseLogger[] loggers = new BaseLogger[]{new FileLogger(),new EmailLogger(),new DatabaseLogger(),new ConsoleLogger()};
//        for (BaseLogger logger:loggers){
//            logger.Log("Log Message");
//        }
        CustomerManager customerManager = new CustomerManager(new DatabaseLogger());
        customerManager.add();
    }
}
