		//	Block Example

class Block {
    public Block() {
        System.out.println("Constructor.. ");
    }
    
    public void show(){
        System.out.println("Method....");
    }

   static
   {
        System.out.println("It is a Static Block");
    }

     {
       
         System.out.println("Instance Block");
    }
  

    public static void main(String[] args) {
      Block  ao=new Block();
      
      ao.show();
    }
}