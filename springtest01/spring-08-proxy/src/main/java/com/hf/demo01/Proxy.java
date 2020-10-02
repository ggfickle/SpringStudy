package com.hf.demo01;

/**
 * @program: springtest01
 * @description: 代理-中介
 * @author: xiehongfei
 * @create: 2020-10-02 11:36
 **/
public class Proxy implements Rent{
    private Host host=new Host();

    public Proxy() {
    }

    public Proxy(Host host) {
        this.host = host;
    }

    /**
     * 中介租房子给你
     */
    public void rent(){
        seeHouse();
        contract();
        host.rent();
        getFee();
    }

    /**
     * 看房
     */
    private void seeHouse(){
        System.out.println("中介带你看房子！");
    }

    /**
     * 签合同
     */
    private void contract(){
        System.out.println("签合同！");
    }

    /**
     * 收中介费
     */
    private void getFee(){
        System.out.println("中介收取中介费！");
    }
}
