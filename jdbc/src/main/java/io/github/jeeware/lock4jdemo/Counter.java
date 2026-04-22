package io.github.jeeware.lock4jdemo;

import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.Version;
import org.springframework.data.relational.core.mapping.Table;

@Table(name = "COUNTER")
public record Counter(@Id String name, int count, @Version Long version) {

    public Counter increment() {
        return new Counter(this.name, this.count + 1, version);
    }
}
