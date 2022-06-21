package top.byteinfo.blog.mbg.mapper;

import java.util.List;

import top.byteinfo.blog.mbg.entity.TbArticle;

public interface TbArticleMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(TbArticle record);

    TbArticle selectByPrimaryKey(Integer id);

    List<TbArticle> selectAll();

    int updateByPrimaryKey(TbArticle record);
}