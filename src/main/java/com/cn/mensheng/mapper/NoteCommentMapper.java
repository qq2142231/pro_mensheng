package com.cn.mensheng.mapper;

import com.cn.mensheng.note.module.NoteComment;
import com.cn.mensheng.note.module.NoteCommentKey;

public interface NoteCommentMapper {
    int deleteByPrimaryKey(NoteCommentKey key);

    int insert(NoteComment record);

    int insertSelective(NoteComment record);

    NoteComment selectByPrimaryKey(NoteCommentKey key);

    int updateByPrimaryKeySelective(NoteComment record);

    int updateByPrimaryKey(NoteComment record);
}