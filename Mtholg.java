// Method Overloading--> Same Method Name But different Parameter
class A{
    public void show() {
        System.out.println("NO Parameter");
    } 
    public void show (int x) {
        System.out.println("Integer is : " + x);
    }
    public void show(int x,int y) {
        int z=x+y;
        System.out.println("Sum is :" + z);
    }
    public double show (double x){
        return x*x;
    }
}


class Mtholg {
    public static void main(String[] args) {
        System.out.println("Hello, World!"); 
        A ao = new A();
        
        ao.show();
        ao.show(10);
        ao.show(10,20);
        System.out.println("Multi is : "+ ao.show(10.5));
    }
}