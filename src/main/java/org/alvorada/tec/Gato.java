package org.alvorada.tec;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

// Annotations que fazem parte do criar uma annotation
@Target(ElementType.FIELD) // Só permite que seja usado em classes
@Retention(RetentionPolicy.RUNTIME)
// Annotations usadas p/ fazer o configuration que vai carregar o profile de development
@Autowired
@Qualifier("gato")
public @interface Gato {
}
