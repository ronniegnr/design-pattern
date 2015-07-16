public class Main {

    private static AbstractLogger chainOfLogger() {
        AbstractLogger infoLogger = new InfoLogger();
        AbstractLogger debugLogger = new DebugLogger();
        AbstractLogger errorLogger = new ErrorLogger();

        infoLogger.setNextLogger(debugLogger);
        debugLogger.setNextLogger(errorLogger);

        return infoLogger;
    }

    public static void main(String[] args) {

        AbstractLogger chainOfLogger = chainOfLogger();

        chainOfLogger.logMessage(AbstractLogger.INFO, "this is information");
        chainOfLogger.logMessage(AbstractLogger.DEBUG, "this is debug");
        chainOfLogger.logMessage(AbstractLogger.ERROR, "this is error");

    }

}
