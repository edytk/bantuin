package com.example.tux.bantuin;
//*untuk menyimpan nilai dari transaction
public class Transaction {
    String userID_Req;
    String userID_GiveHelp;
    String requestID;
    String requestName;
    String requestSkill;
    String requestPhone;
    String requestAddress;
    String requestEmailOrderBy;
    String requestEmailAcceptBy;
    String transactionID;
    String status;
    String chatRoomID;
    Float rating_GiveHelp;


    public Transaction(String userID_Req,String userID_GiveHelp,String requestID, String requestName, String requestSkill,
                       String  requestPhone, String requestAddress,String requestEmailOrderBy,
                       String requestEmailAcceptBy,String transactionID,String status,String chatRoomID,Float rating_GiveHelp)
    {

        this.userID_Req=userID_Req;
        this.userID_GiveHelp=userID_GiveHelp;
        this.requestID = requestID;
        this.requestName=requestName;
        this.requestSkill=requestSkill;
        this.requestPhone=requestPhone;
        this.requestAddress= requestAddress;
        this.requestEmailOrderBy= requestEmailOrderBy;
        this.requestEmailAcceptBy= requestEmailAcceptBy;
        this.transactionID =transactionID;
        this.status = status;
        this.chatRoomID= chatRoomID;
        this.rating_GiveHelp= rating_GiveHelp;
    }


    public String getUserID_Req() {return userID_Req;}
    public String getUserID_GiveHelp() {return userID_GiveHelp;}
    public String getRequestID() {
        return requestID;
    }
    public String getRequestName() {
        return requestName;
    }
    public String getRequestSkill() {
        return requestSkill;
    }
    public String getRequestPhone() {
        return requestPhone;
    }
    public String getRequestAddress() {
        return requestAddress;
    }
    public String getRequestEmailOrderBy() {
        return requestEmailOrderBy;
    }
    public String getRequestEmailAcceptBy() {
        return requestEmailAcceptBy;
    }
    public String getTransactionID() {
        return transactionID;
    }
    public String getStatus() {return status;}
    public String getChatRoomID() {return chatRoomID;}
    public Float getRating_GiveHelp() { return rating_GiveHelp;}
    public Transaction(){

    }
}
