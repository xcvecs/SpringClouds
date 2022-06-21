package top.byteinfo.blog.mbg.mapper;

import java.util.List;
import top.byteinfo.blog.mbg.entity.TbWebsiteConfig;

public interface TbWebsiteConfigMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(TbWebsiteConfig record);

    TbWebsiteConfig selectByPrimaryKey(Integer id);

    List<TbWebsiteConfig> selectAll();

    int updateByPrimaryKey(TbWebsiteConfig record);
}