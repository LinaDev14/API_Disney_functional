package com.example.api_disney.domain.dtos;

import com.example.api_disney.domain.utils.Rating;
import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


import java.time.LocalDate;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class MediaDTO {

    private String mediaId;
    private String categoryId;
    private String mediaTitle;

    @JsonFormat(pattern = "dd-MM-yyyy")
    private LocalDate date;
    private Rating rating;
}
