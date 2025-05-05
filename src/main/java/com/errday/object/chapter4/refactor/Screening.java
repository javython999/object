package com.errday.object.chapter4.refactor;


import com.errday.object.chapter4.refactor.movie.Movie;
import lombok.Getter;

import java.time.LocalDateTime;

@Getter
public class Screening {

    private Movie movie;
    private int sequence;
    private LocalDateTime whenScreened;

    public Money calculateFee(int audienceCount) {
        return movie.calculateMovieFee(this).times(audienceCount);
    }
}
