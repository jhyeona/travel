package calendar.bean;

import lombok.Data;

@Data
public class CalendarDTO {
	private int calendar_seq;
	private String calendar_subject;
	private String calendar_content;
	private String calendar_id;
	private String calendar_pw;
}
