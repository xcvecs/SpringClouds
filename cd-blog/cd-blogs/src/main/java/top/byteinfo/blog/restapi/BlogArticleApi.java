package top.byteinfo.blog.restapi;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import top.byteinfo.blog.common.core.model.result.Result;
import top.byteinfo.blog.service.BlogArticleService;
import top.byteinfo.blog.model.vo.ArticleVO;

import java.util.List;

@Api(tags = "文章模块")
@RestController
@RequestMapping("blog")
public class BlogArticleApi {

    @Autowired
    private BlogArticleService articleService;

    @ApiOperation("查看blog首页文章")
    @GetMapping("/article")
    Result<?> getHomeArticle() {
        List<ArticleVO> homeArticles = articleService.getHomeArticle();
        return Result.ok("ok", homeArticles);
    }

    @ApiOperation("查看首页文章列表")
    @GetMapping("/articles")
    Result<?> getHomeArticles() {
        return Result.ok("ok",articleService.getHomeArticles());
    }


    @GetMapping("/articles/getArticleHomeVoList")
    Result<?> getArticleHomeDTOList(){
        articleService.getArticleHomeDTOList();
        return Result.ok("");
    }


    @GetMapping("/articleFrom")
    public Result<?> XlistArticles() {
        return Result.ok("ok");
    }

    @ApiOperation(value = "添加或修改文章")
    @PostMapping("/admin/articles")
    public Result<?> saveOrUpdateArticle(@Valid @RequestBody ArticleVO articleVO) {
//        articleService.saveOrUpdateArticle(articleVO);
        return Result.ok("ok");
    }

    @GetMapping("/admin/articles/{articleId}")
    public Result<?> getArticleBackById(@PathVariable("articleId") Integer articleId) {
        return Result.ok("articleService.getArticleBackById(articleId)");
    }
}
