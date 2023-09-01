package edu.wgu.d387_sample_code.rest;

import edu.wgu.d387_sample_code.l18n.TimeConverter;
import edu.wgu.d387_sample_code.l18n.Translation;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.time.ZoneId;
import java.time.ZonedDateTime;

@RestController
public class WelcomeMessageResource {
    @RequestMapping(path = ResourceConstants.WELCOME_MESSAGES, method = RequestMethod.GET, produces = MediaType.TEXT_PLAIN_VALUE)
    public ResponseEntity<String> getWelcomeMessages() {

        String result = "";

        if (Translation.translations.containsKey("fr_CA")) {
            result += Translation.translations.get("fr_CA").getWelcomeMessage();
            result += " | ";
        }
        if (Translation.translations.containsKey("en_US")) {
            result += Translation.translations.get("en_US").getWelcomeMessage();
        }



        return new ResponseEntity<>(result, HttpStatus.OK);
    }
}
