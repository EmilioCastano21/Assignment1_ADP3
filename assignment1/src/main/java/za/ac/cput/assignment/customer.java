package za.ac.cput.assignment;

public class customer {

    private static String custName;
    private static int orderNum;
    private static String food;

    public customer() {
    }

    public static String getCustName() {
        return custName;
    }

    public static void setCustName(String custName) {
        customer.custName = custName;
    }

    public static int getOrderNum() {
        return orderNum;
    }

    public static void setOrderNum(int orderNum) {
        customer.orderNum = orderNum;
    }

    public static String getFood() {
        return food;
    }

    public static void setFood(String food) {
        customer.food = food;
    }

    @Override
    public String toString() {
        return "customer{}";
    }
}
