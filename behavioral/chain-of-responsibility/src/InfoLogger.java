public class InfoLogger extends AbstractLogger {

    public InfoLogger() {
        super(AbstractLogger.INFO);
    }

    @Override
    protected void write(String logMessage) {
        System.out.println("InfoLogger: " + logMessage);
    }

}
