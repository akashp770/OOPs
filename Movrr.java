            //Method Overriding -Same method name with same Parameter
class A{
  public void show(int x, int y) {
      int z=x+y;
      System.out.println(z);
  }
}
class B extends A{
    public void show(int x,int y) {
        int z=x-y;
        System.out.println(z);
    }
}
class C extends B {
   public void show(int x,int y) {
        int z=x*y;
        System.out.println(z);
    }
    
}
class D extends C {
     public void show(int x,int y) {
        int z=x/y;
        System.out.println(z);
    }
}


class Movrr {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
        A ao =new A();
        B bo =new B();
        C co = new C();
        D d = new D();
        
        ao.show(10,20);
        bo.show(10,20);
        co.show(10,20);
        d.show(10,20);
        
        
    }
}