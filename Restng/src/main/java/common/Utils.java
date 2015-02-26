package common;

import java.util.logging.Level;
import java.util.logging.Logger;
import testland.TestController;

public class Utils {
    public static Class getClassByString(String className) {
        Class cls = null;
        
        try {
            cls = Class.forName(className);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(TestController.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return cls;
    }
}
