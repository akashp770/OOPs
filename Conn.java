	//Constructor name is same as class name but withoutany return type  (rETURN TYPE IS VOID  IN THISPROGRAMM)
				//this keyworld

class A{
    private int x,y;		//Instance Var
    public A(int x,int y)  {   //Constructor
       this.x=x;
       this.y=y;
        }
        public void show(){		//Method
            System.out.println(x);
            System.out.println(y);
        }
    }
    


class Conn {
    public static void main(String[] args) {
        System.out.println("HELLO");
        
        A ao=new A(10,20);
      

        ao.show();
       
    }
}

