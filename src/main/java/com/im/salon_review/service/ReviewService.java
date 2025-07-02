package com.im.salon_review.service;


import com.im.salon_review.modal.Review;
import com.im.salon_review.payload.dto.SalonDTO;
import com.im.salon_review.payload.dto.UserDTO;
import com.im.salon_review.payload.request.CreateReviewRequest;

import javax.naming.AuthenticationException;
import java.util.List;

public interface ReviewService {

    Review createReview(CreateReviewRequest req,
                        UserDTO user,
                        SalonDTO salon);

    List<Review> getReviewsBySalonId(Long productId);

    Review updateReview(Long reviewId,
                        String reviewText,
                        double rating,
                        Long userId) throws Exception, AuthenticationException;


    void deleteReview(Long reviewId, Long userId) throws Exception, AuthenticationException;

}
