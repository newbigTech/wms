package com.leqee.wms.api.response;

import java.util.List;

import org.codehaus.jackson.map.annotate.JsonSerialize;

import com.leqee.wms.api.LeqeeResponse;
import com.leqee.wms.api.response.domain.OrderInfoResDomain;
import com.leqee.wms.api.response.domain.VarianceImproveTaskResDomain;

/**
 * 查询订单列表Response
 * @author qyyao
 * @date 2016-3-7
 * @version 1.0
 */
@JsonSerialize(include=JsonSerialize.Inclusion.NON_NULL)
public class GetVarianceImproveTaskListResponse extends LeqeeResponse{
	private static final long serialVersionUID = 1L;
	
	private Integer total_count;
	
	private List<VarianceImproveTaskResDomain> varianceImproveTaskResDomainList ;    //-v盘点单
	

	public Integer getTotal_count() {
		return total_count;
	}

	public void setTotal_count(Integer total_count) {
		this.total_count = total_count;
	}

	public List<VarianceImproveTaskResDomain> getVarianceImproveTaskResDomainList() {
		return varianceImproveTaskResDomainList;
	}

	public void setVarianceImproveTaskResDomainList(
			List<VarianceImproveTaskResDomain> varianceImproveTaskResDomainList) {
		this.varianceImproveTaskResDomainList = varianceImproveTaskResDomainList;
	}

	
	
	
	
}
