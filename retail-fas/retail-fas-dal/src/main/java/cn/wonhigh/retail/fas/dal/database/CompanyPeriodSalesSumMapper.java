package cn.wonhigh.retail.fas.dal.database;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

import cn.wonhigh.retail.fas.common.model.CompanyPeriodSalesSum;

import com.yougou.logistics.base.common.utils.SimplePage;
import com.yougou.logistics.base.dal.database.BaseCrudMapper;

/**
 * 请写出类的用途 
 * @author wangxy
 * @date  2015-12-15 16:12:30
 * @version 1.0.0
 * @copyright (C) 2013 WonHigh Information Technology Co.,Ltd 
 * All Rights Reserved. 
 * 
 * The software for the WonHigh technology development, without the 
 * company's written consent, and any other individuals and 
 * organizations shall not be used, Copying, Modify or distribute 
 * the software.
 * 
 */
public interface CompanyPeriodSalesSumMapper extends BaseCrudMapper {

	public int deleteCompanySalesSum(@Param("params") Map<String, Object> params);

	public int transferCompanySalesSum(@Param("params") Map<String, Object> params);
	
	int countTransferCompanySalesSum(@Param("params") Map<String, Object> params);

	List<CompanyPeriodSalesSum> getTransferCompanySalesSumByPage(@Param("page") SimplePage page,
			@Param("orderByField") String orderByField, @Param("orderBy") String orderBy,
			@Param("params") Map<String, Object> params);

	int batchInsertPeriodSalesSum(@Param("subList") List<CompanyPeriodSalesSum> backOrderSales);
	
}