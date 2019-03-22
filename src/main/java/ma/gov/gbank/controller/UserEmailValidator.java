package ma.gov.gbank.controller;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class UserEmailValidator implements ConstraintValidator<EmailValidator, String> {

	@Override
    public void initialize(EmailValidator userEmail) {
		
    }

	@Override
	public boolean isValid(String userEmailField, ConstraintValidatorContext cxt) {
		return
				userEmailField != null
				&& userEmailField.matches("\\\\b[A-Z0-9._%+-]+@[A-Z0-9.-]+\\\\.[A-Z]{2,4}\\\\b");
	}

}
