package com.example.testweb.dto.Validator;

import lombok.Data;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

@Data
public class ClassNameValidator implements ConstraintValidator<ClassName, String> {
    private static final String FIRST_NAME = "class:";
    @Override
    public boolean isValid(String s, ConstraintValidatorContext constraintValidatorContext) {
        if (s == null || s.isEmpty()) return false;
        return s.startsWith(FIRST_NAME);
    }
}
