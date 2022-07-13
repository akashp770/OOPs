// Constructor Overloading--> Same Constructor Name But different Parameter
class A{
    private int x,y;
    private String name;
  public A() {
      x=10;
      y=20;
      name="Aakash";
  }
  public A(int x){
      this.x = x;
  }
  public A(int x, int y) {
      this.x = x;
      this.y =y;
  }
  public A(int x,int y,String name) {
      this.x = x;
      this.y = y;
      this.name =name;
  }
  public void show() {
      System.out.println("x is: "+ x);
      System.out.println("y is :"+ y);
      System.out.println("Name is :"+ name);
  }
}

class Conovlg {
    public static void main(String[] args) {
        System.out.println("Hello, World!"); 
        A ao = new A();
       ao.show();
       
       A ao2 = new A(100);
       ao2.show();
       
       A ao3 = new A(100,200);
       ao3.show();
       
       A ao4= new A(123,456,"Rich");
       ao4.show();
    }
}
