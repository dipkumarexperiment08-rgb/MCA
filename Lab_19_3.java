class FoodDelevery{
    void prepareOrder(){
        System.out.println("Preparing order");
    }
}


class FastFood extends FoodDelevery{
    @Override
    void prepareOrder(){
        System.out.println("FastFood is preparing");
    }
}

class SouthIndian extends FoodDelevery{
    @Override
    void prepareOrder(){
        System.out.println("South Indian  food is preparing");
    }
}

class ChineseRestaurant extends FoodDelevery{
    @Override
    void prepareOrder(){
        System.out.println("Chines food is preparing");
    }
}

public class Lab_19_3{
    public static void main(String[] args) {
        FoodDelevery f1 = new FastFood();
        f1.prepareOrder();
        FoodDelevery f2 = new SouthIndian();
        f2.prepareOrder();
        FoodDelevery f3 = new ChineseRestaurant();
        f3.prepareOrder();
    }
}