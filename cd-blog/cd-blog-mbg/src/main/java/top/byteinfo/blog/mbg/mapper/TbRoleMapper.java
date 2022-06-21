package top.byteinfo.blog.mbg.mapper;

import java.util.List;

import top.byteinfo.blog.mbg.entity.TbRole;

public interface TbRoleMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(TbRole record);

    TbRole selectByPrimaryKey(Integer id);

    List<TbRole> selectAll();

    int updateByPrimaryKey(TbRole record);
}