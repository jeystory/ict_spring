package com.ict.conroller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;
//어노테이션이 아니면 반드시 Controller 인터페이스를 상속받아야 한다.
public class StartController implements Controller{
	// JSP 의 모델 처럼 일처리하고 뷰의 위치값을 리턴한다. => 디스패쳐 서블릿으로 되돌아 간다.
	@Override
	public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("output2");
		
		// 데이터 저장 방법(request, ModelAndView, session)
		mv.addObject("company","ICT 인재 개발원");
		request.setAttribute("subject", "java, android");
		request.getSession().setAttribute("content","spring mvc");
		
		return mv;
	}
	
}
