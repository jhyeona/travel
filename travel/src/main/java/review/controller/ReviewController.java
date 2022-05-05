package review.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import review.service.ReviewService;

@Controller
@RequestMapping(value="review")
public class ReviewController {
	@Autowired
	private ReviewService reviewService;

}
