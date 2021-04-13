package com.practice.raft.entity;

/**
 * @author zhang dong
 * @Description 请求投票RPC参数
 * @date 2021/4/13-14:27
 */
public class RequestVoteParam {
    /**
     * 领导人的任期号
     */
    private long term;

    /**
     * 请求选票的候选人ID
     */
    private String candidateId;

    /**
     * 候选人的最后日志条目的索引值
     */
    private long lastLogIndex;
    /**
     * 候选人最后的日志条目的任期号
     */
    private long lastLogTerm;

}
