package pl.sda.candidateService.api;

import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import pl.sda.candidateService.domein.candidate.CandidateFacade;
import pl.sda.candidateService.domein.candidate.CandidateResponse;

@RestController
@AllArgsConstructor
    public class CandidateController {

        private CandidateFacade facade;

        @GetMapping("/candidate/{pesel}")
        ResponseEntity<CandidateResponse> getCandidateByPesel(@PathVariable Long pesel) {
            CandidateResponse response = new CandidateResponse();
            try {
                response.setCandidate(facade.getCandidateByPesel(pesel));
                return new ResponseEntity<>(response, HttpStatus.OK);
            } catch (Exception e) {
                response.setMessage(e.getMessage());
                return new ResponseEntity<>(response, HttpStatus.BAD_REQUEST);
            }
        }
}
