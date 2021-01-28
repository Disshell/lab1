package io.disshell.model;

import lombok.Builder;
import lombok.Data;


@Builder
@Data
public class Question {
    private int id;
    private String question;
    private String option;
    private String answer;
}
