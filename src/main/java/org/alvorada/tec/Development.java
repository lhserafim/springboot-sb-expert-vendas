package org.alvorada.tec;


import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

// Annotations que fazem parte do criar uma annotation
@Target(ElementType.TYPE) // Só permite que seja usado em classes
@Retention(RetentionPolicy.RUNTIME)
// Annotations usadas p/ fazer o configuration que vai carregar o profile de development
@Configuration
@Profile("development")
public @interface Development {
}
