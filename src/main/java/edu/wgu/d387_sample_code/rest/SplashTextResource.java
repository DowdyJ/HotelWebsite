package edu.wgu.d387_sample_code.rest;


import edu.wgu.d387_sample_code.convertor.*;
import edu.wgu.d387_sample_code.entity.ReservationEntity;
import edu.wgu.d387_sample_code.entity.RoomEntity;
import edu.wgu.d387_sample_code.l18n.TimeConverter;
import edu.wgu.d387_sample_code.model.request.ReservationRequest;
import edu.wgu.d387_sample_code.model.response.ReservableRoomResponse;
import edu.wgu.d387_sample_code.model.response.ReservationResponse;
//import edu.wgu.d387_sample_code.repository.PageableRoomRepository;
import edu.wgu.d387_sample_code.repository.ReservationRepository;
import edu.wgu.d387_sample_code.repository.RoomRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.core.convert.ConversionService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.Pageable;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

import java.time.LocalDate;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.List;
import java.util.Optional;


@RestController
public class SplashTextResource {

    @RequestMapping(path = ResourceConstants.SPLASH_TEXT_V1, method = RequestMethod.GET, produces = MediaType.TEXT_PLAIN_VALUE)
    public ResponseEntity<String> getTimeForMeetingString() {
        String dateString = TimeConverter.getConvertedTimeStringForMeetingSplash(
                ZonedDateTime.of(2023, 12, 5, 8, 45, 0, 0, ZoneId.of("UTC-5")));

        return new ResponseEntity<>(dateString, HttpStatus.OK);
    }

}
