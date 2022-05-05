package review.service;

import org.springframework.beans.factory.annotation.Autowired;

import review.dao.ReviewDAO;

public class ReviewServiceImpl implements ReviewService {
	@Autowired
	private ReviewDAO reviewDAO;
	
}
