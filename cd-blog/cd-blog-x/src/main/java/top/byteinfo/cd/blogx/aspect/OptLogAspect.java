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
////        // 从切面织入点处通过反射机制获取织入点处的方法
//
//
////        // 获取切入点所在的方法
////        Method method = signature.getMethod();
////        // 获取操作
//
////        // 操作模块
////        operationLog.setOptModule(api.tags()[0]);
////        // 操作类型
////        operationLog.setOptType(optLog.optType());
////        // 操作描述
////        operationLog.setOptDesc(apiOperation.value());
////        // 获取请求的类名
////        String className = joinPoint.getTarget().getClass().getName();
////        // 获取请求的方法名
////        String methodName = method.getName();
////        methodName = className + "." + methodName;
////        // 请求方式
////        operationLog.setRequestMethod(Objects.requireNonNull(request).getMethod());
////        // 请求方法
////        operationLog.setOptMethod(methodName);
////        // 请求参数
////        operationLog.setRequestParam(JSON.toJSONString(joinPoint.getArgs()));
////        // 返回结果
////        operationLog.setResponseData(JSON.toJSONString(keys));
////        // 请求用户ID
////        operationLog.setUserId(UserUtils.getLoginUser().getId());
////        // 请求用户
////        operationLog.setNickname(UserUtils.getLoginUser().getNickname());
////        // 请求IP
////        String ipAddress = IpUtils.getIpAddress(request);
////        operationLog.setIpAddress(ipAddress);
////        operationLog.setIpSource(IpUtils.getIpSource(ipAddress));
////        // 请求URL
////        operationLog.setOptUrl(request.getRequestURI());
////        operationLogDao.insert(operationLog);
//    }
//
//
//    //https://zhuanlan.zhihu.com/p/63001123
//
//    /**
//     * execute表达式
//     * execution(public * *(..))  execution(* set*(..))  execution(* com.xyz.service.AccountService.*(..)) execution(* com.xyz.service..*.*(..))
//     * within表达式
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
