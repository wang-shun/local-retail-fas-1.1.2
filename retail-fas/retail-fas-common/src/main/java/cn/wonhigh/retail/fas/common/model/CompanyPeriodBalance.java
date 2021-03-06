package cn.wonhigh.retail.fas.common.model;

import java.math.BigDecimal;

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
public class CompanyPeriodBalance extends FasBaseModel {
	
    /**
	 * 
	 */
	private static final long serialVersionUID = 62176358444407568L;

    /**
     * 公司编码
     */
    private String companyNo;

    /**
     * 公司编码
     */
    private String companyName;
    
    /**
     * 年份
     */
    private String year;

    /**
     * 月份
     */
    private String month;

    /**
     * 商品编码
     */
    private String itemNo;

    /**
     * 商品编码
     */
    private String itemCode;

    /**
     * 商品名称
     */
    private String itemName;

    /**
     * 品牌编码
     */
    private String brandNo;

    /**
   	 * 品牌名称
   	 */
   	private String brandName;
   	
   	/**
   	 * 品牌部编号
   	 */
   	private String brandUnitNo;
   	
   	/**
   	 * 品牌部名称
   	 */
   	private String brandUnitName;
   	
   	/**
   	 * 大类编码
   	 */
   	private String categoryNo;
   	
   	/**
   	 * 大类名称
   	 */
   	private String categoryName;

   	/**
	 * 一级大类编码
	 */
	private String firstLevelCategoryNo;
	
	/**
	 * 一级大类名称
	 */
	private String firstLevelCategoryName;
	
	/**
	 * 二级大类编码
	 */
	private String secondLevelCategoryNo;
	
	/**
	 * 二级大类名称
	 */
	private String secondLevelCategoryName;
	
    /**
     * 期初数量
     */
    private Integer openingQty;

    /**
     * 期初余额
     */
    private BigDecimal openingBalance;

    /**
     * 采购入库数量
     */
    private Integer purchaseInQty;

    /**
     * 采购入库金额
     */
    private BigDecimal purchaseInAmount;

    /**
     * 跨区调入数量
     */
    private Integer outerTransferInQty;

    /**
     * 跨区调入金额
     */
    private BigDecimal outerTransferInAmount;

    /**
     * 采购退厂数量
     */
    private Integer purchaseReturnQty;

    /**
     * 采购退厂金额
     */
    private BigDecimal purchaseReturnAmount;

    /**
     * 盘盈数量
     */
    private Integer invSurplusQty;

    /**
     * 盘盈金额
     */
    private BigDecimal invSurplusAmount;

    /**
     * 其他入库数量
     */
    private Integer othersInQty;

    /**
     * 其他入库金额
     */
    private BigDecimal othersInAmount;

    /**
     * 外入在途数量
     */
    private Integer outerWayQty;

    /**
     * 外入在途金额
     */
    private BigDecimal outerWayAmount;

    /**
     * 外在途差异数量
     */
    private Integer outerDiffQty;

    /**
     * 外在途差异金额
     */
    private BigDecimal outerDiffAmount;

    /**
     * 差异调整金额
     */
    private BigDecimal costAdjustmentAmount;

    /**
     * 销售出库数量
     */
    private Integer salesOutQty;

    /**
     * 销售出库金额
     */
    private BigDecimal salesOutAmount;

    /**
     * 跨区调出数量
     */
    private Integer outerTransferOutQty;

    /**
     * 跨区跳出金额
     */
    private BigDecimal outerTransferOutAmount;

    /**
     * 盘亏数量
     */
    private Integer inventoryLossQty;

    /**
     * 盘亏金额
     */
    private BigDecimal inventoryLossAmount;

    /**
     * 其他出库数量
     */
    private Integer othersOutQty;

    /**
     * 其他出库金额
     */
    private BigDecimal othersOutAmount;

    /**
     * 期间净发生数量
     */
    private Integer duringNetQty;

    /**
     * 期间净发生金额
     */
    private BigDecimal duringNetAmount;

    /**
     * 期末数量
     */
    private Integer closingQty;

    /**
     * 期末余额
     */
    private BigDecimal closingBalance;

    /**
     * 单位成本
     */
    private BigDecimal unitCost;

    /**
     * 地区成本价
     */
    private BigDecimal regionCost;

    /**
     * 总部成本价
     */
    private BigDecimal headquarterCost;

    /**
     * 分库字段
     */
    private String shardingFlag;

  //前期欠客
    private Integer preSumOweQty;
    
    private Integer preAccountingQty;
    
    //期初财务存
    private BigDecimal preSumOweAmount;
    
    private BigDecimal preAccountingAmount;
    
    //本期欠客
    private Integer currSumOweQty;
    
    private Integer currAccountingQty;
    
    //财务存
    private BigDecimal currSumOweAmount;
    
    private BigDecimal currAccountingAmount;
    
    private BigDecimal weightedDifference;
    
    private BigDecimal closingBalanceReference;
    
    private Integer salesSumQty;
    private BigDecimal salesSumAmount;
    
    /**
	 * 商品年份
	 */
	private String years;
	
	/**
	 * 商品年份
	 */
	private String yearsName;
	
	/**
	 * 季节
	 */
	private String sellSeason;
	
	/**
	 * 季节
	 */
	private String seasonName;
	
	/**
	 * 性别
	 */
	private String gender;
	
	/**
	 * 性别
	 */
	private String orderfrom;
	
	/**
     * 期间盘差数量
     */ 
    private Integer duringNetInventoryQty;
    
    /**
     * 期间盘差金额
     */
    private BigDecimal duringNetInventoryAmount;
    
    /**
     * 对账差异数量
     */
    private Integer balanceDiff;
    
    /**
     * 牌价
     */
    private BigDecimal tagPrice;
    
    public Integer getDuringNetInventoryQty() {
		return duringNetInventoryQty;
	}

	public void setDuringNetInventoryQty(Integer duringNetInventoryQty) {
		this.duringNetInventoryQty = duringNetInventoryQty;
	}

	public BigDecimal getDuringNetInventoryAmount() {
		return duringNetInventoryAmount;
	}

	public void setDuringNetInventoryAmount(BigDecimal duringNetInventoryAmount) {
		this.duringNetInventoryAmount = duringNetInventoryAmount;
	}

	/**
     * 
     * {@linkplain #companyNo}
     *
     * @return the value of company_period_balance.company_no
     */
    public String getCompanyNo() {
        return companyNo;
    }

    /**
     * 
     * {@linkplain #companyNo}
     * @param companyNo the value for company_period_balance.company_no
     */
    public void setCompanyNo(String companyNo) {
        this.companyNo = companyNo;
    }

    /**
     * 
     * {@linkplain #year}
     *
     * @return the value of company_period_balance.year
     */
    public String getYear() {
        return year;
    }

    /**
     * 
     * {@linkplain #year}
     * @param year the value for company_period_balance.year
     */
    public void setYear(String year) {
        this.year = year;
    }

    /**
     * 
     * {@linkplain #month}
     *
     * @return the value of company_period_balance.month
     */
    public String getMonth() {
        return month;
    }

    /**
     * 
     * {@linkplain #month}
     * @param month the value for company_period_balance.month
     */
    public void setMonth(String month) {
        this.month = month;
    }

    /**
     * 
     * {@linkplain #itemNo}
     *
     * @return the value of company_period_balance.item_no
     */
    public String getItemNo() {
        return itemNo;
    }

    /**
     * 
     * {@linkplain #itemNo}
     * @param itemNo the value for company_period_balance.item_no
     */
    public void setItemNo(String itemNo) {
        this.itemNo = itemNo;
    }

    /**
     * 
     * {@linkplain #itemCode}
     *
     * @return the value of company_period_balance.item_code
     */
    public String getItemCode() {
        return itemCode;
    }

    /**
     * 
     * {@linkplain #itemCode}
     * @param itemCode the value for company_period_balance.item_code
     */
    public void setItemCode(String itemCode) {
        this.itemCode = itemCode;
    }

    /**
     * 
     * {@linkplain #itemName}
     *
     * @return the value of company_period_balance.item_name
     */
    public String getItemName() {
        return itemName;
    }

    /**
     * 
     * {@linkplain #itemName}
     * @param itemName the value for company_period_balance.item_name
     */
    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    /**
     * 
     * {@linkplain #brandNo}
     *
     * @return the value of company_period_balance.brand_no
     */
    public String getBrandNo() {
        return brandNo;
    }

    /**
     * 
     * {@linkplain #brandNo}
     * @param brandNo the value for company_period_balance.brand_no
     */
    public void setBrandNo(String brandNo) {
        this.brandNo = brandNo;
    }

    /**
     * 
     * {@linkplain #categoryNo}
     *
     * @return the value of company_period_balance.category_no
     */
    public String getCategoryNo() {
        return categoryNo;
    }

    /**
     * 
     * {@linkplain #categoryNo}
     * @param categoryNo the value for company_period_balance.category_no
     */
    public void setCategoryNo(String categoryNo) {
        this.categoryNo = categoryNo;
    }

    /**
     * 
     * {@linkplain #openingQty}
     *
     * @return the value of company_period_balance.opening_qty
     */
    public Integer getOpeningQty() {
        return openingQty;
    }

    /**
     * 
     * {@linkplain #openingQty}
     * @param openingQty the value for company_period_balance.opening_qty
     */
    public void setOpeningQty(Integer openingQty) {
        this.openingQty = openingQty;
    }

    /**
     * 
     * {@linkplain #openingBalance}
     *
     * @return the value of company_period_balance.opening_balance
     */
    public BigDecimal getOpeningBalance() {
        return openingBalance;
    }

    /**
     * 
     * {@linkplain #openingBalance}
     * @param openingBalance the value for company_period_balance.opening_balance
     */
    public void setOpeningBalance(BigDecimal openingBalance) {
        this.openingBalance = openingBalance;
    }

    /**
     * 
     * {@linkplain #purchaseInQty}
     *
     * @return the value of company_period_balance.purchase_in_qty
     */
    public Integer getPurchaseInQty() {
        return purchaseInQty;
    }

    /**
     * 
     * {@linkplain #purchaseInQty}
     * @param purchaseInQty the value for company_period_balance.purchase_in_qty
     */
    public void setPurchaseInQty(Integer purchaseInQty) {
        this.purchaseInQty = purchaseInQty;
    }

    /**
     * 
     * {@linkplain #purchaseInAmount}
     *
     * @return the value of company_period_balance.purchase_in_amount
     */
    public BigDecimal getPurchaseInAmount() {
        return purchaseInAmount;
    }

    /**
     * 
     * {@linkplain #purchaseInAmount}
     * @param purchaseInAmount the value for company_period_balance.purchase_in_amount
     */
    public void setPurchaseInAmount(BigDecimal purchaseInAmount) {
        this.purchaseInAmount = purchaseInAmount;
    }

    /**
     * 
     * {@linkplain #outerTransferInQty}
     *
     * @return the value of company_period_balance.outer_transfer_in_qty
     */
    public Integer getOuterTransferInQty() {
        return outerTransferInQty;
    }

    /**
     * 
     * {@linkplain #outerTransferInQty}
     * @param outerTransferInQty the value for company_period_balance.outer_transfer_in_qty
     */
    public void setOuterTransferInQty(Integer outerTransferInQty) {
        this.outerTransferInQty = outerTransferInQty;
    }

    /**
     * 
     * {@linkplain #outerTransferInAmount}
     *
     * @return the value of company_period_balance.outer_transfer_in_amount
     */
    public BigDecimal getOuterTransferInAmount() {
        return outerTransferInAmount;
    }

    /**
     * 
     * {@linkplain #outerTransferInAmount}
     * @param outerTransferInAmount the value for company_period_balance.outer_transfer_in_amount
     */
    public void setOuterTransferInAmount(BigDecimal outerTransferInAmount) {
        this.outerTransferInAmount = outerTransferInAmount;
    }

    /**
     * 
     * {@linkplain #purchaseReturnQty}
     *
     * @return the value of company_period_balance.purchase_return_qty
     */
    public Integer getPurchaseReturnQty() {
        return purchaseReturnQty;
    }

    /**
     * 
     * {@linkplain #purchaseReturnQty}
     * @param purchaseReturnQty the value for company_period_balance.purchase_return_qty
     */
    public void setPurchaseReturnQty(Integer purchaseReturnQty) {
        this.purchaseReturnQty = purchaseReturnQty;
    }

    /**
     * 
     * {@linkplain #purchaseReturnAmount}
     *
     * @return the value of company_period_balance.purchase_return_amount
     */
    public BigDecimal getPurchaseReturnAmount() {
        return purchaseReturnAmount;
    }

    /**
     * 
     * {@linkplain #purchaseReturnAmount}
     * @param purchaseReturnAmount the value for company_period_balance.purchase_return_amount
     */
    public void setPurchaseReturnAmount(BigDecimal purchaseReturnAmount) {
        this.purchaseReturnAmount = purchaseReturnAmount;
    }

    /**
     * 
     * {@linkplain #invSurplusQty}
     *
     * @return the value of company_period_balance.inv_surplus_qty
     */
    public Integer getInvSurplusQty() {
        return invSurplusQty;
    }

    /**
     * 
     * {@linkplain #invSurplusQty}
     * @param invSurplusQty the value for company_period_balance.inv_surplus_qty
     */
    public void setInvSurplusQty(Integer invSurplusQty) {
        this.invSurplusQty = invSurplusQty;
    }

    /**
     * 
     * {@linkplain #invSurplusAmount}
     *
     * @return the value of company_period_balance.inv_surplus_amount
     */
    public BigDecimal getInvSurplusAmount() {
        return invSurplusAmount;
    }

    /**
     * 
     * {@linkplain #invSurplusAmount}
     * @param invSurplusAmount the value for company_period_balance.inv_surplus_amount
     */
    public void setInvSurplusAmount(BigDecimal invSurplusAmount) {
        this.invSurplusAmount = invSurplusAmount;
    }

    /**
     * 
     * {@linkplain #othersInQty}
     *
     * @return the value of company_period_balance.others_in_qty
     */
    public Integer getOthersInQty() {
        return othersInQty;
    }

    /**
     * 
     * {@linkplain #othersInQty}
     * @param othersInQty the value for company_period_balance.others_in_qty
     */
    public void setOthersInQty(Integer othersInQty) {
        this.othersInQty = othersInQty;
    }

    /**
     * 
     * {@linkplain #othersInAmount}
     *
     * @return the value of company_period_balance.others_in_amount
     */
    public BigDecimal getOthersInAmount() {
        return othersInAmount;
    }

    /**
     * 
     * {@linkplain #othersInAmount}
     * @param othersInAmount the value for company_period_balance.others_in_amount
     */
    public void setOthersInAmount(BigDecimal othersInAmount) {
        this.othersInAmount = othersInAmount;
    }

    /**
     * 
     * {@linkplain #outerWayQty}
     *
     * @return the value of company_period_balance.outer_way_qty
     */
    public Integer getOuterWayQty() {
        return outerWayQty;
    }

    /**
     * 
     * {@linkplain #outerWayQty}
     * @param outerWayQty the value for company_period_balance.outer_way_qty
     */
    public void setOuterWayQty(Integer outerWayQty) {
        this.outerWayQty = outerWayQty;
    }

    /**
     * 
     * {@linkplain #outerWayAmount}
     *
     * @return the value of company_period_balance.outer_way_amount
     */
    public BigDecimal getOuterWayAmount() {
        return outerWayAmount;
    }

    /**
     * 
     * {@linkplain #outerWayAmount}
     * @param outerWayAmount the value for company_period_balance.outer_way_amount
     */
    public void setOuterWayAmount(BigDecimal outerWayAmount) {
        this.outerWayAmount = outerWayAmount;
    }

    /**
     * 
     * {@linkplain #outerDiffQty}
     *
     * @return the value of company_period_balance.outer_diff_qty
     */
    public Integer getOuterDiffQty() {
        return outerDiffQty;
    }

    /**
     * 
     * {@linkplain #outerDiffQty}
     * @param outerDiffQty the value for company_period_balance.outer_diff_qty
     */
    public void setOuterDiffQty(Integer outerDiffQty) {
        this.outerDiffQty = outerDiffQty;
    }

    /**
     * 
     * {@linkplain #outerDiffAmount}
     *
     * @return the value of company_period_balance.outer_diff_amount
     */
    public BigDecimal getOuterDiffAmount() {
        return outerDiffAmount;
    }

    /**
     * 
     * {@linkplain #outerDiffAmount}
     * @param outerDiffAmount the value for company_period_balance.outer_diff_amount
     */
    public void setOuterDiffAmount(BigDecimal outerDiffAmount) {
        this.outerDiffAmount = outerDiffAmount;
    }

    /**
     * 
     * {@linkplain #costAdjustmentAmount}
     *
     * @return the value of company_period_balance.cost_adjustment_amount
     */
    public BigDecimal getCostAdjustmentAmount() {
        return costAdjustmentAmount;
    }

    /**
     * 
     * {@linkplain #costAdjustmentAmount}
     * @param costAdjustmentAmount the value for company_period_balance.cost_adjustment_amount
     */
    public void setCostAdjustmentAmount(BigDecimal costAdjustmentAmount) {
        this.costAdjustmentAmount = costAdjustmentAmount;
    }

    /**
     * 
     * {@linkplain #salesOutQty}
     *
     * @return the value of company_period_balance.sales_out_qty
     */
    public Integer getSalesOutQty() {
        return salesOutQty;
    }

    /**
     * 
     * {@linkplain #salesOutQty}
     * @param salesOutQty the value for company_period_balance.sales_out_qty
     */
    public void setSalesOutQty(Integer salesOutQty) {
        this.salesOutQty = salesOutQty;
    }

    /**
     * 
     * {@linkplain #salesOutAmount}
     *
     * @return the value of company_period_balance.sales_out_amount
     */
    public BigDecimal getSalesOutAmount() {
        return salesOutAmount;
    }

    /**
     * 
     * {@linkplain #salesOutAmount}
     * @param salesOutAmount the value for company_period_balance.sales_out_amount
     */
    public void setSalesOutAmount(BigDecimal salesOutAmount) {
        this.salesOutAmount = salesOutAmount;
    }

    /**
     * 
     * {@linkplain #outerTransferOutQty}
     *
     * @return the value of company_period_balance.outer_transfer_out_qty
     */
    public Integer getOuterTransferOutQty() {
        return outerTransferOutQty;
    }

    /**
     * 
     * {@linkplain #outerTransferOutQty}
     * @param outerTransferOutQty the value for company_period_balance.outer_transfer_out_qty
     */
    public void setOuterTransferOutQty(Integer outerTransferOutQty) {
        this.outerTransferOutQty = outerTransferOutQty;
    }

    /**
     * 
     * {@linkplain #outerTransferOutAmount}
     *
     * @return the value of company_period_balance.outer_transfer_out_amount
     */
    public BigDecimal getOuterTransferOutAmount() {
        return outerTransferOutAmount;
    }

    /**
     * 
     * {@linkplain #outerTransferOutAmount}
     * @param outerTransferOutAmount the value for company_period_balance.outer_transfer_out_amount
     */
    public void setOuterTransferOutAmount(BigDecimal outerTransferOutAmount) {
        this.outerTransferOutAmount = outerTransferOutAmount;
    }

    /**
     * 
     * {@linkplain #inventoryLossQty}
     *
     * @return the value of company_period_balance.inventory_loss_qty
     */
    public Integer getInventoryLossQty() {
        return inventoryLossQty;
    }

    /**
     * 
     * {@linkplain #inventoryLossQty}
     * @param inventoryLossQty the value for company_period_balance.inventory_loss_qty
     */
    public void setInventoryLossQty(Integer inventoryLossQty) {
        this.inventoryLossQty = inventoryLossQty;
    }

    /**
     * 
     * {@linkplain #inventoryLossAmount}
     *
     * @return the value of company_period_balance.inventory_loss_amount
     */
    public BigDecimal getInventoryLossAmount() {
        return inventoryLossAmount;
    }

    /**
     * 
     * {@linkplain #inventoryLossAmount}
     * @param inventoryLossAmount the value for company_period_balance.inventory_loss_amount
     */
    public void setInventoryLossAmount(BigDecimal inventoryLossAmount) {
        this.inventoryLossAmount = inventoryLossAmount;
    }

    /**
     * 
     * {@linkplain #othersOutQty}
     *
     * @return the value of company_period_balance.others_out_qty
     */
    public Integer getOthersOutQty() {
        return othersOutQty;
    }

    /**
     * 
     * {@linkplain #othersOutQty}
     * @param othersOutQty the value for company_period_balance.others_out_qty
     */
    public void setOthersOutQty(Integer othersOutQty) {
        this.othersOutQty = othersOutQty;
    }

    /**
     * 
     * {@linkplain #othersOutAmount}
     *
     * @return the value of company_period_balance.others_out_amount
     */
    public BigDecimal getOthersOutAmount() {
        return othersOutAmount;
    }

    /**
     * 
     * {@linkplain #othersOutAmount}
     * @param othersOutAmount the value for company_period_balance.others_out_amount
     */
    public void setOthersOutAmount(BigDecimal othersOutAmount) {
        this.othersOutAmount = othersOutAmount;
    }

    /**
     * 
     * {@linkplain #duringNetQty}
     *
     * @return the value of company_period_balance.during_net_qty
     */
    public Integer getDuringNetQty() {
        return duringNetQty;
    }

    /**
     * 
     * {@linkplain #duringNetQty}
     * @param duringNetQty the value for company_period_balance.during_net_qty
     */
    public void setDuringNetQty(Integer duringNetQty) {
        this.duringNetQty = duringNetQty;
    }

    /**
     * 
     * {@linkplain #duringNetAmount}
     *
     * @return the value of company_period_balance.during_net_amount
     */
    public BigDecimal getDuringNetAmount() {
        return duringNetAmount;
    }

    /**
     * 
     * {@linkplain #duringNetAmount}
     * @param duringNetAmount the value for company_period_balance.during_net_amount
     */
    public void setDuringNetAmount(BigDecimal duringNetAmount) {
        this.duringNetAmount = duringNetAmount;
    }

    /**
     * 
     * {@linkplain #closingQty}
     *
     * @return the value of company_period_balance.closing_qty
     */
    public Integer getClosingQty() {
        return closingQty;
    }

    /**
     * 
     * {@linkplain #closingQty}
     * @param closingQty the value for company_period_balance.closing_qty
     */
    public void setClosingQty(Integer closingQty) {
        this.closingQty = closingQty;
    }

    /**
     * 
     * {@linkplain #closingBalance}
     *
     * @return the value of company_period_balance.closing_balance
     */
    public BigDecimal getClosingBalance() {
        return closingBalance;
    }

    /**
     * 
     * {@linkplain #closingBalance}
     * @param closingBalance the value for company_period_balance.closing_balance
     */
    public void setClosingBalance(BigDecimal closingBalance) {
        this.closingBalance = closingBalance;
    }

    /**
     * 
     * {@linkplain #unitCost}
     *
     * @return the value of company_period_balance.unit_cost
     */
    public BigDecimal getUnitCost() {
        return unitCost;
    }

    /**
     * 
     * {@linkplain #unitCost}
     * @param unitCost the value for company_period_balance.unit_cost
     */
    public void setUnitCost(BigDecimal unitCost) {
        this.unitCost = unitCost;
    }

    /**
     * 
     * {@linkplain #regionCost}
     *
     * @return the value of company_period_balance.region_cost
     */
    public BigDecimal getRegionCost() {
        return regionCost;
    }

    /**
     * 
     * {@linkplain #regionCost}
     * @param regionCost the value for company_period_balance.region_cost
     */
    public void setRegionCost(BigDecimal regionCost) {
        this.regionCost = regionCost;
    }

    /**
     * 
     * {@linkplain #headquarterCost}
     *
     * @return the value of company_period_balance.headquarter_cost
     */
    public BigDecimal getHeadquarterCost() {
        return headquarterCost;
    }

    /**
     * 
     * {@linkplain #headquarterCost}
     * @param headquarterCost the value for company_period_balance.headquarter_cost
     */
    public void setHeadquarterCost(BigDecimal headquarterCost) {
        this.headquarterCost = headquarterCost;
    }

    /**
     * 
     * {@linkplain #shardingFlag}
     *
     * @return the value of company_period_balance.sharding_flag
     */
    public String getShardingFlag() {
        return shardingFlag;
    }

    /**
     * 
     * {@linkplain #shardingFlag}
     * @param shardingFlag the value for company_period_balance.sharding_flag
     */
    public void setShardingFlag(String shardingFlag) {
        this.shardingFlag = shardingFlag;
    }

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public String getBrandName() {
		return brandName;
	}

	public void setBrandName(String brandName) {
		this.brandName = brandName;
	}

	public String getCategoryName() {
		return categoryName;
	}

	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}

	public String getFirstLevelCategoryNo() {
		return firstLevelCategoryNo;
	}

	public void setFirstLevelCategoryNo(String firstLevelCategoryNo) {
		this.firstLevelCategoryNo = firstLevelCategoryNo;
	}

	public String getFirstLevelCategoryName() {
		return firstLevelCategoryName;
	}

	public void setFirstLevelCategoryName(String firstLevelCategoryName) {
		this.firstLevelCategoryName = firstLevelCategoryName;
	}

	public String getSecondLevelCategoryNo() {
		return secondLevelCategoryNo;
	}

	public void setSecondLevelCategoryNo(String secondLevelCategoryNo) {
		this.secondLevelCategoryNo = secondLevelCategoryNo;
	}

	public String getSecondLevelCategoryName() {
		return secondLevelCategoryName;
	}

	public void setSecondLevelCategoryName(String secondLevelCategoryName) {
		this.secondLevelCategoryName = secondLevelCategoryName;
	}

	public Integer getPreSumOweQty() {
		return preSumOweQty;
	}

	public void setPreSumOweQty(Integer preSumOweQty) {
		this.preSumOweQty = preSumOweQty;
	}

	public Integer getPreAccountingQty() {
		return preAccountingQty;
	}

	public void setPreAccountingQty(Integer preAccountingQty) {
		this.preAccountingQty = preAccountingQty;
	}

	public BigDecimal getPreSumOweAmount() {
		return preSumOweAmount;
	}

	public void setPreSumOweAmount(BigDecimal preSumOweAmount) {
		this.preSumOweAmount = preSumOweAmount;
	}

	public BigDecimal getPreAccountingAmount() {
		return preAccountingAmount;
	}

	public void setPreAccountingAmount(BigDecimal preAccountingAmount) {
		this.preAccountingAmount = preAccountingAmount;
	}

	public Integer getCurrSumOweQty() {
		return currSumOweQty;
	}

	public void setCurrSumOweQty(Integer currSumOweQty) {
		this.currSumOweQty = currSumOweQty;
	}

	public Integer getCurrAccountingQty() {
		return currAccountingQty;
	}

	public void setCurrAccountingQty(Integer currAccountingQty) {
		this.currAccountingQty = currAccountingQty;
	}

	public BigDecimal getCurrSumOweAmount() {
		return currSumOweAmount;
	}

	public void setCurrSumOweAmount(BigDecimal currSumOweAmount) {
		this.currSumOweAmount = currSumOweAmount;
	}

	public BigDecimal getCurrAccountingAmount() {
		return currAccountingAmount;
	}

	public void setCurrAccountingAmount(BigDecimal currAccountingAmount) {
		this.currAccountingAmount = currAccountingAmount;
	}

	public BigDecimal getWeightedDifference() {
		return weightedDifference;
	}

	public void setWeightedDifference(BigDecimal weightedDifference) {
		this.weightedDifference = weightedDifference;
	}

	public BigDecimal getClosingBalanceReference() {
		return closingBalanceReference;
	}

	public void setClosingBalanceReference(BigDecimal closingBalanceReference) {
		this.closingBalanceReference = closingBalanceReference;
	}

	public Integer getSalesSumQty() {
		return salesSumQty;
	}

	public void setSalesSumQty(Integer salesSumQty) {
		this.salesSumQty = salesSumQty;
	}

	public BigDecimal getSalesSumAmount() {
		return salesSumAmount;
	}

	public void setSalesSumAmount(BigDecimal salesSumAmount) {
		this.salesSumAmount = salesSumAmount;
	}

	public String getYears() {
		return years;
	}

	public void setYears(String years) {
		this.years = years;
	}

	public String getYearsName() {
		return yearsName;
	}

	public void setYearsName(String yearsName) {
		this.yearsName = yearsName;
	}

	public String getSellSeason() {
		return sellSeason;
	}

	public void setSellSeason(String sellSeason) {
		this.sellSeason = sellSeason;
	}

	public String getSeasonName() {
		return seasonName;
	}

	public void setSeasonName(String seasonName) {
		this.seasonName = seasonName;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getOrderfrom() {
		return orderfrom;
	}

	public void setOrderfrom(String orderfrom) {
		this.orderfrom = orderfrom;
	}

	public Integer getBalanceDiff() {
		return balanceDiff;
	}

	public void setBalanceDiff(Integer balanceDiff) {
		this.balanceDiff = balanceDiff;
	}

	public BigDecimal getTagPrice() {
		return tagPrice;
	}

	public void setTagPrice(BigDecimal tagPrice) {
		this.tagPrice = tagPrice;
	}

	public String getBrandUnitNo() {
		return brandUnitNo;
	}

	public void setBrandUnitNo(String brandUnitNo) {
		this.brandUnitNo = brandUnitNo;
	}

	public String getBrandUnitName() {
		return brandUnitName;
	}

	public void setBrandUnitName(String brandUnitName) {
		this.brandUnitName = brandUnitName;
	}
    
}