package top.byteinfo.blog.mbg.mapper;

import java.util.List;
import top.byteinfo.blog.mbg.entity.Article;

public interface ArticleMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Article record);

    Article selectByPrimaryKey(Integer id);

    List<Article> selectAll();

    int updateByPrimaryKey(Article record);
}