package com.example.infos.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.example.infos.dao.AlienRepo;
import com.example.infos.model.Alien;

@Controller
public class HomeController {
	@Autowired
	AlienRepo arepo;
	@RequestMapping("/")
	public String home() {
		return "AlienForm.jsp";
	}
	@RequestMapping("/addAlien")
	public String addAlien(Alien aln) {
		arepo.save(aln);
		return "AlienForm.jsp";
	}
	@RequestMapping("/getAlien")
	public String getAlien() {
		return "getAlien.jsp";
	}
	@RequestMapping("/showAlien")
	public ModelAndView showAlien(int aid) {
		ModelAndView mv = new ModelAndView("showAlien.jsp");
		mv.addObject("aln",arepo.findById(aid));
		return mv;
	}
}
