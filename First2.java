class A{
    public void hello(int x,int y) {
        int z=x+y;
        System.out.println("Sum is "+ z);
    }
    
}
class B{
    public void hello(int x,int y) {
    
        int z=x-y;
        System.out.println("Sub is "+ z);
    }
    }

class C {
    public int hello(int x,int y)  {
        return x*y;
    }
}    

class D {
    public String show(String name) {
        return name;
    }
}
class CO2 {
    public static void main(String[] args) {
        System.out.println("HELLO");
        
        A ao=new A();
        B bo = new B();
        C co = new C();
        D d = new D();
        
        ao.hello(100,200);
        bo.hello(105,205);
        System.out.println("Multi is " + co.hello(1000,20000));
        System.out.println("Salary of "+ d.show("Aakash") +" is "+ co.hello(1000,2000));
    }
}