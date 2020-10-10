package pl.sda.candidateService.domein.candidate;

import org.springframework.data.jpa.repository.JpaRepository;

interface CandidateRepository extends JpaRepository<Candidate,Long> {
}
