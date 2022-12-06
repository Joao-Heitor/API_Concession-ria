package br.ufpb.concessionaria.validation;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;
import java.util.Arrays;
import java.util.List;

public class CoresVeiculosValidator implements ConstraintValidator<CoresVeiculos, String> {
    private List<String> coresVeiculos = Arrays.asList(
            "",
            ""
    );

    @Override
    public boolean isValid(String s, ConstraintValidatorContext constraintValidatorContext) {
        for (String i : coresVeiculos)
            if (s.equalsIgnoreCase(i))
                return true;

        return false;
    }
}
