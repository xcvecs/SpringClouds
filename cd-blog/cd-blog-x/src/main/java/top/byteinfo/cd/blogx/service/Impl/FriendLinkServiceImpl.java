package top.byteinfo.cd.blogx.service.Impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.security.core.session.SessionRegistry;
import org.springframework.transaction.annotation.Transactional;
import top.byteinfo.blog.mbg.entity.TbFriendLink;
import top.byteinfo.blog.mbg.entity.TbMenu;
import top.byteinfo.cd.blogx.dao.FriendLinkDao;
import top.byteinfo.cd.blogx.service.FriendLinkService;

import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.stream.Collectors;

public class FriendLinkServiceImpl extends ServiceImpl<FriendLinkDao, TbFriendLink> implements FriendLinkService {

    @Autowired
    private SessionRegistry sessionRegistry;

    @Transactional(rollbackFor = Exception.class)
    public void saveOrUpdateFriendLink() {
//        this.saveOrUpdate(friendLink);
    }

    //TODO code is not all
    public List<TbMenu> listMenus(Integer conditionVO) {
        // 查询菜单数据
//        List<Menu> menuList = menuDao.selectList(new LambdaQueryWrapper<Menu>()
//                .like(StringUtils.isNotBlank(conditionVO.getKeywords()), Menu::getName, conditionVO.getKeywords()));
        // 获取目录列表
//        List<Menu> catalogList = listCatalog(menuList);
        // 获取目录下的子菜单
//        Map<Integer, List<Menu>> childrenMap = getMenuMap(menuList);
        // 组装目录菜单数据
//        List<MenuDTO> menuDTOList = catalogList.stream().map(
//                item -> {
//            MenuDTO menuDTO = BeanCopyUtils.copyObject(item, MenuDTO.class);
//            // 获取目录下的菜单排序
//            List<MenuDTO> list = BeanCopyUtils.copyList(childrenMap.get(item.getId()), MenuDTO.class).stream()
//                    .sorted(Comparator.comparing(MenuDTO::getOrderNum))
//                    .collect(Collectors.toList());
//            menuDTO.setChildren(list);
//            childrenMap.remove(item.getId());
//            return menuDTO;
//        }
//        ).sorted(Comparator.comparing(MenuDTO::getOrderNum)).collect(Collectors.toList());
        // 若还有菜单未取出则拼接

//        List<MenuDTO> menuDTOList = catalogList.stream().map

//        if (CollectionUtils.isNotEmpty(childrenMap)) {
//            List<Menu> childrenList = new ArrayList<>();
//            childrenMap.values().forEach(childrenList::addAll);
//            List<MenuDTO> childrenDTOList = childrenList.stream()
//                    .map(item -> BeanCopyUtils.copyObject(item, MenuDTO.class))
//                    .sorted(Comparator.comparing(MenuDTO::getOrderNum))
//                    .collect(Collectors.toList());
//            menuDTOList.addAll(childrenDTOList);
//        }

//        childrenMap.values().forEach(childrenList::addAll);
        return null;
    }
    /**
     * 获取目录下菜单列表
     *
     * @param menuList 菜单列表
     * @return 目录下的菜单列表
     */
    private Map<Integer, List<TbMenu>> getMenuMap(List<TbMenu> menuList) {
        return menuList.stream()
                .filter(item -> Objects.nonNull(item.getParentId()))
                .collect(Collectors.groupingBy(TbMenu::getParentId));
    }

//
//    @Transactional(rollbackFor = Exception.class)
//    public void saveOrUpdatePage(PageVO pageVO) {
//        Page page = BeanCopyUtils.copyObject(pageVO, Page.class);
//        this.saveOrUpdate(page);
//        // 删除缓存
//        redisService.del(PAGE_COVER);
//    }
//
//    @Transactional(rollbackFor = Exception.class)
//    public void deletePage(Integer pageId) {
//        pageDao.deleteById(pageId);
//        // 删除缓存
//        redisService.del(PAGE_COVER);
//    }
//
//    @Transactional(rollbackFor = Exception.class)
//    public List<PageVO> listPages() {
//        List<PageVO> pageVOList;
//        // 查找缓存信息，不存在则从mysql读取，更新缓存
//        Object pageList = redisService.get(PAGE_COVER);
//        if (Objects.nonNull(pageList)) {
//            pageVOList = JSON.parseObject(pageList.toString(), List.class);
//        } else {
//            pageVOList = BeanCopyUtils.copyList(pageDao.selectList(null), PageVO.class);
//            redisService.set(PAGE_COVER, JSON.toJSONString(pageVOList));
//        }
//        return pageVOList;
//    }

    @Scheduled(cron = " 0 0 0 * * ?", zone = "Asia/Shanghai")
    public void saveUniqueView() {
        // 获取每天用户量
//        Long count = redisService.sSize(UNIQUE_VISITOR);
//        // 获取昨天日期插入数据
//        UniqueView uniqueView = UniqueView.builder()
//                .createTime(LocalDateTimeUtil.offset(LocalDateTime.now(ZoneId.of(SHANGHAI.getZone())), -1, ChronoUnit.DAYS))
//                .viewsCount(Optional.of(count.intValue()).orElse(0))
//                .build();
//        uniqueViewDao.insert(uniqueView);
    }

    @Scheduled(cron = " 0 1 0 * * ?", zone = "Asia/Shanghai")
    public void clear() {
//        // 清空redis访客记录
//        redisService.del(UNIQUE_VISITOR);
//        // 清空redis游客区域统计
//        redisService.del(VISITOR_AREA);
    }
//    @Transactional(rollbackFor = Exception.class)
//    public UserInfoDTO qqLogin(QQLoginVO qqLoginVO) {
//        return socialLoginStrategyContext.executeLoginStrategy(JSON.toJSONString(qqLoginVO), LoginTypeEnum.QQ);
//    }
//
//    @Transactional(rollbackFor = BizException.class)
//    public UserInfoDTO weiboLogin(WeiboLoginVO weiboLoginVO) {
//        return socialLoginStrategyContext.executeLoginStrategy(JSON.toJSONString(weiboLoginVO), LoginTypeEnum.WEIBO);
//    }

//    @Override
//    public PageResult<UserOnlineDTO> listOnlineUsers(ConditionVO conditionVO) {
//        // 获取security在线session
//        List<UserOnlineDTO> userOnlineDTOList = sessionRegistry.getAllPrincipals().stream()
//                .filter(item -> sessionRegistry.getAllSessions(item, false).size() > 0)
//                .map(item -> JSON.parseObject(JSON.toJSONString(item), UserOnlineDTO.class))
//                .filter(item -> StringUtils.isBlank(conditionVO.getKeywords()) || item.getNickname().contains(conditionVO.getKeywords()))
//                .sorted(Comparator.comparing(UserOnlineDTO::getLastLoginTime).reversed())
//                .collect(Collectors.toList());
//        // 执行分页
//        int fromIndex = getLimitCurrent().intValue();
//        int size = getSize().intValue();
//        int toIndex = userOnlineDTOList.size() - fromIndex > size ? fromIndex + size : userOnlineDTOList.size();
//        List<UserOnlineDTO> userOnlineList = userOnlineDTOList.subList(fromIndex, toIndex);
//        return new PageResult<>(userOnlineList, userOnlineDTOList.size());
////    }
//public void removeOnlineUser(Integer userInfoId) {
//    // 获取用户session
//    List<Object> userInfoList = sessionRegistry.getAllPrincipals().stream().filter(item -> {
//        UserDetailDTO userDetailDTO = (UserDetailDTO) item;
//        return userDetailDTO.getUserInfoId().equals(userInfoId);
//    }).collect(Collectors.toList());
//    List<SessionInformation> allSessions = new ArrayList<>();
//    userInfoList.forEach(item -> allSessions.addAll(sessionRegistry.getAllSessions(item, false)));
//    // 注销session
//    allSessions.forEach(SessionInformation::expireNow);
//}
}
