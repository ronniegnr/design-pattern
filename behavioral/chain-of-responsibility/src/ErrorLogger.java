public class ErrorLogger extends AbstractLogger {
    public ErrorLogger() {
        super(AbstractLogger.ERROR);
    }

    @Override
    protected void write(String logMessage) {
        System.out.println("ErrorLogger: " + logMessage);
    }
}
