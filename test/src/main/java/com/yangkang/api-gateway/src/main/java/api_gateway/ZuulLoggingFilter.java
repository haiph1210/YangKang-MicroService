//package api_gateway;
//
//import com.netflix.zuul.ZuulFilter;
//import com.netflix.zuul.context.RequestContext;
//import com.netflix.zuul.exception.ZuulException;
//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;
//import org.springframework.stereotype.Component;
//
//import javax.servlet.http.HttpServletRequest;
//
//@Component
//public class ZuulLoggingFilter extends ZuulFilter {
//
//	private Logger logger = LoggerFactory.getLogger(this.getClass());
//
//	@Override
//	public boolean shouldFilter() {
//		// executing filter for every request
//		return true;
//	}
//
//	// log the content of the request
//	@Override
//	public Object run() throws ZuulException {
//
//		// getting the current HTTP request that is to be handle
//		HttpServletRequest request = RequestContext.getCurrentContext().getRequest();
//
//		// prints the detail of the requestin the log
//		logger.info("request -> {} request uri-> {}", request, request.getRequestURI());
//
//		return null;
//	}
//
//	@Override
//	public String filterType() {
//		// intercept all the request before execution
//		return "pre";
//	}
//
//	@Override
//	public int filterOrder() {
//		return 1;
//	}
//}