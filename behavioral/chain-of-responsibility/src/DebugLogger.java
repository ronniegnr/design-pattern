public class DebugLogger extends AbstractLogger {
    public DebugLogger() {
        super(AbstractLogger.DEBUG);
    }

    @Override
    protected void write(String logMessage) {
        System.out.println("DebugLogger: " + logMessage);
    }
}
