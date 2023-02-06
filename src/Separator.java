import java.io.*;

public class Separator {
    private final Logs log;
    private final static String logName = "log";
    private int lines = 0;

    public Separator(Logs log) {
        this.log = log;
    }
    public void separateLog() throws IOException{
        try(BufferedReader br = new BufferedReader(new FileReader(log.getAbsolutePathSourceLog()));
            if(){

            }
            BufferedWriter bw = new BufferedWriter(new FileWriter(log.getAbsolutePathExecutedLogs() + "" + logName + "1")))
            {
                String text;
                while(br.readLine() != null){
                    text = br.readLine();
                    lines++;
                    bw.write(text + "\n");
                    bw.flush();
                }
            }
                catch(IOException ex){
                System.out.println(ex.getMessage());
            }
    }
}
