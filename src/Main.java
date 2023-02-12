import logutils.*;

import java.util.logging.Level;

public class Main {
    public static void main(String[] args) {

        MyLogger logger=new MyLogger();
        logger.createLogger().log(Level.SEVERE," Test");

    }
}