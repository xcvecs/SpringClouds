package top.byteinfo.blog.dao.druid1;

import org.apache.ibatis.annotations.Param;
import top.byteinfo.blog.mbg.entity.Tag;

import java.util.List;

public interface TagDao {
    int deleteByPrimaryKey(Integer id);

    int insert(Tag record);

    Tag selectByPrimaryKey(Integer id);

    List<Tag> selectAll();

    int updateByPrimaryKey(Tag record);

    List<Tag> getTagByTagId(Integer tagId);
    List<Tag> getTagByTagIds(@Param("tagIds") List<Integer> tagIds);
}