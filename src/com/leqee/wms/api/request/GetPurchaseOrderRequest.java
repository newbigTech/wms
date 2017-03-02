package com.leqee.wms.api.request;

import java.util.Map;

import com.leqee.wms.api.ApiRuleException;
import com.leqee.wms.api.BaseLeqeeRequest;
import com.leqee.wms.api.response.GetPurchaseOrderResponse;


public class GetPurchaseOrderRequest extends BaseLeqeeRequest<GetPurchaseOrderResponse>{
	
	
	private String oms_order_sn;

	public String getOms_order_sn() {
		return oms_order_sn;
	}

	public void setOms_order_sn(String oms_order_sn) {
		this.oms_order_sn = oms_order_sn;
	}

	@Override
	public String getApiMethodName() {
		return METHOD_GET_PURCHASE_ORDER_REQUEST;
	}

	@Override
	public Map<String, String> getTextParams() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Class<GetPurchaseOrderResponse> getResponseClass() {
		return GetPurchaseOrderResponse.class;
	}

	@Override
	public void check() throws ApiRuleException {
		// TODO Auto-generated method stub
		
	}

	
}
