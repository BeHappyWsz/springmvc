package springmvc.interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

/**
 * 登录拦截器
 * @author wsz
 * @date 2018年2月10日
 */
public class LoginInterceptor implements HandlerInterceptor{

	/**
	 * Object handler:标识被拦截的请求的目标
	 * 返回值：标识是否需要将当前的请求拦截下来
	 *  	false:请求将终止
	 *  	true:请求将继续运行
	 */
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {
		//也可使用拦截器代替乱码过滤器
//		request.setCharacterEncoding("UTF-8");
		System.out.println("preHandle");
		//public org.springframework.web.servlet.ModelAndView springmvc.controller.CourseController.mav(java.lang.String)
		System.out.println(handler);
		
//		if(request.getSession().getAttribute("user") == null) {
//			request.getRequestDispatcher("/login.jsp").forward(request, response);
//		}
		return true;
	}

	/**
	 * modelAndView:可以覆盖请求方法的返回ModelAndView
	 */
	public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler,
			ModelAndView modelAndView) throws Exception {
		System.out.println("postHandle");
	}

	public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex)
			throws Exception {
		System.out.println("afterCompletion");
	}

}
