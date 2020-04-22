package com.ict.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.ict.service.DAO;
import com.ict.service.VO;

@Controller
public class MyController {
	@Autowired
	private DAO dao;
	
	public void setDao(DAO dao) {
		this.dao = dao;
	}
	
	@RequestMapping("list.do")
	public ModelAndView listCommand() {
		ModelAndView mv = new ModelAndView("list");
		 List<VO> list = dao.getList();
		 
		 mv.addObject("list", list);
		return mv;
	}
	
	@RequestMapping("write.do")
	public ModelAndView writeCommand() {
		return new ModelAndView("write");
	}
	
	@RequestMapping("write_ok.do")
	public ModelAndView writeOKCommand(VO vo) {
		//servlet-context.xml로 리턴 후에 다시 @RequestMapping("list.do") 로 이동
		//return new ModelAndView("redirect:list.do");
		ModelAndView mv = new ModelAndView("write_ok");
		int result = dao.getWrite(vo);
		mv.addObject("result", result);
		return mv;
	}
	
	@RequestMapping("onelist.do")
	public ModelAndView oneListCommand(@RequestParam("idx")String idx, //파라미터 값 받기. VO로 받는것도 가능
			HttpServletRequest request) {	
		
		ModelAndView mv = new ModelAndView("onelist");
		// jdbc의 select문은 하나라도 List<VO> 에 담는다.
		List<VO> list = dao.getOneList(idx);
		
		// 수정과 삭제를 위해서  session에 담자
		//  list.get(0) => list에 하나만 저장 되어 있으므로 
		request.getSession().setAttribute("vo", list.get(0));
		return mv;
	}
	
	@RequestMapping("update.do")
	public ModelAndView updateCommand() {
		return new ModelAndView("update");
	}
	
	@RequestMapping("update_ok.do")
	public ModelAndView updateOKCommand(VO vo) {
		ModelAndView mv = new ModelAndView();
		
		dao.getUpdate(vo);		
		mv.setViewName("redirect:onelist.do?idx="+vo.getIdx());
		return mv;
	}
	
	
	@RequestMapping("delete.do")
	public ModelAndView deleteCommand() {
		return new ModelAndView("delete");
	}
	
	@RequestMapping("delete_ok.do")
	public ModelAndView deleteOKCommand(HttpServletRequest request) {	 //파라미터 값 받기. VO로 받는것도 가능
		ModelAndView mv = new ModelAndView("redirect:list.do");
		VO vo = (VO)request.getSession().getAttribute("vo");
		dao.getDelete(vo.getIdx());
		return mv;
	}
}
