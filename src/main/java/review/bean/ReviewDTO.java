package review.bean;

import java.util.Date;

import lombok.Data;

@Data
public class ReviewDTO {
	private int review_seq;
	private String review_subject;
	private String review_content;
	private String review_id;
	private String review_pw;
	
	private Date review_created;
	private Date review_modified;
	private Date review_deleted;
}
