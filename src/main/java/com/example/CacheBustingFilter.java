package com.example;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Component;

//@Component
public class CacheBustingFilter implements Filter {

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
    }

    @Override
    public void doFilter(ServletRequest req, ServletResponse resp, FilterChain chain) 
                                              throws IOException, ServletException {

        HttpServletResponse httpResp = (HttpServletResponse) resp;
        httpResp.setHeader("Cache-Control", "no-cache, no-store, must-revalidate");
        httpResp.setHeader("This-Header-Is-Set", "no-cache, no-store, must-revalidate");
        httpResp.setHeader("Expires", "0");

        chain.doFilter(req, resp);
    }

	@Override
	public void destroy() {
		// TODO Auto-generated method stub
		
	}
}
