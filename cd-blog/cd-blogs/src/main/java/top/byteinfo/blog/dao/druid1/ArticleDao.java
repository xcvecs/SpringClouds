package top.byteinfo.blog.dao.druid1;

import org.apache.ibatis.annotations.Param;
import top.byteinfo.blog.mbg.entity.Article;
import top.byteinfo.blog.model.dto.ArticlePreDTO;
import top.byteinfo.blog.model.vo.ArticleHomeVO;

import java.util.List;

public interface ArticleDao {
    List<ArticleHomeVO> getArticleHomeList(@Param("current") Integer current, @Param("size") Integer size);

    List<ArticlePreDTO> getPreviewArticleList(@Param("tagId") Integer tagId ,@Param("categoryId") Integer categoryId);

    Article getHomeArticle();
    List<Article> getArticles();

    //    List<Article> selectAll();
    List<Article> getHomeArticles();
}
