package com.example.ss8.model.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;



public class AddressDto {

    @NotBlank(message = "Tên người nhận không được để trống hoặc chỉ chứa khoảng trắng")
    @Size(max = 100, message = "Tên quá dài")
    private String receiverName;

    @NotBlank(message = "Địa chỉ chi tiết tuyệt đối không được để trống")
    private String detailedAddress;

    public String getReceiverName() {
        return receiverName;
    }

    public void setReceiverName(String receiverName) {
        this.receiverName = receiverName;
    }

    public String getDetailedAddress() {
        return detailedAddress;
    }

    public void setDetailedAddress(String detailedAddress) {
        this.detailedAddress = detailedAddress;
    }

}