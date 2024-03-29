package com.study.ch15;

public class SendMain {

    public static void main(String[] args) {
        SendData<String> sendData1 = new SendData<>(200, "김준일");
        //send(sendData1);
        SendData<Member> sendData2 = new SendData<>(200, new Member("김준일", "01047633806"));
        send(sendData2);
        SendData<VipMember> sendData3 = new SendData<>(200, new VipMember("김준이", "01011112222"));
        send(sendData3);
    }
    //<?> : 와일드카드
    public static void send(SendData<? super VipMember> sendData) {
        sendData.send();

    }
}
