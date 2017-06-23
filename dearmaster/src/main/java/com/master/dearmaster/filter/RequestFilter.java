package com.master.dearmaster.filter;

import com.master.dearmaster.service.UserService;
import com.master.dearmaster.util.LoggerFactory;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.util.Assert;

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static com.master.dearmaster.Constants.REGEX_USERNAME;
import static com.master.dearmaster.Constants.SESSION_CURRENT_ACCOUNT;

@Component
public class RequestFilter implements Filter {

    private static final Logger logger = LoggerFactory.getLogger();

    @Autowired
    private UserService userService;

    public void destroy() {
    }

    public void doFilter(ServletRequest req, ServletResponse resp, FilterChain chain) throws ServletException, IOException {
        HttpServletRequest httpServletRequest = (HttpServletRequest) req;
        if(logger.isDebugEnabled()) {
            logger.debug(httpServletRequest.getContextPath());
            logger.debug(httpServletRequest.getPathInfo());
            logger.debug(httpServletRequest.getRequestURI());
            logger.debug(httpServletRequest.getRequestURL());
        }
        String ctx = httpServletRequest.getContextPath();
        String uri = httpServletRequest.getRequestURI();
        String path = uri.substring(uri.indexOf(ctx) + ctx.length() + 1);
        Assert.notNull(userService);
        if(Pattern.compile(REGEX_USERNAME).matcher(path).find()) {
            httpServletRequest.getSession().setAttribute(SESSION_CURRENT_ACCOUNT, path);
        }
        chain.doFilter(req, resp);
    }

    public void init(FilterConfig config) throws ServletException {
        logger.debug("init RequestFilter");
    }

    public static void main(String[] args) {
        String regex = "^\\w{3,5}$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher("sd2s");
        if(matcher.find()) {
            logger.debug(matcher.group());
        }
    }

}
