package top.byteinfo.blog.service;

import top.byteinfo.blog.model.vo.ArticleVO;

import java.util.List;

public interface BlogArticleService {
    List<ArticleVO> getHomeArticle();

    List<ArticleVO> getHomeArticles();


    List<ArticleVO> getArticleHomeDTOList();
}
