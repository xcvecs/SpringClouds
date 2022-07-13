//package top.byteinfo.cd.blogx.service.Impl;
//
//import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
//import com.baomidou.mybatisplus.core.toolkit.Wrappers;
//import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
//import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
//import eu.bitwalker.useragentutils.UserAgent;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//import org.springframework.util.DigestUtils;
//import top.byteinfo.blog.mbg.entity.TbArticle;
//import top.byteinfo.cd.blogx.dao.TbArticleDao;
//import top.byteinfo.cd.blogx.service.TbArticleService;
//import top.byteinfo.cd.blogx.util.CommonUtils;
//import top.byteinfo.cd.blogx.util.IpUtils;
//
//import javax.servlet.http.HttpServletRequest;
//import javax.servlet.http.HttpSession;
//import java.util.Comparator;
//import java.util.HashSet;
//import java.util.Optional;
//import java.util.Set;
//import java.util.concurrent.CompletableFuture;
//import java.util.function.Supplier;
//import java.util.stream.Collectors;
//
//@Service
//public class TbArticleServiceImpl extends ServiceImpl<TbArticleDao, TbArticle> implements TbArticleService {
//
////    @Autowired
////    TbArticleDao tbArticleDao;
//
//    @Autowired
//    private HttpSession session;
//    @Autowired
//    HttpServletRequest request;
//
//    @Override
//    public void Test() {
////        Page<Article> page = new Page<>(PageUtils.getCurrent(), PageUtils.getSize());
//        Page<TbArticle> page = new Page<>(0, 10);
//
//
//        LambdaQueryWrapper<TbArticle> queryWrapper = Wrappers.lambdaQuery(TbArticle.class).select(TbArticle::getId, TbArticle::getArticleTitle, TbArticle::getCreateTime)
//                .orderByDesc(TbArticle::getCreateTime)
//                .eq(TbArticle::getIsDelete, 1)
//                .eq(TbArticle::getStatus, 1);
//
//
//        Page<TbArticle> articlePage = this.baseMapper.selectPage(page, new LambdaQueryWrapper<TbArticle>()
//                .select(TbArticle::getId, TbArticle::getArticleTitle, TbArticle::getCreateTime)
//                .orderByDesc(TbArticle::getCreateTime)
//                .eq(TbArticle::getIsDelete, 1)
//                .eq(TbArticle::getStatus, 1)
//        );
//
//
//        this.baseMapper.selectPage(page, Wrappers.lambdaQuery(TbArticle.class)
//                .select(TbArticle::getId, TbArticle::getArticleTitle, TbArticle::getCreateTime)
//                .orderByDesc(TbArticle::getCreateTime)
//                .eq(TbArticle::getIsDelete, 1)
//                .eq(TbArticle::getStatus, 1)
//        );
//
//        this.baseMapper.selectPage(page, queryWrapper);
//        TbArticle tbArticle = this.getOne(queryWrapper);
//        Supplier<TbArticle> tbArticleCopier = () -> this.getOne(queryWrapper);
//        CompletableFuture<TbArticle> supplyAsync = CompletableFuture
//                .supplyAsync(tbArticleCopier);
//
//        Set<Integer> articleSet = CommonUtils.castSet(Optional.ofNullable(session.getAttribute("ARTICLE_SET")).orElseGet(HashSet::new), Integer.class);
//        if (!articleSet.contains(1)) {
//            articleSet.add(1);
//            session.setAttribute("ARTICLE_SET", articleSet);
//            // 浏览量+1
////            redisService.zIncr(ARTICLE_VIEWS_COUNT, articleId, 1D);
//        }
//
//        // 获取ip
//        String ipAddress = IpUtils.getIpAddress(request);
//        // 获取访问设备
//        UserAgent userAgent = IpUtils.getUserAgent(request);
//        String md5 = DigestUtils.md5DigestAsHex("uuid".getBytes());
//
//        this.baseMapper.selectList(new LambdaQueryWrapper<TbArticle>()
//                        .select(TbArticle::getId, TbArticle::getArticleTitle)
//                        .in(TbArticle::getId, 1))
//                .stream().map(article ->
//                        article
//                )
//                .sorted(Comparator.comparingInt(TbArticle::getId).reversed())
//                .collect(Collectors.toList());
//
////        Comparator.comparingInt();
//
//
//        /**
//         *
//         * https://stackoverflow.com/questions/45632920/why-should-one-use-objects-requirenonnull
//         * https://blog.csdn.net/chaiyu2002/article/details/117920760
//         * https://blog.csdn.net/qq_42671519/article/details/121530411
//         */
//        //TODO attention -----> MORE coding
//
//
//    }
//
//}
