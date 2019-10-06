/**
 * 
 */
package com.retail.online.store.operations;

import java.util.List;

import com.retail.online.store.model.Bill;
import com.retail.online.store.model.ShoppingItem;
import com.retail.online.store.model.User;


/**
 * @author Rajkumar Verma
 *
 */
public interface BillOperations {

	public void collectUserInfo(User user);

	public Double getGroceriedItemCost(List<ShoppingItem> shoopingItemList);

	public Double collectPurchasedItems(List<ShoppingItem> shoopingItemList);

	public Double userTypeDiscountApply(Double cost);

	public Double totalBillDiscountApply(Double cost);
	
	public String printBillDetails(Bill bill);

}
