package top.byteinfo.blog.dao.druid1;

import org.apache.ibatis.annotations.Param;
import top.byteinfo.blog.mbg.entity.ArticleTag;

import java.util.List;

public interface ArticleTagDao {
    int deleteByPrimaryKey(Integer id);

    int insert(ArticleTag record);

    ArticleTag selectByPrimaryKey(Integer id);

    List<ArticleTag> selectAll();

    int updateByPrimaryKey(ArticleTag record);


    List<ArticleTag> getTagByArticleId(@Param("articleId") Integer articleId);

    List<ArticleTag> getTagByArticleIds(@Param("articleIds") List<Integer> articleIds);
}