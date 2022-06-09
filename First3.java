			//Class Object Example

class A{
    public void loop1()  {
       for(int i=1;i<=10;i++) {
           System.out.println("For Loop " + i);
       }
    }
    
}
class B{
    public void  loop2() {
    
    int x;
    x=11;
    while(x<=20) {
        System.out.println("While Loop " + x);
        x++;
    }
       
    }
    }

class C {
    public void loop3() {
        
       int x;
       x=21;
       
       do{
           System.out.println("Do While Loop " + x);
           x++;
       }
       while(x<=30);
       
    }
}    

class D{
    public void Arr(){
        int x [] ={10,20,30,40,50};
        System.out.println("Length of array is " + x.length);
    }
}


class CO3 {
    public static void main(String[] args) {
        System.out.println("HELLO");
        
        A ao=new A();
        B bo = new B();
        C co = new C();
       D d = new D();
        
        ao.loop1();
        bo.loop2();
        co.loop3();
        d.Arr();
    }
}