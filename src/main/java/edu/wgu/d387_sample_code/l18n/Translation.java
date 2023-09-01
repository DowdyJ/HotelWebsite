package edu.wgu.d387_sample_code.l18n;

import org.springframework.core.io.ClassPathResource;

import java.io.InputStream;
import java.util.Properties;

public class Translation {

    public static String getWelcomeMessage(String localeCode) {
        String res;

        Properties properties = new Properties();
        InputStream localizationFileSteam = null;
        try {
            localizationFileSteam = new ClassPathResource("welcome_" + localeCode + ".properties").getInputStream();
            properties.load(localizationFileSteam);
            res = properties.getProperty("welcomeMessage");
        }
        catch (Exception e) {
            System.out.println(e.getStackTrace());
            res = "ERROR: Failed to get translation string for welcomeMessage";
        }
        finally {
            if (localizationFileSteam != null) {
                try {
                    localizationFileSteam.close();
                }
                catch (Exception e) {
                    System.out.println(e.getStackTrace());
                }
            }
        }

        return res;
    }
}
