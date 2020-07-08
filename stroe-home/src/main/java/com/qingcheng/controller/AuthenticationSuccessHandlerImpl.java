//package com.qingcheng.controller;
//
//import java.io.IOException;
//import java.util.Date;
//
//import javax.servlet.ServletException;
//import javax.servlet.http.HttpServletRequest;
//import javax.servlet.http.HttpServletResponse;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.security.core.Authentication;
//import org.springframework.security.web.authentication.AuthenticationSuccessHandler;
//
//import com.qingcheng.pojo.LoginLog;
//import com.qingcheng.service.LoginLogService;
//import com.qingcheng.utlis.WebUtil;
//
//public class AuthenticationSuccessHandlerImpl implements AuthenticationSuccessHandler {
//
//	@Autowired
//	private LoginLogService loginLogService;
//
//	@Override
//	public void onAuthenticationSuccess(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse,
//			Authentication authentication) throws IOException, ServletException {
//		// 登录后会调用
//		System.out.println("登录成功了，我要在这里记录日志");
//
//		String loginName = authentication.getName();
//		String ip = httpServletRequest.getRemoteAddr();
//
//		LoginLog loginLog = new LoginLog();
//		loginLog.setLoginName(loginName);// 当前登录管理员
//		loginLog.setLoginTime(new Date());// 当前登录时间
//		loginLog.setIp(ip);// 远程客户端ip
//		loginLog.setLocation(WebUtil.getCityByIP(ip)); // 地区
//		String agent = httpServletRequest.getHeader("user-agent");
//		System.out.println("agent:" + agent);
//		loginLog.setBrowserName(WebUtil.getBrowserName(agent));// 浏览器名称
//
//		loginLogService.add(loginLog);
//		httpServletRequest.getRequestDispatcher("/main.html").forward(httpServletRequest, httpServletResponse);
//
//	}
//}
