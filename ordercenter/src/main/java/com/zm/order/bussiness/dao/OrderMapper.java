package com.zm.order.bussiness.dao;

import java.util.List;
import java.util.Map;

import com.zm.order.pojo.OrderDetail;
import com.zm.order.pojo.OrderGoods;
import com.zm.order.pojo.OrderInfo;
import com.zm.order.pojo.ShoppingCart;

/**  
 * ClassName: OrderMapper <br/>  
 * Function: TODO ADD FUNCTION. <br/>   
 * date: Aug 11, 2017 3:40:13 PM <br/>  
 *  
 * @author wqy  
 * @version   
 * @since JDK 1.7  
 */
public interface OrderMapper {

	void saveOrder(OrderInfo info);
	
	void saveOrderDetail(OrderDetail orderDetail);
	
	void saveOrderGoods(List<OrderGoods> goodsList);
	
	List<OrderInfo> listOrderByUser(Map<String,Object> param);
	
	void removeUserOrder(Map<String,Object> param);
	
	void confirmUserOrder(Map<String,Object> param);
	
	void updateOrderPayStatusByOrderId(String orderId);
	
	int getClientIdByOrderId(String orderId);
	
	void saveShoppingCart(ShoppingCart cart);
	
	List<ShoppingCart> listShoppingCart(Map<String,Object> param);
}