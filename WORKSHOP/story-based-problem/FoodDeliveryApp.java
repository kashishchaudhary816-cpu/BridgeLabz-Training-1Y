class Order {
    protected int orderId;
    protected double baseAmount;
    
    static double deliveryCharge = 40; 
    public Order(int orderId, double baseAmount) {
        this.orderId = orderId;
        this.baseAmount = baseAmount;
    }
    
    public double calculateBill() {
        return baseAmount + deliveryCharge;
    }
}

class RegularOrder extends Order {
    
    public RegularOrder(int orderId, double baseAmount) {
        super(orderId, baseAmount);
    }
    
    @Override
    public double calculateBill() {
        return baseAmount + deliveryCharge;
    }
}

class PremiumOrder extends Order {
    
    public PremiumOrder(int orderId, double baseAmount) {
        super(orderId, baseAmount);
    }
    
    @Override
    public double calculateBill() {
        double discount = 0.20 * baseAmount;
        return (baseAmount - discount) + deliveryCharge;
    }
}


public class FoodDeliveryApp {
    public static void main(String[] args) {
        
        Order o1 = new RegularOrder(101, 500);
        Order o2 = new PremiumOrder(102, 500);
        
        System.out.println("Regular Order Bill: " + o1.calculateBill());
        System.out.println("Premium Order Bill: " + o2.calculateBill());
    }
}