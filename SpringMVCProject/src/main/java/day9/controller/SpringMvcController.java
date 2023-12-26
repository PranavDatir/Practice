package day9.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class SpringMvcController {
	/*
	@RequestMapping("/showIndex")
	public String getIndexPage() {
		return "index";
	}
	*/
	@RequestMapping("/studentEntry")
	public String getStudentEntryPage() {
		return "studentEntry";
	}
	@RequestMapping(value="/acceptStudent", method = RequestMethod.POST)
	public String processStudentInfo(String studentName, int phy, int chem, int maths, Model dataModel) {
		return null;
	}
}
