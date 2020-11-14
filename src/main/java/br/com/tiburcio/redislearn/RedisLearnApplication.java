package br.com.tiburcio.redislearn;

import br.com.tiburcio.redislearn.model.StudyCache;
import br.com.tiburcio.redislearn.repository.StudyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@SpringBootApplication
@EnableCaching
public class RedisLearnApplication implements CommandLineRunner {

    @Autowired
    private StudyRepository studyRepository;

    public static void main(String[] args) {
        SpringApplication.run(RedisLearnApplication.class, args);
    }

    @Override
    public void run(String... args) {
        StudyCache studyCache = new StudyCache(null, 20L, 545L, "tiburcio");
        studyRepository.save(studyCache);
    }
}
