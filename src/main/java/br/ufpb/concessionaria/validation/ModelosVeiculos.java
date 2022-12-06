package br.ufpb.concessionaria.validation;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.*;

@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
@Constraint(validatedBy = ModelosVeiculosValidator.class)
public @interface ModelosVeiculos {
    String message() default "{Modelo de veículo não existe}";
    Class<?>[] groups() default { };
    Class<? extends Payload>[] payload() default { };
}
