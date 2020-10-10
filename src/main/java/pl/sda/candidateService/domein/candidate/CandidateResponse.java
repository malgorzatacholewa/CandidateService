package pl.sda.candidateService.domein.candidate;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Getter
@Setter
@JsonInclude(JsonInclude.Include.NON_EMPTY)

public class CandidateResponse {
    String message;
    Candidate candidate;
}
