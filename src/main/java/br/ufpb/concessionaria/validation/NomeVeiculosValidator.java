package br.ufpb.concessionaria.validation;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;
import java.util.Arrays;
import java.util.List;

public class NomeVeiculosValidator implements ConstraintValidator<NomeVeiculos, String>{
    private List<String> nomeVeiculos = Arrays.asList(
            "",
            ""
    );

    @Override
    public boolean isValid(String s, ConstraintValidatorContext constraintValidatorContext) {
        for (String i : nomeVeiculos)
            if (s.equalsIgnoreCase(i))
                return true;

        return false;
    }
}
