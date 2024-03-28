package com.lly.anno;

import com.lly.springbootAutoConfig.config.MyImportSelector;
import org.springframework.context.annotation.Import;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@Import(MyImportSelector.class)
public @interface EnableMyConfig {
}
