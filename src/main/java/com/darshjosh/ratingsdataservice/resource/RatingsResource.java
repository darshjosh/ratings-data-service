package com.darshjosh.ratingsdataservice.resource;

import com.darshjosh.ratingsdataservice.model.Rating;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/ratingsdata")
public class RatingsResource {

    @RequestMapping("/{movieId}")
    public Rating getRating(@PathVariable("movieId") long movieId){
        return new Rating(movieId, 9);
    }

}
