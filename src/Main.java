import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
//        for(int i = 0; i < args.length; i++){
//            args[i].replaceAll('\\', '\\')
//        }
//        Separator sp = new Separator(new Logs(args[0], args[1]));
        Logs lg = new Logs("C:\\Users\\User\\Desktop\\logs\\main.log.2014-11-17", "C:\\Users\\User\\Desktop\\logs\\executedFiles");
        System.out.println(lg.getLineCountByIncrement());
    }
}