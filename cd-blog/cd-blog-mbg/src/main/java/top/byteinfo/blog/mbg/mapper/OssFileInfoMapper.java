package top.byteinfo.blog.mbg.mapper;

import java.util.List;
import top.byteinfo.blog.mbg.entity.OssFileInfo;

public interface OssFileInfoMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(OssFileInfo record);

    OssFileInfo selectByPrimaryKey(Integer id);

    List<OssFileInfo> selectAll();

    int updateByPrimaryKey(OssFileInfo record);
}