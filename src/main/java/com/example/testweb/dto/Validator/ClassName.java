package com.example.testweb.dto.Validator;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.*;

@Documented
@Constraint(validatedBy = ClassNameValidator.class)
@Target({ElementType.METHOD, ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
public @interface ClassName {
    String message() default "ClassName must start with class/";
    Class<?>[] groups() default{};
    Class<? extends Payload>[] payload() default {};
}
