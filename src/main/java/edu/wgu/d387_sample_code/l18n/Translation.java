package edu.wgu.d387_sample_code.l18n;

import org.springframework.core.io.ClassPathResource;

import java.io.InputStream;
import java.util.HashMap;
import java.util.Properties;

public class Translation {

    public static HashMap<String, Translation> translations = new HashMap<>();

    private String localCode;
    private Properties properties = null;


    public Translation(String localeCode) {
        this.localCode = localeCode;
    }

    public void InitializeLocale() {
        this.properties = new Properties();
        InputStream localizationFileSteam = null;
        try {
            localizationFileSteam = new ClassPathResource("welcome_" + this.localCode + ".properties").getInputStream();
            properties.load(localizationFileSteam);
        }
        catch (Exception e) {
            System.out.println(e.getStackTrace());
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
    }

    public String getWelcomeMessage() {
        String res = properties.getProperty("welcomeMessage");
        return res;
    }
}
