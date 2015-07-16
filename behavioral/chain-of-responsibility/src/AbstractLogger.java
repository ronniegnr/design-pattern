public abstract class AbstractLogger {

    public static int INFO = 1;
    public static int DEBUG = 2;
    public static int ERROR = 3;

    private int level;
    private AbstractLogger nextLogger;

    public AbstractLogger(int level) {
        this.level = level;
    }

    public void logMessage(int level, String logMessage) {
        if(this.level < level) {
            nextLogger.logMessage(level, logMessage);
        } else {
            write(logMessage);
        }
    }

    public void setNextLogger(AbstractLogger nextLogger) {
        this.nextLogger = nextLogger;
    }

    protected abstract void write(String logMessage);
}
