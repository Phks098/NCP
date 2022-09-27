package com.programrecommendation;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ProfessorMode {
	
	@GetMapping("/professor")
	public String professor() {	
		return "professor_search_student";
	}
}
