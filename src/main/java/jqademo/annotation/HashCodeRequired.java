package jqademo.annotation;

public @interface HashCodeRequired {

    boolean value() default true;

}
