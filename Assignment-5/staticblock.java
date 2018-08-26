class Block{
   static int n;
   static String str;
   
   static{
      System.out.println("Static Block 1");
      n = 10;
      str = "Block1";
  } 
  public static void main(String args[])
  {
      System.out.println("Value of n: "+n);
      System.out.println("Value of str: "+str);
   }
 }