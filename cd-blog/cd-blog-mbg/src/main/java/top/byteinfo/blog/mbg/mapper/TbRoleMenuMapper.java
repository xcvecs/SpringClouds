package top.byteinfo.blog.mbg.mapper;

import java.util.List;

import top.byteinfo.blog.mbg.entity.TbRoleMenu;

public interface TbRoleMenuMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(TbRoleMenu record);

    TbRoleMenu selectByPrimaryKey(Integer id);

    List<TbRoleMenu> selectAll();

    int updateByPrimaryKey(TbRoleMenu record);
}