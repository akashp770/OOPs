class A{
    public void hello(int x,int y) {
        int z=x+y;
        System.out.println("Sum is "+ z);
    }
    public void hello2(int x,int y) {
    
        int z=x-y;
        System.out.println("Sub is "+ z);
    }
    }

class CO1 {
    public static void main(String[] args) {
        System.out.println("HELLO");
        
        A ao=new A();
        
        ao.hello(100,200);
        ao.hello2(105,205);
        
    }
}