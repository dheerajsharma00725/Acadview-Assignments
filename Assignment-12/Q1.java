import java.util.*;
class SimilarElements{
  public void addi(Set<Integer>s){
    Scanner o=new Scanner(System.in);
    System.out.println("enter elements and -1 to exit");
   int a=o.nextInt();
    while(a!=-1)
    { 
      s.add(a);
      a=o.nextInt();
    }
  }
  public static void main(String []args)
  {
    int a;
    SimilarElements m=new SimilarElements();
    
    Set<Integer> s=new HashSet<Integer>();
    Set<Integer> s1=new HashSet<Integer>();
    m.addi(s);
    m.addi(s1);
    s.retainAll(s1);
    Iterator it=s.iterator();
    System.out.println("Elements:");
    while(it.hasNext())
    {
     System.out.println(it.next()); 
    }

  }
}