#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package}.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.validation.BindException;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.${groupId}.SimpleFormController;  //The type SimpleFormController is deprecated

import ${package}.command.AddOwnerCommand;

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
