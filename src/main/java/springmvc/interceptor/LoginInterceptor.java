package springmvc.interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

/**
 * ��¼������
 * @author wsz
 * @date 2018��2��10��
 */
public class LoginInterceptor implements HandlerInterceptor{

	/**
	 * Object handler:��ʶ�����ص������Ŀ��
	 * ����ֵ����ʶ�Ƿ���Ҫ����ǰ��������������
	 *  	false:������ֹ
	 *  	true:���󽫼�������
	 */
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {
		//Ҳ��ʹ���������������������
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
	 * modelAndView:���Ը������󷽷��ķ���ModelAndView
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
