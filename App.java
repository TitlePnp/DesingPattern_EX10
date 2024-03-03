public class App {
    public static void main(String[] args) {
        LogHandler consoleLog = new ConsoleLog();
        LogHandler fileLog = new FileLog();
        LogHandler errorLog = new ErrorLog();
        
        consoleLog.setNext(fileLog);
        fileLog.setNext(errorLog);
        
        consoleLog.logHandleRequest("INFO", "This is an info message.");
        System.out.println("------------------------------");
        consoleLog.logHandleRequest("DEBUG", "This is a debug message.");
        System.out.println("------------------------------");
        consoleLog.logHandleRequest("ERROR", "This is an error message.");
    }
}
