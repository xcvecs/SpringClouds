package top.byteinfo.blog.mbg.mapper;

import java.util.List;

import top.byteinfo.blog.mbg.entity.TbTag;

public interface TbTagMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(TbTag record);

    TbTag selectByPrimaryKey(Integer id);

    List<TbTag> selectAll();

    int updateByPrimaryKey(TbTag record);
}