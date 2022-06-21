package top.byteinfo.blog.mbg.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import top.byteinfo.blog.mbg.entity.ArticleTag;

public interface ArticleTagMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(ArticleTag record);

    ArticleTag selectByPrimaryKey(Integer id);

    List<ArticleTag> selectAll();

    int updateByPrimaryKey(ArticleTag record);


    List<ArticleTag> getTagByArticleId(@Param("articleId") Integer articleId);

    List<ArticleTag> getTagByArticleIds(@Param("articleIds") List<Integer> articleIds);
}