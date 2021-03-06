package com.soucod.addutil.commons.lang.builder;

/**
 * Description:  此类描述
 * Author: LuDaShi
 * Date: 2021-01-27-9:50
 * UpdateDate: 2021-01-27-9:50
 * FileName: HashCodeExclude
 * Version: 0.0.0.1
 * Since: 0.0.0.1
 */

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Use this annotation to exclude a field from being used by
 * the various {@code reflectionHashcode} methods defined on
 * {@link HashCodeBuilder}.
 *
 * @since 3.5
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.FIELD)
public @interface HashCodeExclude {
    // empty
}
