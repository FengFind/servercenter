package com.zm.goods.activity.front.dao;

import java.util.List;
import java.util.Map;

import com.zm.goods.activity.model.ActiveGoods;
import com.zm.goods.activity.model.bargain.bo.BargainCountBO;
import com.zm.goods.activity.model.bargain.dto.BargainInfoDTO;
import com.zm.goods.activity.model.bargain.po.BargainRecordPO;
import com.zm.goods.activity.model.bargain.po.BargainRulePO;
import com.zm.goods.activity.model.bargain.po.UserBargainPO;

public interface BargainMapper {

	List<UserBargainPO> listBargainNormalByUserId(Map<String,Object> param);
	
	List<UserBargainPO> listBargainChainsByUserId(Map<String,Object> param);
	
	UserBargainPO getBargainDetailByParam(Map<String,Object> param);

	List<ActiveGoods> listActiceGoods(List<String> itemIdList);
	
	int getRuleTypeByUserBargainId(Integer id);

	List<BargainRulePO> listBargainGoodsForPage(List<Integer> list);

	List<BargainCountBO> listBargainCount(List<Integer> idList);

	void updateUserBargainOver(Map<String, Object> param);

	BargainRulePO getBargainRuleById(Integer goodsRoleId);

	int saveUserBargain(UserBargainPO userBargainPO);

	void saveBargainRecord(BargainRecordPO po);

	UserBargainPO getUserBargainById(Integer id);

	void updateBargainGoodsBuy(Integer id);

	List<Integer> listGoodsRoleIdsByUserId(Integer userId);

	void updateUserBargainOverByIds(List<Integer> overList);

	int updateUserBargainDel(BargainInfoDTO dto);

}
