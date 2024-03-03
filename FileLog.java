public class FileLog implements LogHandler {
    private LogHandler nextLog;

    // public FileLog(String level) {
    //     this.logLevel = level;
    // }

    @Override
    public void setNext(LogHandler nextLog) {
        this.nextLog = nextLog;
    }

    @Override
    public void logHandleRequest(String logLevel, String logMessage) {
        if (logLevel.equals("DEBUG")) {
            System.out.println("File::Logger: " + logMessage);
        }
        else if (nextLog != null) {
            System.out.println("File::Logger: " + logMessage);
            nextLog.logHandleRequest(logLevel, logMessage);
        }
    }
}