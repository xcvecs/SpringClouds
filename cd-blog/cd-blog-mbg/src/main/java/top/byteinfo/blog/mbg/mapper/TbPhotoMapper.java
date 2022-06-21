package top.byteinfo.blog.mbg.mapper;

import java.util.List;

import top.byteinfo.blog.mbg.entity.TbPhoto;

public interface TbPhotoMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(TbPhoto record);

    TbPhoto selectByPrimaryKey(Integer id);

    List<TbPhoto> selectAll();

    int updateByPrimaryKey(TbPhoto record);
}