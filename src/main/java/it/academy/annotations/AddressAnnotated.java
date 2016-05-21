//создание кастомной аннотации вместо - @Qualifier("id бина")
package it.academy.annotations;

/**
 * Created by Rabotnik on 21.05.2016.
 */

import org.springframework.beans.factory.annotation.Qualifier;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target ({ElementType.FIELD, ElementType.METHOD, ElementType.PARAMETER, ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Qualifier
public @interface AddressAnnotated {
}
