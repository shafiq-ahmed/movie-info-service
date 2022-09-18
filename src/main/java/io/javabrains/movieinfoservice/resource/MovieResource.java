package io.javabrains.movieinfoservice.resource;

import io.javabrains.movieinfoservice.entity.Movie;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/movies")
public class MovieResource {
    @GetMapping("/{movieId}")
    public Movie getMovie(@PathVariable("movieId") String movieId){
        return new Movie(movieId,"Transformers") ;
    }
}
