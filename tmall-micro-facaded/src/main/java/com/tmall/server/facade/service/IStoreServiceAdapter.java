/**
*
* @author joker 
* @date 创建时间：2018年8月28日 上午11:12:26
* 
*/
package com.tmall.server.facade.service;

import com.tmall.common.dto.ResultDTO;
import com.tmall.common.dto.StoreDTO;

/**
* 
* @author joker 
* @date 创建时间：2018年8月28日 上午11:12:26
*/
public interface IStoreServiceAdapter
{
	ResultDTO<StoreDTO>findStoreDetail(Long storeId);
	//只有1行代码的话直接给facaded,而不是自行处理
//	ResultDTO<StoreDTO>findStoreByStoreAbbName(String storeAbbName);
}