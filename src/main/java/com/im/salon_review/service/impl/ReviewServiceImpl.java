package com.im.salon_review.service.impl;


import com.im.salon_review.modal.Review;
import com.im.salon_review.payload.dto.SalonDTO;
import com.im.salon_review.payload.dto.UserDTO;
import com.im.salon_review.payload.request.CreateReviewRequest;
import com.im.salon_review.repository.ReviewRepository;
import com.im.salon_review.service.ReviewService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import javax.naming.AuthenticationException;
import java.util.List;

@Service
@RequiredArgsConstructor
public class ReviewServiceImpl implements ReviewService {

    private final ReviewRepository reviewRepository;


    @Override
    public Review createReview(CreateReviewRequest req,
                               UserDTO user,
                               SalonDTO salon) {
        Review newReview = new Review();

        newReview.setReviewText(req.getReviewText());
        newReview.setRating(req.getReviewRating());
        newReview.setUserId(user.getId());
        newReview.setSalonId(salon.getId());

        return reviewRepository.save(newReview);
    }

    @Override
    public List<Review> getReviewsBySalonId(Long productId) {
        return reviewRepository.findReviewsBySalonId(productId);
    }


    @Override
    public Review updateReview(Long reviewId,
                               String reviewText,
                               double rating,
                               Long userId) throws Exception, AuthenticationException {
        Review review=reviewRepository.findById(reviewId)
                .orElseThrow(()-> new Exception("Review Not found"));

        if(review.getUserId()!=userId){
            throw new AuthenticationException("You do not have permission to delete this review");
        }

        review.setReviewText(reviewText);
        review.setRating(rating);
        return reviewRepository.save(review);
    }

    @Override
    public void deleteReview(Long reviewId,Long userId) throws Exception,
            AuthenticationException {
        Review review=reviewRepository.findById(reviewId)
                .orElseThrow(()-> new Exception("Review Not found"));
        if(review.getUserId()!=userId){
            throw new AuthenticationException("You do not have permission to delete this review");
        }
        reviewRepository.delete(review);
    }

}
