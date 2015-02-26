package common;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Application {

    public static void init() {
        Browser.getDriver();
    }

    public static String getProperty(String key) throws FileNotFoundException {
        Properties prop = new Properties();
        String propFileName = "resources/application.properties";

        InputStream inputStream = Application.class.getClassLoader().getResourceAsStream(propFileName);

        if (inputStream != null) {
            try {
                prop.load(inputStream);
            } catch (IOException ex) {
                Logger.getLogger(Application.class.getName()).log(Level.SEVERE, null, ex);
            }

        } else {
            throw new FileNotFoundException("property file '" + propFileName + "' not found in the classpath");
        }

        return prop.getProperty(key);
    }
}
