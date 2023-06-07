package com.example.demo1.Validator.annotation;

import com.example.demo1.Validator.ValidPhongBanValidator;
import jakarta.validation.Constraint;
import jakarta.validation.Payload;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;
import static java.lang.annotation.ElementType.FIELD;
import static java.lang.annotation.ElementType.TYPE;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

@Target({TYPE, FIELD})
@Retention(RUNTIME)
@Constraint(validatedBy = ValidPhongBanValidator.class)
@Documented
public @interface ValidPhongBanId {
    String message() default "Invalid Category ID";
    Class<?>[] groups() default {};
    Class<? extends Payload>[] payload() default {};
}
