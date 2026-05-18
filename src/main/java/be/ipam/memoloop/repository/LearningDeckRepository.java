package be.ipam.memoloop.repository;

import be.ipam.memoloop.model.LearningDeck;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LearningDeckRepository extends JpaRepository<LearningDeck, Long> {
}