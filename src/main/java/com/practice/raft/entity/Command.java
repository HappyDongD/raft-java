package com.practice.raft.entity;

import lombok.*;

import java.io.Serializable;
import java.util.Objects;

/**
 * @author 莫那·鲁道
 */
@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class Command implements Serializable {

    String key;

    String value;


    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Command command = (Command) o;
        return Objects.equals(key, command.key) &&
                Objects.equals(value, command.value);
    }

    @Override
    public int hashCode() {
        return Objects.hash(key, value);
    }

}
