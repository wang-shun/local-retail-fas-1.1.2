package cn.wonhigh.retail.fas.web.controller;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import cn.wonhigh.retail.fas.common.model.Lookup;
import cn.wonhigh.retail.fas.manager.LookupManager;

import com.yougou.logistics.base.web.controller.BaseCrudController;

/**
 * 请写出类的用途 
 * @author wang.xy1
 * @date  2014-08-29 11:31:48
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
@Controller
@RequestMapping("/lookup")
public class LookupController extends BaseCrudController<Lookup> {
    @Resource
    private LookupManager lookupManager;

    @Override
    public CrudInfo init() {
        return new CrudInfo("lookup/",lookupManager);
    }
}