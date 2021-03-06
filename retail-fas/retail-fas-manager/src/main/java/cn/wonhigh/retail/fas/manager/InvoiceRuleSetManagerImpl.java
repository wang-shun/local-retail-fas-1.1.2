package cn.wonhigh.retail.fas.manager;

import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import cn.wonhigh.retail.fas.common.model.InvoiceRuleSet;
import cn.wonhigh.retail.fas.service.InvoiceRuleSetService;

import com.yougou.logistics.base.manager.BaseCrudManagerImpl;
import com.yougou.logistics.base.service.BaseCrudService;

/**
 * 请写出类的用途 
 * @author chen.mj
 * @date  2014-09-22 14:37:37
 * @version 1.0.0
 * @copyright (C) 2013 YouGou Information Technology Co.,Ltd 
 * All Rights Reserved. 
 * 
 * The software for the YouGou technology development, without the 
 * company's written consent, and any other individuals and 
 * organizations shall not be used, Copying, Modify or distribute 
 * the software.
 * 
 */
@Service("invoiceRuleSetManager")
class InvoiceRuleSetManagerImpl extends BaseCrudManagerImpl implements InvoiceRuleSetManager {
    @Resource
    private InvoiceRuleSetService invoiceRuleSetService;

    @Override
    public BaseCrudService init() {
        return invoiceRuleSetService;
    }

	@Override
	public InvoiceRuleSet selectInvoiceNameByShopNo(Map<String, Object> params) {
		return invoiceRuleSetService.selectInvoiceNameByShopNo(params);
	}
}