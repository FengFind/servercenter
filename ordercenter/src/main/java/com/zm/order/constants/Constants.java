package com.zm.order.constants;

public class Constants {

	public static final Double FIRST_VERSION = 1.0;

	// *********************各支付类型******************************/
	public static final String WX_PAY = "1";

	public static final String ALI_PAY = "2";

	public static final String UNION_PAY = "3";

	public static final String REBATE_PAY = "4";

	public static final String YOP_PAY = "5";

	public static final String JSAPI = "JSAPI";

	// *********************订单状态******************************/

	public static final Integer ORDER_INIT = 0;// 初始
	public static final Integer ORDER_PAY = 1;// 已付款
	public static final Integer ORDER_PAY_CUSTOMS = 2;// 支付单报关
	public static final Integer ORDER_TO_WAREHOUSE = 3;// 已发仓库
	public static final Integer ORDER_CUSTOMS = 4;// 已报海关
	public static final Integer ORDER_DZFX = 5;// 单证放行
	public static final Integer ORDER_DELIVER = 6;// 已发货
	public static final Integer ORDER_COMPLETE = 7;// 已收货订单完成
	public static final Integer ORDER_CANCEL = 8;// 退单
	public static final Integer ORDER_CLOSE = 9;// 交易关闭
	public static final Integer CAPITAL_POOL_NOT_ENOUGH = 11;// 资金池不足
	public static final Integer CAPITAL_POOL_ENOUGH = 12;// 资金池已经扣减,报关/推送仓库
	public static final Integer REFUNDS = 21;// 退款中
	public static final Integer ORDER_EXCEPTION = 99;// 订单异常

	// *********************活动范围，获取是否有全场活动******************************/
	public static final Integer ACTIVE_AREA = 1;// 活动范围：全场

	// *********************活动类型******************************/
	public static final Integer FULL_CUT = 1;// 满减

	public static final Integer FULL_DISCOUNT = 2;// 满打折

	// *******************快递方式******************
	public static final Integer EXPRESS = 0;

	public static final Integer OWN_CARRIER = 1;

	// *********************订单类型*********************

	public static final Integer O2O_ORDER_TYPE = 0;// 跨境

	public static final Integer TRADE_ORDER_TYPE = 1;// 大贸

	public static final Integer GENERAL_TRADE = 2;// 一般贸易

	// ************************分润前缀**********************
	public static final String PROFIT = "profit";
	
	// *********************异常分润订单***********************
	
	public static final String GRADEBO_INFO = "gradeBO:";//每个ID的gradeBO信息

	// *********************异常分润订单***********************
	public static final String EXCEPTION_PROFIT = "EXCEPTION_PROFIT";

	// *********************订货平台订单***********************
	public static final Integer PREDETERMINE_ORDER = 2;

	// *********************订货平台ID*********************

	public static final Integer PREDETERMINE_PLAT_TYPE = -1;

	// *********************中国供销海外购ID*********************

	public static final Integer CNCOOPBUY = 2;

	// *********************资金池redis前缀*********************

	public static final String CAPITAL_PERFIX = "capital:";
	public static final String CAPITAL_DETAIL = "capitaldetail:";

	// *********************商品返佣redis前缀***************************
	public static final String GOODS_REBATE = "goodsrebate:";

	// *********************订单返佣redis前缀***************************
	public static final String ORDER_REBATE = "orderrebate:";

	// *********************等级返佣***************************
	public static final String GRADE_ORDER_REBATE = "grade:orderrebate:";
	
	//分级每天返佣金额
	public static final String GRADE_ORDER_REBATE_DAY = "grade:day:orderrebate:";
	//90天返佣列表
	public static final String GRADE_ORDER_REBATE_DAY_LIST = "grade:day:orderrebate:list:";

	// *********************返佣详情***************************
	public static final String REBATE_DETAIL = "rebatedetail:";

	// **********************订单周统计前缀***********************
	public static final String ORDER_STATISTICS_WEEK = "orderstatistics:week:";

	// **********************订单月统计前缀***********************
	public static final String ORDER_STATISTICS_MONTH = "orderstatistics:month:";

	// **********************销售额周统计前缀***********************
	public static final String SALES_STATISTICS_WEEK = "salesstatistics:week:";

	// **********************销售额月统计前缀***********************
	public static final String SALES_STATISTICS_MONTH = "salesstatistics:month:";

	// **********************订单当天统计前缀***********************
	public static final String ORDER_STATISTICS_DAY = "orderstatistics:day:";
	
	// **********************pv uv 统计*****************************
	//当天的key
	public static final String VISIT_STATISTICS_DAY = "flowstatis:day:visit:";
	public static final String PAGE_STATISTICS_DAY = "flowstatis:day:page:";
	//保存90天数据的key
	public static final String VISIT_STATISTICS_DAY_LIST = "flowstatis:day:list:visit:";
	public static final String PAGE_STATISTICS_DAY_LIST = "flowstatis:day:list:page:";
	
	// ********************商品订单量统计*************************************
	public static final String ORDER_GOODS_STATISTICS_DAY_LIST = "order:goods:day:list:";
	
	// ********************商品pv,uv统计*************************************
	//当天
	public static final String GOODS_VISIT_STATISTICS_DAY = "goodsview:day:visit:";
	public static final String GOODS_PAGE_STATISTICS_DAY = "goodsview:day:page:";
	//保存90天数据的key
	public static final String GOODS_VISIT_STATISTICS_DAY_LIST = "goodsview:day:list:visit:";
	public static final String GOODS_PAGE_STATISTICS_DAY_LIST = "goodsview:day:list:page:";

	// **********************销售额当天统计前缀***********************
	public static final String SALES_STATISTICS_DAY = "salesstatistics:day:";

	// *********************包邮包税redis前缀***************************
	public static final String POST_TAX = "post_tax:";

	// *********************包邮包税***************************
	public static final String FREE_POST = "1";
	public static final String ARRIVE_POST = "2";
	public static final String FREE_TAX = "1";

	//*******************订单来源**********************
	public static final Integer ORDER_SOURCE_YOUZAN = 3;//有赞
	public static final Integer ORDER_SOURCE_EXHIBITION = 5;//展厅
	public static final Integer ORDER_SOURCE_BIG_CUSTOMER = 6;//大客户
	public static final Integer WELFARE_WEBSITE = 7;//福利网站
	public static final Integer TAIPING_HUIHUI = 9;//太平慧慧
	public static final Integer BACK_MANAGER_WEBSITE = 8;// 后台来源
	public static final Integer WX_APPLET = 10;// 微信小程序
	public static final Integer JU_MING_HUI = 11;//聚民惠
	public static final Integer PING_DUO_DUO = 12;//拼多多
	public static final Integer YI_JIE_BJ = 13;//易捷北京
	public static final Integer OWNER = 14;//自营
	public static final Integer JIN_RONG_GONG_CHANG = 15;//金融工厂
	public static final Integer ZHONGXING_LEYITONG = 16;//中信乐益通
	public static final Integer BO_LUO_MI = 17;//菠萝蜜
	public static final Integer MA_SHANG_XIAO_FEI_JIN_RONG = 18;//马上消费金融
	public static final Integer GONG_XIAO_E_JIA = 19;//供销e家
	public static final Integer TAO_BAO = 20;//淘宝
	
	//*******************订单创建类型**********************
	public static final int NORMAL_ORDER = 0;//普通订单
	public static final int BARGAIN_ORDER = 1;//砍价活动订单
	public static final int BIG_SALE = 2;//特卖商品
	public static final int TO_B_ORDER = 4;//2b订单
	public static final int OPEN_INTERFACE_TYPE = 5;//对接订单
	
	//*******************一般贸易仓金额**********************
	public static final Integer GENERAL_TRADE_FEE = 500;

	// *******************一般贸易仓ID**********************
	public static final Integer GENERAL_WAREHOUSE_ID = 6;

	// *******************金额允许偏离范围**********************
	public static final Integer DEVIATION = 5;

	// *******************海关税率折扣**********************
	public static final double TAX_DISCOUNT = 0.7;

	// **********************************************************************//
	public static final String CAN_BE_PRESENTED = "canBePresented";// 待对账
	public static final String ALREADY_CHECK = "alreadyCheck";// 已对账，可使用
	public static final String ALREADY_PRESENTED = "alreadyPresented";// 已提现
	public static final String FROZEN_REBATE = "frozenRebate";// 冻结
	public static final String STAY_TO_ACCOUNT = "stayToAccount";//待到账
	public static final String ORDER_CONSUME = "orderConsume";//订单消费
	public static final String CAPITAL_MONEY = "money";
	public static final String CAPITAL_FROZEN_MONEY = "frozenMoney";
	public static final String CAPITAL_USE_MONEY = "useMoney";

}
