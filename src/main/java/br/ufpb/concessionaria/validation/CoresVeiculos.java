package br.ufpb.concessionaria.validation;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.*;

@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
@Constraint(validatedBy = CoresVeiculosValidator.class)
public @interface CoresVeiculos {
    String message() default "{Cor de veículo não está disponível}";
    Class<?>[] groups() default { };
    Class<? extends Payload>[] payload() default { };
}
