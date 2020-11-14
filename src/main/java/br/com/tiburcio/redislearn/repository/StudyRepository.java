package br.com.tiburcio.redislearn.repository;

import br.com.tiburcio.redislearn.model.StudyCache;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudyRepository extends CrudRepository<StudyCache, String> {
}
