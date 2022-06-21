package top.byteinfo.cd.blogx.handler;

import org.springframework.security.access.ConfigAttribute;
import org.springframework.security.web.FilterInvocation;
import org.springframework.security.web.access.intercept.DefaultFilterInvocationSecurityMetadataSource;
import org.springframework.security.web.access.intercept.FilterInvocationSecurityMetadataSource;
import org.springframework.stereotype.Component;
import org.springframework.util.AntPathMatcher;

import java.util.Collection;

/**
 *
 * @see DefaultFilterInvocationSecurityMetadataSource
 */
@Component
public class FilterInvocationSecurityMetadataSourceImpl implements FilterInvocationSecurityMetadataSource {

    /**
     * 资源角色列表
     */


    /**
     * 加载资源角色信息
     */


    /**
     *  {@link DefaultFilterInvocationSecurityMetadataSource#getAttributes(Object)}
     *
     * @param object
     * @return
     * @throws IllegalArgumentException
     */
    @Override
    public Collection<ConfigAttribute> getAttributes(Object object) throws IllegalArgumentException {
        // 修改接口角色关系后重新加载

        /**
         *
         *
         */
        FilterInvocation fi = (FilterInvocation) object;
        // 获取用户请求方式
//        String method = fi.getRequest().getMethod();
//        // 获取用户请求Url
//        String url = fi.getRequest().getRequestURI();
        AntPathMatcher antPathMatcher = new AntPathMatcher();

        return null;
    }

    @Override
    public Collection<ConfigAttribute> getAllConfigAttributes() {
        return null;
    }

    @Override
    public boolean supports(Class<?> aClass) {
        return FilterInvocation.class.isAssignableFrom(aClass);
    }

}
