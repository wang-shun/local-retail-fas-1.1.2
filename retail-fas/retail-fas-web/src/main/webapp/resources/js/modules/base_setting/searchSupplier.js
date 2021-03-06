var searchSupplier = {};
var tbgrid = {};
/**
 * 查询供应商
 */
searchSupplier.dosearchSupplier = function() {
	var reqParam = $("#subForm").form("getData");
	var queryMxURL = BasePath + "/base_setting/supplier/list.json";
	$("#searchSupplierDG").datagrid('options').queryParams = reqParam;
	$("#searchSupplierDG").datagrid('options').url = queryMxURL;
	$("#searchSupplierDG").datagrid('load');
};

/**
 * 清空查询条件
 */
searchSupplier.clearCondition = function() {
	$("#subForm").form("clear");
};

$(function() {

	// 查询组件中必须使用这种方法定义列，要不然双击选中行，页面将无反应
	tbgrid = $('#searchSupplierDG').datagrid({
		url : '',
		singleSelect : true,
		pagination : true,
		pageSize : 20,
		pageList : [ 10, 20, 50, 100, 200, 300, 400, 500 ],
		columns : [ [ {
			title : '请选择',
			field : 'col1',
			width : 80,
			formatter : function() {
				return " <input type='radio' name='optsel' />";
			}
		}, {
			field : 'supplierNo',
			title : '供应商编码',
			width : 100,
			align : 'left',
			halign : 'center'
		}, {
			field : 'fullName',
			title : '供应商名称',
			width : 250,
			align : 'left',
			halign : 'center'
		}  ] ]
	});

});
