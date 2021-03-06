package com.zm.supplier.util;

import java.util.HashMap;
import java.util.Map;

public class CountryCode {
	private static final Map<String, String> countryCode = new HashMap<String, String>() {
		/**  
		 * serialVersionUID:TODO(用一句话描述这个变量表示什么).  
		 * @since JDK 1.7  
		 */
		private static final long serialVersionUID = 1L;

		{
			put("亚洲", "100");
			put("阿富汗","101");
			put("巴林","102");
			put("孟加拉国","103");
			put("不丹","104");
			put("文莱","105");
			put("缅甸","106");
			put("柬埔寨","107");
			put("塞浦路斯","108");
			put("朝鲜","109");
			put("中国香港","110");
			put("印度","111");
			put("印度尼西亚","112");
			put("伊朗","113");
			put("伊拉克","114");
			put("以色列","115");
			put("日本","116");
			put("约旦","117");
			put("科威特","118");
			put("老挝","119");
			put("黎巴嫩","120");
			put("中国澳门","121");
			put("马来西亚","122");
			put("马尔代夫","123");
			put("蒙古","124");
			put("尼泊尔","125");
			put("阿曼","126");
			put("巴基斯坦","127");
			put("巴勒斯坦","128");
			put("菲律宾","129");
			put("卡塔尔","130");
			put("沙特阿拉伯","131");
			put("新加坡","132");
			put("韩国","133");
			put("斯里兰卡","134");
			put("叙利亚","135");
			put("泰国","136");
			put("土耳其","137");
			put("阿联酋","138");
			put("也门共和国","139");
			put("越南","141");
			put("中国","142");
			put("台澎金马关税区","143");
			put("东帝汶","144");
			put("哈萨克斯坦","145");
			put("吉尔吉斯斯坦","146");
			put("塔吉克斯坦","147");
			put("土库曼斯坦","148");
			put("乌兹别克斯坦","149");
			put("亚洲其他国家(地区)","199");
			put("非洲","200");
			put("阿尔及利亚","201");
			put("安哥拉","202");
			put("贝宁","203");
			put("博茨瓦那","204");
			put("布隆迪","205");
			put("喀麦隆","206");
			put("加那利群岛","207");
			put("佛得角","208");
			put("中非共和国","209");
			put("塞卜泰","210");
			put("乍得","211");
			put("科摩罗","212");
			put("刚果","213");
			put("吉布提","214");
			put("埃及","215");
			put("赤道几内亚","216");
			put("埃塞俄比亚","217");
			put("加蓬","218");
			put("冈比亚","219");
			put("加纳","220");
			put("几内亚","221");
			put("几内亚(比绍)","222");
			put("科特迪瓦","223");
			put("肯尼亚","224");
			put("利比里亚","225");
			put("利比亚","226");
			put("马达加斯加","227");
			put("马拉维","228");
			put("马里","229");
			put("毛里塔尼亚","230");
			put("毛里求斯","231");
			put("摩洛哥","232");
			put("莫桑比克","233");
			put("纳米比亚","234");
			put("尼日尔","235");
			put("尼日利亚","236");
			put("留尼汪","237");
			put("卢旺达","238");
			put("圣多美和普林西比","239");
			put("塞内加尔","240");
			put("塞舌尔","241");
			put("塞拉利昂","242");
			put("索马里","243");
			put("南非","244");
			put("西撒哈拉","245");
			put("苏丹","246");
			put("坦桑尼亚","247");
			put("多哥","248");
			put("突尼斯","249");
			put("乌干达","250");
			put("布基纳法索","251");
			put("民主刚果","252");
			put("赞比亚","253");
			put("津巴布韦","254");
			put("莱索托","255");
			put("梅利利亚","256");
			put("斯威士兰","257");
			put("厄立特里亚","258");
			put("马约特岛","259");
			put("非洲其他国家(地区)","299");
			put("欧洲","300");
			put("比利时","301");
			put("丹麦","302");
			put("英国","303");
			put("德国","304");
			put("法国","305");
			put("爱尔兰","306");
			put("意大利","307");
			put("卢森堡","308");
			put("荷兰","309");
			put("希腊","310");
			put("葡萄牙","311");
			put("西班牙","312");
			put("阿尔巴尼亚","313");
			put("安道尔","314");
			put("奥地利","315");
			put("保加利亚","316");
			put("芬兰","318");
			put("直布罗陀","320");
			put("匈牙利","321");
			put("冰岛","322");
			put("列支敦士登","323");
			put("马耳他","324");
			put("摩纳哥","325");
			put("挪威","326");
			put("波兰","327");
			put("罗马尼亚","328");
			put("圣马力诺","329");
			put("瑞典","330");
			put("瑞士","331");
			put("爱沙尼亚","334");
			put("拉脱维亚","335");
			put("立陶宛","336");
			put("格鲁吉亚","337");
			put("亚美尼亚","338");
			put("阿塞拜疆","339");
			put("白俄罗斯","340");
			put("摩尔多瓦","343");
			put("俄罗斯联邦","344");
			put("乌克兰","347");
			put("塞尔维亚和黑山","349");
			put("斯洛文尼亚","350");
			put("克罗地亚","351");
			put("捷克共和国","352");
			put("斯洛伐克","353");
			put("马其顿","354");
			put("波斯尼亚-黑塞哥维那共和","355");
			put("梵蒂冈城国","356");
			put("欧洲其他国家(地区)","399");
			put("拉丁美洲","400");
			put("安提瓜和巴布达","401");
			put("阿根廷","402");
			put("阿鲁巴岛","403");
			put("巴哈马","404");
			put("巴巴多斯","405");
			put("伯利兹","406");
			put("玻利维亚","408");
			put("博内尔","409");
			put("巴西","410");
			put("开曼群岛","411");
			put("智利","412");
			put("哥伦比亚","413");
			put("多米尼亚共和国","414");
			put("哥斯达黎加","415");
			put("古巴","416");
			put("库腊索岛","417");
			put("多米尼加共和国","418");
			put("厄瓜多尔","419");
			put("法属圭亚那","420");
			put("格林纳达","421");
			put("瓜德罗普","422");
			put("危地马拉","423");
			put("圭亚那","424");
			put("海地","425");
			put("洪都拉斯","426");
			put("牙买加","427");
			put("马提尼克","428");
			put("墨西哥","429");
			put("蒙特塞拉特","430");
			put("尼加拉瓜","431");
			put("巴拿马","432");
			put("巴拉圭","433");
			put("秘鲁","434");
			put("波多黎各","435");
			put("萨巴","436");
			put("圣卢西亚","437");
			put("圣马丁岛","438");
			put("圣文森特和格林纳丁斯","439");
			put("萨尔瓦多","440");
			put("苏里南","441");
			put("特立尼达和多巴哥","442");
			put("特克斯和凯科斯群岛","443");
			put("乌拉圭","444");
			put("委内瑞拉","445");
			put("英属维尔京群岛","446");
			put("圣其茨-尼维斯","447");
			put("圣皮埃尔和密克隆","448");
			put("荷属安地列斯群岛","449");
			put("拉丁美洲其他国家(地区)","499");
			put("北美洲","500");
			put("加拿大","501");
			put("美国","502");
			put("格陵兰","503");
			put("百慕大","504");
			put("北美洲其他国家(地区)","599");
			put("大洋洲","600");
			put("澳大利亚","601");
			put("库克群岛","602");
			put("斐济","603");
			put("盖比群岛","604");
			put("马克萨斯群岛","605");
			put("瑙鲁","606");
			put("新喀里多尼亚","607");
			put("瓦努阿图","608");
			put("新西兰","609");
			put("诺福克岛","610");
			put("巴布亚新几内亚","611");
			put("社会群岛","612");
			put("所罗门群岛","613");
			put("汤加","614");
			put("土阿莫土群岛","615");
			put("土布艾群岛","616");
			put("萨摩亚","617");
			put("基里巴斯","618");
			put("图瓦卢","619");
			put("密克罗尼西亚联邦","620");
			put("马绍尔群岛","621");
			put("帕劳共和国","622");
			put("法属波利尼西亚","623");
			put("瓦利斯和浮图纳","625");
			put("大洋洲其他国家(地区)","699");
			put("国(地)别不详的","701");
			put("联合国及机构和国际组织","702");
		}
	};

	/**
	 * 通过返回码获取返回信息
	 * 
	 * @param errCode
	 *            错误码
	 * @return {String}
	 */
	public static String get(String code) {
		return countryCode.get(code);
	}
}
