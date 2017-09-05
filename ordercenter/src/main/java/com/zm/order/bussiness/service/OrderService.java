package com.zm.order.bussiness.service;

import java.util.List;
import java.util.Map;

import org.springframework.dao.DataIntegrityViolationException;

import com.zm.order.pojo.OrderCount;
import com.zm.order.pojo.OrderInfo;
import com.zm.order.pojo.Pagination;
import com.zm.order.pojo.ResultModel;
import com.zm.order.pojo.ShoppingCart;

/**  
 * ClassName: OrderService <br/>  
 * Function: TODO ADD FUNCTION. <br/>   
 * date: Aug 11, 2017 3:45:10 PM <br/>  
 *  
 * @author wqy  
 * @version   
 * @since JDK 1.7  
 */
public interface OrderService {

	
	/**  
	 * saveOrder:新增订单，并调用支付接口进行支付. <br/>  
	 *  
	 * @author wqy  
	 * @param info
	 * @return
	 * @throws DataIntegrityViolationException
	 * @throws Exception  
	 * @since JDK 1.7  
	 */
	ResultModel saveOrder(OrderInfo info, Double version, String openId, String payType, String type) throws DataIntegrityViolationException, Exception;
	
	/**  
	 * listUserOrder:查询用户订单. <br/>  
	 *  
	 * @author wqy  
	 * @param param
	 * @return  
	 * @since JDK 1.7  
	 */
	ResultModel listUserOrder(OrderInfo info, Pagination pagination);
	
	/**  
	 * removeUserOrder:用户删除订单. <br/>  
	 * 
	 * @author wqy  
	 * @param param
	 * @return  
	 * @since JDK 1.7  
	 */
	ResultModel removeUserOrder(Map<String,Object> param);
	
	/**  
	 * confirmUserOrder:确认订单. <br/>  
	 *  
	 * @author wqy  
	 * @param param
	 * @return  
	 * @since JDK 1.7  
	 */
	ResultModel confirmUserOrder(Map<String,Object> param);
	
	/**  
	 * updateOrderPayStatusByOrderId:更新订单状态为已支付. <br/>  
	 *  
	 * @author wqy  
	 * @param orderId
	 * @return  
	 * @since JDK 1.7  
	 */
	ResultModel updateOrderPayStatusByOrderId(Map<String,Object> param);
	
	/**  
	 * getClientIdByOrderId:根据订单号获取客户端ID. <br/>  
	 *  
	 * @author wqy  
	 * @param orderId
	 * @return  
	 * @since JDK 1.7  
	 */
	Integer getClientIdByOrderId(String orderId);
	
	/**  
	 * saveShoppingCart:保存购物车. <br/>  
	 *  
	 * @author wqy  
	 * @param orderId
	 * @return  
	 * @since JDK 1.7  
	 */
	void saveShoppingCart(ShoppingCart cart);
	
	/**  
	 * listShoppingCart:获取购物车. <br/>  
	 *  
	 * @author wqy  
	 * @param orderId
	 * @return  
	 * @since JDK 1.7  
	 */
	List<ShoppingCart> listShoppingCart(Map<String,Object> param) throws Exception;
	
	/**  
	 * getCountByStatus:获取各状态的订单数量. <br/>  
	 *  
	 * @author wqy  
	 * @param orderId
	 * @return  
	 * @since JDK 1.7  
	 */
	List<OrderCount> getCountByStatus(Map<String,Object> param);
	
	/**  
	 * removeShoppingCart:删除购物车. <br/>  
	 *  
	 * @author wqy  
	 * @param orderId
	 * @return  
	 * @since JDK 1.7  
	 */
	void removeShoppingCart(Map<String,Object> param);
}
