class Overload 
{

    static void print(){
    System.out.println("Assignment-5");
    }



    static void print(int a){
    System.out.println("Acadview"+a);
    }


    static void print(float a){
     System.out.println("Acadview"+a);
    }

    public static void main(String args[]){

        int a=10;
        float b=50;

           Overload.print();
          Overload.print(b);
        Overload.print(a);



    }



}