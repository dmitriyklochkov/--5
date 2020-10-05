public class AppFactory {
    protected static String message;

    public static void main(String[] args) {

        LoggerFactory factory = null;
        LoggerType[] loggerType = LoggerType.values();
        for (LoggerType type : loggerType) {
            switch (type) {
                case Dblogger:
                    factory = new DbLoggerFactory();
                    break;
                case Filelogger:
                    factory = new FileLoggerFactory();
                    break;
                case Consollogger:
                    factory = new ConsoleFactory();
                    break;
                default:
                    System.out.println("Ошибка ввода");
            }
            if (factory != null) {
                Logger logger = factory.createLogger();
                logger.log(message);
            }
        }
    }
}
