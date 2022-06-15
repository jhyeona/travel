package review.bean;

import lombok.Data;

@Data
public class ReviewDTO {
	private int review_seq;
	private String review_subject;
	private String review_content;
	private String review_id;
	private String review_pw;
}
