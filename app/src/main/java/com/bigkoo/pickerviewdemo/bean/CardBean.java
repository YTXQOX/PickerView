package com.bigkoo.pickerviewdemo.bean;

import com.bigkoo.pickerview.model.IPickerViewData;

/**
 * Created by KyuYi on 2017/3/2.
 * E-Mail:kyu_yi@sina.com
 * 功能：
 */

public class CardBean implements IPickerViewData {
    boolean isDiscount;
    int id;
    String cardNo;

    public CardBean(boolean isDiscount, int id, String cardNo) {
        this.isDiscount = isDiscount;
        this.id = id;
        this.cardNo = cardNo;
    }

    public boolean isDiscount() {
        return isDiscount;
    }

    public void setDiscount(boolean discount) {
        isDiscount = discount;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCardNo() {
        return cardNo;
    }

    public void setCardNo(String cardNo) {
        this.cardNo = cardNo;
    }

    @Override
    public String getPickerViewText() {
        return cardNo;
    }

    @Override
    public boolean getPickerViewIsShowImage() {
        return isDiscount;
    }
}

