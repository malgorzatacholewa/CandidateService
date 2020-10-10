package pl.sda.candidateService.domein.candidate;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Component
@AllArgsConstructor
public class CandidateFacade {

    CandidateRepository repository;

    public Candidate getCandidateByPesel(Long pesel) {
        Optional<Candidate> result = repository.findById(pesel);
        if (result.isPresent()){
            return result.get();
        }
        return null;
    }
}
