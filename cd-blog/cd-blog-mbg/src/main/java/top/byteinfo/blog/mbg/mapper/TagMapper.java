package top.byteinfo.blog.mbg.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import top.byteinfo.blog.mbg.entity.Tag;

public interface TagMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Tag record);

    Tag selectByPrimaryKey(Integer id);

    List<Tag> selectAll();

    int updateByPrimaryKey(Tag record);

    List<Tag> getTagByTagId(Integer tagId);
    List<Tag> getTagByTagIds(@Param("tagIds") List<Integer> tagIds);
}