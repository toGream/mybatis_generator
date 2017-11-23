package com.itcast.ssm.po;

public class HrOrderDetailT {
    private Long id;

    private Long orderId;

    private Long itemsId;

    private Long itemsNum;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getOrderId() {
        return orderId;
    }

    public void setOrderId(Long orderId) {
        this.orderId = orderId;
    }

    public Long getItemsId() {
        return itemsId;
    }

    public void setItemsId(Long itemsId) {
        this.itemsId = itemsId;
    }

    public Long getItemsNum() {
        return itemsNum;
    }

    public void setItemsNum(Long itemsNum) {
        this.itemsNum = itemsNum;
    }
}