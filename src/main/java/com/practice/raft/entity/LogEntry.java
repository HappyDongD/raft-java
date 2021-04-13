package com.practice.raft.entity;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.util.Objects;

/**
 * 日志条目
 *
 * @author 莫那·鲁道
 */
@Getter
@Setter
public class LogEntry implements Serializable, Comparable {

    private Long index;

    private long term;

    private Command command;


    @Override
    public int compareTo(Object o) {
        if (o == null) {
            return -1;
        }
        if (this.getIndex() > ((LogEntry) o).getIndex()) {
            return 1;
        }
        return -1;
    }
}
