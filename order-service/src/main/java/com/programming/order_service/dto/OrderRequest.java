package com.programming.order_service.dto;

import java.util.List;

public class OrderRequest {
    private List<OrderLineItemsDto> OrderLineItemsDtoList;

    public OrderRequest() {
    }

    public OrderRequest(List<OrderLineItemsDto> orderLineItemsDtoList) {
        OrderLineItemsDtoList = orderLineItemsDtoList;
    }

    public List<OrderLineItemsDto> getOrderLineItemsDtoList() {
        return OrderLineItemsDtoList;
    }

    public void setOrderLineItemsDtoList(List<OrderLineItemsDto> orderLineItemsDtoList) {
        OrderLineItemsDtoList = orderLineItemsDtoList;
    }
}
