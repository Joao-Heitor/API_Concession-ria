package br.ufpb.concessionaria.validation;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.*;

@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
@Constraint(validatedBy = NomeVeiculosValidator.class)
@Documented
public @interface NomeVeiculos {
    String message() default "{Nome de veículo não existe}";
    Class<?>[] groups() default { };
    Class<? extends Payload>[] payload() default { };
}
