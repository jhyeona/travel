package calendar.service;

import org.springframework.beans.factory.annotation.Autowired;

import calendar.dao.CalendarDAO;

public class CalendarServiceImpl implements CalendarService {
	@Autowired
	private CalendarDAO calendarDAO;
	
}
