package Calculator;

import Calculator.DbLogger;

public class DbLoggerFactory extends LoggerFactory {

    @Override
    public Logger createLogger() {
        return new DbLogger();
    }
}
