package uz.jl;

import uz.jl.log.LogConfig;
import uz.jl.ui.Menu;

import java.util.logging.Logger;

public class Application {
    public static final Logger logger = Logger.getLogger(Application.class.getName());

    public static void main(String[] args) {
      Menu.mainMenu();
        LogConfig.load();
        for (int i = 0; i < 5E5; i++) {
            logger.warning("Warning message -> " + i);
        }
    }
}
