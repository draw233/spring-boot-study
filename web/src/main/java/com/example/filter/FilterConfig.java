package com.example.filter;

import lombok.extern.slf4j.Slf4j;
import org.slf4j.MDC;
import org.springframework.stereotype.Component;

import javax.servlet.*;
import java.io.IOException;

/**
 * @author mirau
 */
@Slf4j
@Component
public class FilterConfig implements Filter {
    private static final String CORRELATION_ID = "trace_id";

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
        MDC.put(CORRELATION_ID, String.valueOf(System.currentTimeMillis()));
        chain.doFilter(request, response);
    }
}