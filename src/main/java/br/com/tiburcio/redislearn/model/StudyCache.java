package br.com.tiburcio.redislearn.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.redis.core.RedisHash;
import org.springframework.data.redis.core.TimeToLive;

@Data
@AllArgsConstructor
@NoArgsConstructor
@RedisHash("study")
public class StudyCache {

    @Id
    private String key;

    @TimeToLive
    private Long expiration;

    private Long number;

    private String name;
}
