package org.xworkz.mvc.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.xworkz.mvc.dto.MatrimonyDTO;
import org.xworkz.mvc.service.MatrimonyService;

@Component
@RequestMapping("/")
public class MatrimonyController {

	@Autowired
	private MatrimonyService matrimonyService;

	public MatrimonyController() {
		System.out.println("create \t" + this.getClass().getTypeName());
	}

	//UUID uuid=UUID.randomUUID();

	@RequestMapping("/matrimony.loc")
	public String onRegister(MatrimonyDTO dto, ModelMap map) {
		System.out.println("this is controller");
		System.out.println(dto);
		boolean saved=this.matrimonyService.validateAndSave(dto);
		if(saved)
		{
			System.out.println("saved successfully");
			map.addAttribute("message", "Registration failed again, try again");

		}
		else {
			System.out.println("not saved");
			map.addAttribute("message", "Registration failed, try again");

			//return "Matrimony_registration";
		}
		//System.out.println(matrimonyDTO.getUuid());
		//request.setAttribute("name", matrimonyDTO);
		map.addAttribute("model", dto);
		return "MatrimonySuccess";
	}
}
