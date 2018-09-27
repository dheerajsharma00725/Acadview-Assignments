import java.util.*;
class Map1
{
    public static void main(String []args)
  {
    int a;
    HashMap hm=new HashMap();
    hm.put("Harry",1);
    hm.put("Dheeraj",2);
    hm.put("Manish",3);
    hm.put("Honey",4);
    Set set=hm.entrySet();
    Iterator it=set.iterator();
    System.out.println("elements and keys:");
    while(it.hasNext())
    {
      Map.Entry mr=(Map.Entry)it.next();
     System.out.print(mr.getKey()+" : ");
     System.out.println(mr.getValue());

    }

  }
}