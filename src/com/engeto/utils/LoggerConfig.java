package com.engeto.utils;
import java.io.IOException;
import java.util.logging.*;

public class LoggerConfig {
    public static void configureLogger() {
        try {
            Logger logger = Logger.getLogger("");
            FileHandler fileHandler = new FileHandler("logs/plants.log",true);
            fileHandler.setFormatter(new SimpleFormatter());
            logger.addHandler(fileHandler);
            logger.setLevel(Level.ALL);
        } catch (IOException e) {
            System.err.println("Chyba při konfiguraci logování: " + e.getMessage());
        }
    }
}
