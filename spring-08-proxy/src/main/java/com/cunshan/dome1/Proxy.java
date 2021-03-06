package com.cunshan.dome1;

public class Proxy implements Rent {
    private Host host;

    public Proxy(){

    }

    public Proxy(Host host){
        this.host = host;
    }

    @Override
    public void rent() {
        seeHouse();
        host.rent();
        contract();
        fare();
    }

    //看房
    public void seeHouse(){
        System.out.println("中介带你看房");
    }
    //签合同
    public void contract(){
        System.out.println("签订租赁合同");
    }
    //收中介费
    public void fare(){
        System.out.println("收中介费");
    }

}
