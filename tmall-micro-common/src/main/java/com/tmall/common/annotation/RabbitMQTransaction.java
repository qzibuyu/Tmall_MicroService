/**
*
* @author joker 
* @date 创建时间：2018年9月9日 上午11:29:35
* 
*/
package com.tmall.common.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;


/**
 * 
 * @author joker
 * @date 创建时间：2018年9月9日 上午11:29:35
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
public @interface RabbitMQTransaction
{
	
	
	int wrapperParamIndex() default 0;
	
	
	
}
