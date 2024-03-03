public class ErrorLog implements LogHandler {
    private LogHandler nextLog;

    // public ErrorLog(String level) {
    //     this.logLevel = level;
    // }

    @Override
    public void setNext(LogHandler nextLog) {
        this.nextLog = nextLog;
    }

    @Override
    public void logHandleRequest(String logLevel, String logMessage) {
        if (logLevel.equals("ERROR")) {
            System.out.println("Error Console::Logger: " + logMessage);
        }
        else if (nextLog != null) {
            System.out.println("Error Console::Logger: " + logMessage);
            nextLog.logHandleRequest(logLevel, logMessage);
        }
    }
}