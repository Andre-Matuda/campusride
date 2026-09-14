package br.com.fiap.campusride.validation;

import jakarta.validation.Constraint;
import jakarta.validation.Payload;
import java.lang.annotation.*;

@Target({ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface VehicleCapacity {
    String message() default "Capacidade de vagas incompatível com o tipo de veículo";
    Class<?>[] groups() default {};
    Class<? extends Payload>[] payload() default {};
}