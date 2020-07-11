package com.schoolBookManagement.SpringSecurity.Gateway.zuulfilter;




import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import com.netflix.zuul.exception.ZuulException;

@Component
public class RouterFilter extends ZuulFilter {

	private static Logger log= LoggerFactory.getLogger(RouterFilter.class);
	@Override
	public boolean shouldFilter() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public Object run() throws ZuulException {
		RequestContext ctx= RequestContext.getCurrentContext();
		HttpServletRequest request =ctx.getRequest();
	
		log.info("RouterFilter: "+String.format("%srequst to %s "+request.getMethod(),request.getRequestURL().toString()) );
	    return null;
	}

	@Override
	public String filterType() {
		// TODO Auto-generated method stub
		return "Route";
	}

	@Override
	public int filterOrder() {
		// TODO Auto-generated method stub
		return 1;
	}

}
