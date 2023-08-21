package com.javainuse.interceptor.config;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.javainuse.interceptor.annotations.Loggable;
import org.slf4j.Logger;
import org.springframework.stereotype.Component;
import org.springframework.web.method.HandlerMethod;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import java.lang.reflect.Method;

@Component
public class LoggerInterceptor implements HandlerInterceptor {

	Logger logger_Interceptor = org.slf4j.LoggerFactory.getLogger(this.getClass());

	@Override
	public void afterCompletion(HttpServletRequest request,
								HttpServletResponse response, Object object, Exception arg3)
			throws Exception {
		logger_Interceptor.info("logger_Interceptor: Request is complete");
	}

	@Override
	public void postHandle(HttpServletRequest request,
						   HttpServletResponse response, Object object, ModelAndView model)
			throws Exception {
		logger_Interceptor.info("logger_Interceptor: Handler execution is complete");
	}

	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
		if (handler instanceof HandlerMethod) {
			HandlerMethod handlerMethod = (HandlerMethod) handler;
			Method method = handlerMethod.getMethod();
			if (method.isAnnotationPresent(Loggable.class)) {
				String className = handlerMethod.getBeanType().getSimpleName();
				String methodName = method.getName();
				logger_Interceptor.info("logger_Interceptor: Before Handler execution - Class: {}, Method: {}", className, methodName);
			}
		}
		return true;
	}
}