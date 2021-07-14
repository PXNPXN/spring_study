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

    //����
    public void seeHouse(){
        System.out.println("�н���㿴��");
    }
    //ǩ��ͬ
    public void contract(){
        System.out.println("ǩ�����޺�ͬ");
    }
    //���н��
    public void fare(){
        System.out.println("���н��");
    }

}
