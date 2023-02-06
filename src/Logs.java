import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.LineNumberReader;

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

    public int getLineCountByIncrement() throws IOException {
        int lines = 0;
        try (BufferedReader reader = new BufferedReader(new FileReader(this.absolutePathSourceLog))) {
            while (reader.readLine() != null) {
                lines++;
            }
            return lines;
        }
    }

}
