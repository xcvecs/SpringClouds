//package top.byteinfo.cd.blogx.aspect;
//
//import io.swagger.annotations.Api;
//import io.swagger.annotations.ApiOperation;
//import org.aspectj.lang.JoinPoint;
//import org.aspectj.lang.annotation.After;
//import org.aspectj.lang.annotation.AfterReturning;
//import org.aspectj.lang.annotation.Aspect;
//import org.aspectj.lang.annotation.Pointcut;
//import org.aspectj.lang.reflect.MethodSignature;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Component;
//import org.springframework.web.context.request.RequestAttributes;
//import org.springframework.web.context.request.RequestContextHolder;
//import org.springframework.web.context.request.ServletRequestAttributes;
//import top.byteinfo.cd.blogx.annotation.OptLog;
//
//import javax.servlet.http.HttpServletRequest;
//import java.lang.reflect.Method;
//import java.util.Objects;
//
///**
// *{@link org.aspectj.lang.annotation.After}
// */
//@Aspect
//@Component
//public class OptLogAspect {
//
////    @Autowired
////    private OperationLogDao operationLogDao;
//
//    @Autowired
//    HttpServletRequest httpServletRequest;
//
//    @Pointcut("@annotation(top.byteinfo.cd.blogx.annotation.OptLog)")
//    public void optLogPointCut() {
//    }
//
//
//    @AfterReturning(value = "optLogPointCut()", returning = "keys")
//    @SuppressWarnings("unchecked")
//    public void saveOptLog(JoinPoint joinPoint, Object keys) {
//        /*
//         * org.springframework.web.context.request
//         * */
//        RequestAttributes requestAttributes = RequestContextHolder.getRequestAttributes();
//        HttpServletRequest request = (HttpServletRequest) Objects.requireNonNull(requestAttributes).resolveReference(RequestAttributes.REFERENCE_REQUEST);
//        /*
//         * org.springframework.web.context.request
//         * https://blog.csdn.net/u010180738/article/details/84504007
//         * */
//
//        RequestAttributes attributes = RequestContextHolder.getRequestAttributes();
//        ServletRequestAttributes servletRequestAttributes = (ServletRequestAttributes) attributes;
//        HttpServletRequest httpServletRequest1 = servletRequestAttributes.getRequest();
//
//
//        MethodSignature signature = (MethodSignature) joinPoint.getSignature();
//
//
//        Api api = (Api) signature.getDeclaringType().getAnnotation(Api.class);// @Target({ElementType.TYPE})
//
//        Method method = signature.getMethod();
//        ApiOperation apiOperation = method.getAnnotation(ApiOperation.class); //@Target({ElementType.METHOD, ElementType.TYPE})
//        OptLog optLog = method.getAnnotation(OptLog.class);// @Target(ElementType.METHOD)
//
//
////        OperationLog operationLog = new OperationLog();
////        // ??????????????????????????????????????????????????????????????????
//
//
////        // ??????????????????????????????
////        Method method = signature.getMethod();
////        // ????????????
//
////        // ????????????
////        operationLog.setOptModule(api.tags()[0]);
////        // ????????????
////        operationLog.setOptType(optLog.optType());
////        // ????????????
////        operationLog.setOptDesc(apiOperation.value());
////        // ?????????????????????
////        String className = joinPoint.getTarget().getClass().getName();
////        // ????????????????????????
////        String methodName = method.getName();
////        methodName = className + "." + methodName;
////        // ????????????
////        operationLog.setRequestMethod(Objects.requireNonNull(request).getMethod());
////        // ????????????
////        operationLog.setOptMethod(methodName);
////        // ????????????
////        operationLog.setRequestParam(JSON.toJSONString(joinPoint.getArgs()));
////        // ????????????
////        operationLog.setResponseData(JSON.toJSONString(keys));
////        // ????????????ID
////        operationLog.setUserId(UserUtils.getLoginUser().getId());
////        // ????????????
////        operationLog.setNickname(UserUtils.getLoginUser().getNickname());
////        // ??????IP
////        String ipAddress = IpUtils.getIpAddress(request);
////        operationLog.setIpAddress(ipAddress);
////        operationLog.setIpSource(IpUtils.getIpSource(ipAddress));
////        // ??????URL
////        operationLog.setOptUrl(request.getRequestURI());
////        operationLogDao.insert(operationLog);
//    }
//
//
//    //https://zhuanlan.zhihu.com/p/63001123
//
//    /**
//     * execute?????????
//     * execution(public * *(..))  execution(* set*(..))  execution(* com.xyz.service.AccountService.*(..)) execution(* com.xyz.service..*.*(..))
//     * within?????????
//     * within(com.xyz.service.*)  within(com.xyz.service..*)
//     * this(com.xyz.service.AccountService)
//     * target(com.xyz.service.AccountService)
//     * args(com.ms.aop.args.demo1.UserModel)
//     * args(com.ms.aop.args.demo1.UserModel,..)
//     *
//     *
//     */
//    @Pointcut()
//    public void mostExpression() {
//    }
//
//    @After(value = "mostExpression()")
//    public void test1() {
//
//    }
//
//
//}
