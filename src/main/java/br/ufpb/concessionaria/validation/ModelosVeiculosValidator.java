package br.ufpb.concessionaria.validation;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;
import java.util.Arrays;
import java.util.List;

public class ModelosVeiculosValidator implements ConstraintValidator<ModelosVeiculos, String> {
    private List<String> modelosVeiculos = Arrays.asList(
            "",
            ""
    );

    @Override
    public boolean isValid(String s, ConstraintValidatorContext constraintValidatorContext) {
        for (String i : modelosVeiculos)
            if (s.equalsIgnoreCase(i))
                return true;

        return false;
    }
}
