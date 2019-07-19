package be.vdab.advancedtaken.constraints;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class OndernemingsNrValidator implements ConstraintValidator<OndernemingsNr, Long> {
    @Override
    public void initialize(OndernemingsNr postcode){}
    @Override
    public boolean isValid(Long ondernemingsNr, ConstraintValidatorContext context){
        if(ondernemingsNr == null){
            return true;
        }
        long laatste2 = ondernemingsNr % 100L;
        long resterende = ondernemingsNr / 100;
        return laatste2 == 97 - resterende % 97;
    }
}
