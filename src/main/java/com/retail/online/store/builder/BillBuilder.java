/**
 * 
 */
package com.retail.online.store.builder;

import java.util.List;

import org.springframework.stereotype.Component;

import com.retail.online.store.model.Bill;
import com.retail.online.store.model.ShoppingItem;

/**
 * @author Rajkumar Verma
 *
 */
@Component
public class BillBuilder {

	private List<ShoppingItem> shoopingItemList;
	private Double totalBill;
	private Double totalBillAfterUserTypeDiscount;
	private Double finalbillCost;

	public BillBuilder shoopingItemList(List<ShoppingItem> shoopingItemList) {
		this.shoopingItemList = shoopingItemList;
		return this;
	}

	public BillBuilder totalBill(Double totalBill) {
		this.totalBill = totalBill;
		return this;

	}

	public BillBuilder totalBillAfterUserTypeDiscount(Double totalBillAfterUserTypeDiscount) {
		this.totalBillAfterUserTypeDiscount = totalBillAfterUserTypeDiscount;
		return this;
	}

	public BillBuilder finalbillCost(Double finalbillCost) {
		this.finalbillCost = finalbillCost;
		return this;
	}

	public Bill Build() {
		return new Bill(shoopingItemList, totalBill, totalBillAfterUserTypeDiscount, finalbillCost);
	}

}
