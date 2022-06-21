package top.byteinfo.blog.mbg.mapper;

import java.util.List;

import top.byteinfo.blog.mbg.entity.TbRoleResource;

public interface TbRoleResourceMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(TbRoleResource record);

    TbRoleResource selectByPrimaryKey(Integer id);

    List<TbRoleResource> selectAll();

    int updateByPrimaryKey(TbRoleResource record);
}