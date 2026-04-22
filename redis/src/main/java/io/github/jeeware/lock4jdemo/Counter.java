package io.github.jeeware.lock4jdemo;

import org.springframework.data.annotation.Id;
import org.springframework.data.redis.core.RedisHash;

@RedisHash("counters")
public record Counter(@Id String name, int count) {

    public Counter increment() {
        return new Counter(this.name, this.count + 1);
    }
}
