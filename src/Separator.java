import java.io.FileNotFoundException;
import java.io.FileReader;

public class Separator {
    private final Logs log;
    private FileReader fr;

    public Separator(Logs log) {
        this.log = log;
    }

    public void separateLog() throws FileNotFoundException {
        fr = new FileReader(log.getAbsolutePathSourceLog());

    }
}
