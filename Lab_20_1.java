interface A{
int A_const = 10;
void showA();
}

interface  A1 extends A{
    int A1_const = 20;
    void showA1();
}

interface  A2 extends A{
    int A2_const = 30;
    void showA2();
}

interface A12 extends A1,A2{
    int A12_const = 40;
    void showA12();
}


class B implements A12{

    @Override
    public void showA(){
        System.out.println(A_const);
    }

    @Override
    public void showA1(){
        System.out.println(A1_const);
    }

    @Override 
    public void showA2(){
        System.out.println(A2_const);
    }

    @Override
    public void showA12(){
        System.out.println(A12_const);
    }
}


public class Lab_20_1 {
public static void main(String[] args) {
    B  obj = new B();

    obj.showA();
    obj.showA1();
    obj.showA2();
    obj.showA12();
}    
}
