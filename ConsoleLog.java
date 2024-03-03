public class ConsoleLog implements LogHandler {
    private LogHandler nextLog;
    // private String logLevel;
    // private String logMessage;

    // public ConsoleLog(String logLevel,String logMessage) {
    //     this.logLevel = logLevel;
    //     this.logMessage = logMessage;
    // }

    @Override
    public void setNext(LogHandler nextLog) {
        this.nextLog = nextLog;
    }

    @Override
    public void logHandleRequest(String logLevel, String logMessage) {
        if (logLevel.equals("INFO")) {
            System.out.println("Standard Console::Logger: " + logMessage);
        }
        else if (nextLog != null) {
            System.out.println("Standard Console::Logger: " + logMessage);
            nextLog.logHandleRequest(logLevel, logMessage);
        }
    }

}