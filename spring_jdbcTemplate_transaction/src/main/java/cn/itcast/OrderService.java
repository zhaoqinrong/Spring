package cn.itcast;

import org.springframework.core.annotation.Order;

public class OrderService {
    private OrdersDao ordersDao;


    public void setOrdersDao(OrdersDao ordersDao) {
        this.ordersDao = ordersDao;
    }
    //转账方法
    public void accountMoney(){
        //小王少钱
        ordersDao.lessMoney();
        //小马多钱
        ordersDao.moreMoney();
    }
}
