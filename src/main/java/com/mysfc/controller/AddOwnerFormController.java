package com.mysfc.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.validation.BindException;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.SimpleFormController;  //The type SimpleFormController is deprecated

import com.mysfc.command.AddOwnerCommand;

public class AddOwnerFormController extends SimpleFormController {

	@Override
	protected ModelAndView onSubmit(HttpServletRequest request, HttpServletResponse response, Object command,
			BindException errors) throws Exception {
		ModelAndView mav=new ModelAndView();
		AddOwnerCommand addOwner=(AddOwnerCommand) command;
		
		
		mav.addObject("ownerName",addOwner.getOwnerName());
		mav.setViewName("owner-info");
		return mav;
	}

	
	
}
