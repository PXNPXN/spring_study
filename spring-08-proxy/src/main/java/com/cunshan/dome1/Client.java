package com.cunshan.dome1;

public class Client {
    public static void main(String[] args) {
        //����Ҫ�ⷿ��
        Host host = new Host();
        //�����н�﷿���ⷿ�ӣ������أ������ɫһ�����һЩ����������
        Proxy proxy = new Proxy(host);

        //�㲻����Է�����ֱ�����н��ⷿ���ɣ�
        proxy.rent();
    }
}
