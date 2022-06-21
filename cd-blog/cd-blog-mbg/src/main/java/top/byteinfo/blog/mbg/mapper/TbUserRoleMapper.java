package top.byteinfo.blog.mbg.mapper;

import java.util.List;

import top.byteinfo.blog.mbg.entity.TbUserRole;

public interface TbUserRoleMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(TbUserRole record);

    TbUserRole selectByPrimaryKey(Integer id);

    List<TbUserRole> selectAll();

    int updateByPrimaryKey(TbUserRole record);
}