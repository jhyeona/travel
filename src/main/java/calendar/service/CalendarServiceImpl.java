package calendar.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import calendar.dao.CalendarDAO;

@Service
public class CalendarServiceImpl implements CalendarService {
	@Autowired
	private CalendarDAO calendarDAO;
	
}
