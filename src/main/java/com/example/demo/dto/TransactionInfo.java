package com.example.demo.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true)
public class TransactionInfo {

    private String senderPublicKey;
    private String amount;
    private String fee;
    private String type;
    private String version;
    private String attachment;
    private String sender;
    private String feeAssetId;
    private String proofs;
    private String assetId;
    private String recipient;
    private String id;
    private String timestamp;
    private String height;


    @Override
    public String toString() {
        return ("TransactionInfo{" +
                "senderPublicKey='" + senderPublicKey + '\'' +
                ", amount=" + amount + '\'' +
                ", fee=" + fee + '\'' +
                ", type=" + type + '\'' +
                ", version=" + version + '\'' +
                ", attachment=" + attachment + '\'' +
                ", sender=" + sender + '\'' +
                ", feeAssetId=" + feeAssetId + '\'' +
                ", proofs=" + proofs + '\'' +
                ", assetId=" + assetId + '\'' +
                ", recipient=" + recipient + '\'' +
                ", id=" + id + '\'' +
                ", timestamp=" + timestamp + '\'' +
                ", height=" + height +
                '}');
    }
}


