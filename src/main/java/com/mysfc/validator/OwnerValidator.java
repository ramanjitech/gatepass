package com.mysfc.validator;

import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

import com.mysfc.command.AddOwnerCommand;
import static com.mysfc.util.ValidatorUtil.*;

public class OwnerValidator implements Validator {

	@Override
	public boolean supports(Class<?> clazz) {
		return clazz.isAssignableFrom(AddOwnerCommand.class);
	}

	@Override
	public void validate(Object command, Errors errors) {
		AddOwnerCommand add = (AddOwnerCommand) command;

		if (isEmpty(add.getOwnerName())) {
			errors.rejectValue("ownerName", "owner.blank");
		}
		if (errors.hasFieldErrors("age") == false) {
			if (add.getAge() <= 0 || add.getAge() > 80) {
				errors.rejectValue("age", "age.invalid");
			}
		}
		if (isEmpty(add.getGender())) {
			errors.rejectValue("gender", "gender.blank");
		}
		if (isEmpty(add.getMobileNo())) {
			errors.rejectValue("mobileNo", "mobileNo.blank");
		} else if (maxAndMin(add.getMobileNo(), 11, 14)) {
			errors.rejectValue("mobileNo", "mobile.invalid");
		}
		if (isEmpty(add.getEmailAddress())) {
			errors.rejectValue("emailAddress", "email.blank");
		}
		if (errors.hasFieldErrors("flatNo") == false) {
			if (add.getFlatNo() <= 0) {
				errors.rejectValue("flatNo", "flat.invalid");
			}
		} 
		if (errors.hasFieldErrors("floor") == false) {
			if (add.getFloor() <= 0) {

				errors.rejectValue("floor", "floor.invalid");
			}
		}
		if (errors.hasFieldErrors("blockNo") == false) {
			if (add.getFloor() <= 0) {

				errors.rejectValue("blockNo", "blockNo.invalid");
			}
		}

	}

}
