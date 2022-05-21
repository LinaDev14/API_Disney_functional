package com.example.api_disney.domain.collections;

import com.example.api_disney.domain.utils.Rating;
import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDate;

@Data
@Document
public class Media {

    @Id
    private final String mediaId;
    private final String categoryId;
    private final String mediaTitle;

    @JsonFormat(pattern = "dd-MM-yyyy")
    private final LocalDate date;
    private final Rating rating;

}
