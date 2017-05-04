package com.cn.mensheng.form.service.Impl;

import com.cn.mensheng.form.constant.formconstant;
import com.cn.mensheng.form.module.*;
import com.cn.mensheng.form.service.FormService;
import com.cn.mensheng.mapper.*;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.Date;
import java.util.List;

/**
 * Created by l on 2017/4/29.
 */
@Service("formService")
public class FormServiceImpl implements FormService {

    @Autowired
    private TopicMapper topicMapper;
    @Autowired
    private UserMapper userMapper;
    @Autowired
    private BoardMapper boardMapper;
    @Autowired
    private PostMapper postMapper;
    @Autowired
    private BoardManagerMapper boardManagerMapper;
    /**
     * 发表一个主题帖子,用户积分加10，论坛版块的主题帖数加1
     * @param topic
     */
    public void addTopic(Topic topic){
        Board board = (Board) boardMapper.selectByPrimaryKey(topic.getBoard_id());
        board.setTopic_num(board.getTopic_num()+1);
        topic.setLast_post(new Date());
        topicMapper.insert(topic);

        User user = userMapper.selectByPrimaryKey(topic.getUser_id());
        user.setCredit(user.getCredit() + 10);
        userMapper.updateByPrimaryKey(user);
    }

    /**
     * 删除一个主题帖，用户积分减50，论坛版块主题帖数减1，删除
     * 主题帖所有关联的帖子。
     * @param topicId 要删除的主题帖ID
     */
    public void removeTopic(int topicId) {
        Topic topic = topicMapper.selectByPrimaryKey(topicId);
        // 将论坛版块的主题帖数减1
        Board board = boardMapper.selectByPrimaryKey(topic.getBoard_id());
        board.setTopic_num(board.getTopic_num() - 1);
        // 发表该主题帖用户扣除50积分
        User user = userMapper.selectByPrimaryKey(topic.getUser_id());
        user.setCredit(user.getCredit() - 50);
        // 删除主题帖及其关联的帖子
        topicMapper.deleteByPrimaryKey(topicId);
        postMapper.deleteByPrimaryKey(topicId);
    }
    /**
     * 添加一个回复帖子，用户积分加5分，主题帖子回复数加1并更新最后回复时间
     * @param post
     */
    public void addPost(Post post){
     postMapper.insert(post);
     //用户积分加5
     User user = userMapper.selectByPrimaryKey(post.getUser_id());
     user.setCredit(user.getCredit() + 5);
     userMapper.updateByPrimaryKey(user);

     Topic topic = topicMapper.selectByPrimaryKey(post.getTopic_id());
     topic.setTopic_replies(topic.getTopic_replies() + 1);
     topic.setLast_post(new Date());

    }
/**
 * 删除一个回复的帖子，发表回复帖子的用户积分减20，主题帖的回复数减1
 * @param postId
 */
public void removePost(int postId){
    Post post = postMapper.selectByPrimaryKey(postId);
    postMapper.deleteByPrimaryKey(post.getPost_id());

    Topic topic = topicMapper.selectByPrimaryKey(post.getTopic_id());
    topic.setTopic_replies(topic.getTopic_replies() - 1);

    User user =userMapper.selectByPrimaryKey(post.getUser_id());
    user.setCredit(user.getCredit() - 20);
    userMapper.updateByPrimaryKey(user);
    topicMapper.updateByPrimaryKey(topic);

}
    /**
     * 创建一个新的论坛版块
     *
     * @param board
     */
    public void addBoard(Board board) {
        boardMapper.insert(board);
    }

    /**
     * 删除一个版块
     * @param boardId
     */
    public void removeBoard(int boardId){
        boardMapper.deleteByPrimaryKey(boardId);
    }

    /**
     * 将帖子置为精华主题帖
     * @param topicId 操作的目标主题帖ID
     *  可选的值为1，2，3
     */
    public void makeDigestTopic(int topicId){

        Topic topic = topicMapper.selectByPrimaryKey(topicId);
        topic.setDigest(formconstant.DIGEST_TOPIC);
        User user = userMapper.selectByPrimaryKey(topic.getUser_id());
        user.setCredit(user.getCredit() + 100);

        userMapper.updateByPrimaryKey(user);
        topicMapper.updateByPrimaryKey(topic);
    }

    /**
     * 获取所有的论坛版块
     * @return
     */
public  List<Board> getAllBoards() {  return boardMapper.allBoard(); }

    /**
     * 获取论坛版块某一页主题帖，以最后回复时间降序排列
     * @param
     * @return
     */

    public PageInfo getPagedTopics(int boardId, int pageNo, int pageSize){

        PageHelper.offsetPage(pageNo, pageSize);
        List<Topic> list = topicMapper.selectByBoardID(boardId);
        PageInfo page = new PageInfo(list);
        return page;
    }

    /**
     * 获取同主题每一页帖子，以最后回复时间降序排列
     * @param
     * @return
     */
    public PageInfo getPagedPosts(int topicId,int pageNo,int pageSize){

        PageHelper.offsetPage(pageNo, pageSize);
        List<Post> list = postMapper.selectByTopicID(topicId);
        PageInfo page = new PageInfo(list);
        return page;
    }



    /**
     * 查找出所有包括标题包含title的主题帖
     *
     * @param title
     *            标题查询条件
     * @return 标题包含title的主题帖
     */

    public PageInfo queryTopicByTitle(String title,int pageNo,int pageSize) {
        PageHelper.offsetPage(pageNo,pageSize);
        List<Post> list = postMapper.selectByTextTitle(title);
        PageInfo page = new PageInfo(list);
        return page;
    }
    /**
     * 根据boardId获取Board对象
     *
     * @param boardId
     */
    public Board getBoardById(int boardId) {
        return boardMapper.selectByPrimaryKey(boardId);
    }

    /**
     * 根据topicId获取Topic对象
     * @param topicId
     * @return Topic
     */
    public Topic getTopicByTopicId(int topicId) {
        return topicMapper.selectByPrimaryKey(topicId);
    }

    /**
     * 获取回复帖子的对象
     * @param postId
     * @return 回复帖子的对象
     */
    public Post getPostByPostId(int postId){
        return postMapper.selectByPrimaryKey(postId);
    }

    /**
     * 将用户设为论坛版块的管理员
     * @param boardId  论坛版块ID
     * @param userName 设为论坛管理的用户名
     */
    public void addBoardManager(int boardId,String userName){
        User user = userMapper.selectByUserName(userName);
        if(user == null){
            throw new RuntimeException("用户名为"+userName+"的用户不存在。");
        }else{
         BoardManagerKey boardManager = new BoardManagerKey();

         boardManager.setUser_id(user.getUser_id());
         boardManager.setBoard_id(boardId);

         boardManagerMapper.insert(boardManager);

            user.setUser_type(formconstant.FORUM_ADMIN);

            userMapper.updateByPrimaryKey(user);

        }
    }

    /**
     * 更改主题帖
     * @param topic
     */
    public void updateTopic(Topic topic){
        topicMapper.updateByPrimaryKey(topic);
    }

    /**
     * 更改回复帖子的内容
     * @param post
     */
    public void updatePost(Post post){
        postMapper.updateByPrimaryKey(post);
    }

}
