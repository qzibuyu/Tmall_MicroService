/**
*
* @author joker 
* @date 创建时间：2018年5月15日 下午8:43:36
* 
*/
package com.rebuildtmall.tmall_batch.amqp;

/**
 * 
 * @author joker
 * @date 创建时间：2018年5月15日 下午8:43:36
 */
public interface AmqpListener
{
	String queueName();

	void process();
}
