public interface LogHandler {
    public void setNext(LogHandler nextLog);
    public void logHandleRequest(String logLevel, String logMessage);
}
