package calendar.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import calendar.service.CalendarService;

@Controller
@RequestMapping(value="calendar")
public class CalendarController {
	@Autowired
	private CalendarService calendarService;
	
}
