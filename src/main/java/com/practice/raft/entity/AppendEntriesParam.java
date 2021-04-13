package com.practice.raft.entity;

/**
 * @author zhang dong
 * @Description  附加日志RPC请求参数
 * @date 2021/4/13-14:27
 */
public class AppendEntriesParam {

    /**
     * 领导人任期号
     */
    private Long term;

    /** 领导人的 Id，以便于跟随者重定向请求 */
    String leaderId;

    /**新的日志条目紧随之前的索引值  */
    long prevLogIndex;

    /** prevLogIndex条目的任期号  */
    long preLogTerm;

    /** 准备存储的日志条目（表示心跳时为空；一次性发送多个是为了提高效率） */
    LogEntry[] entries;

    /** 领导人已经提交的日志的索引值  */
    long leaderCommit;

}
