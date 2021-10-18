package edu.lingnan.config;

public @interface ApiResponseProperty {

    String name();

    String description() default "";

    String type();

}
