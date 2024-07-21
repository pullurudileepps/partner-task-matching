package com.miniproject.partnerlocation.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import nonapi.io.github.classgraph.json.Id;
import org.springframework.data.redis.core.RedisHash;

import java.io.Serializable;

@Data
@RedisHash("Partner")
public class Partner implements Serializable {
    @Id
    private long id;
    private String name;
    private Location location;
}