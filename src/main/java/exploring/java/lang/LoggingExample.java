package exploring.java.lang;

import java.util.logging.ConsoleHandler;
import java.util.logging.Level;
import java.util.logging.Logger;

public class LoggingExample {

    /*
    * LEVEL        VALUE         USAGE
    * SEVERE       1000         INDICATES SERIOUS FAILURE
    * WARNING      900          POTENTIAL PROBLEM
    * INFO         800          GENERAL INFO
    * CONFIG       700          CONFIGURATION INFO
    * FINE         500          GENERAL DEVELOPER INFO
    * FINER        400          DETAILED DEVELOPER INFO
    * FINEST       300          SPECIALIZED DEVELOPER INFO
    *
    * SPECIAL LOGGING LEVELS
    *
    * OFF    Integer.MAX_VALUE  CAPTURING NOTHING
    * ALL    Integer.MIN_VALUE  CARTURING EVERYTHING
    *
    * */

    private  final static Logger LOGGER = Logger.getLogger(Logger.GLOBAL_LOGGER_NAME);

    public static void main(String[] args) {


        //The next 4 lines are to show all levels in the console with out it fine logs won't show
        ConsoleHandler handler = new ConsoleHandler();
        handler.setLevel(Level.ALL);
        LOGGER.addHandler(handler);
        LOGGER.setLevel(Level.ALL);

        LOGGER.log(Level.FINE,"Inside Main method");
        LOGGER.info("Information Log");


    }
}
