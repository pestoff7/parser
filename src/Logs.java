public class Logs {
    private final String absolutePathSourceLog;
    private final String absolutePathExecutedLogs;

    public Logs(String absolutePathSourceLog, String absolutePathExecutedLogs) {
        this.absolutePathSourceLog = absolutePathSourceLog;
        this.absolutePathExecutedLogs = absolutePathExecutedLogs;
    }

    public String getAbsolutePathSourceLog() {
        return absolutePathSourceLog;
    }

    public String getAbsolutePathExecutedLogs() {
        return absolutePathExecutedLogs;
    }
}
