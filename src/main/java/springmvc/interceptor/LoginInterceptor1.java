package springmvc.interceptor;

import org.springframework.ui.ModelMap;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.context.request.WebRequestInterceptor;
/**
 * 第二种拦截器，但是preHandle无法进行拦截终止，很少使用
 * @author wsz
 * @date 2018年2月10日
 */
public class LoginInterceptor1 implements WebRequestInterceptor{

	public void preHandle(WebRequest paramWebRequest) throws Exception {
		
	}

	public void postHandle(WebRequest paramWebRequest, ModelMap paramModelMap) throws Exception {
		
	}

	public void afterCompletion(WebRequest paramWebRequest, Exception paramException) throws Exception {
		
	}

}
