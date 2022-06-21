package top.byteinfo.blog.mbg.mapper;

import java.util.List;
import top.byteinfo.blog.mbg.entity.RoleAuthority;

public interface RoleAuthorityMapper {
    int deleteByPrimaryKey(Integer idroleAuthority);

    int insert(RoleAuthority record);

    RoleAuthority selectByPrimaryKey(Integer idroleAuthority);

    List<RoleAuthority> selectAll();

    int updateByPrimaryKey(RoleAuthority record);
}