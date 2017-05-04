package com.cn.mensheng.form.service;

import com.cn.mensheng.form.module.Board;
import com.cn.mensheng.form.module.Post;
import com.cn.mensheng.form.module.Topic;
import com.github.pagehelper.PageInfo;

import java.util.List;

/**
 * Created by l on 2017/4/29.
 */
public interface FormService {
    public void addTopic(Topic topic);

    public void removeTopic(int topicId);

    public void addPost(Post post);

    public void removePost(int postId);

    public void addBoard(Board board);

    public void makeDigestTopic(int topicId);

    public Board getBoardById(int boardId);

    public Topic getTopicByTopicId(int topicId);

    public Post getPostByPostId(int postId);

    public void updateTopic(Topic topic);

    public void updatePost(Post post);

    public void removeBoard(int boardId);

    public List<Board> getAllBoards();

    public void addBoardManager(int boardId,String userName);

    public PageInfo queryTopicByTitle(String title, int pageNo, int pageSize);

    public PageInfo getPagedTopics(int topicId, int pageNo, int pageSize);

    public PageInfo getPagedPosts(int topicId,int pageNo,int pageSize);

}
