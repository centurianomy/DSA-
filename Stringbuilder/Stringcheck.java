//Stringbuilder is a class used to create mutable string objects. save memory & improve performance.

public class Stringcheck {
    public static void main(String args[]){
    StringBuilder sb = new StringBuilder();
        for(int i = 1; i <= 5; i++) {
            sb.append(i);
        }
        System.out.println(sb);
    }
}

/*Note: using string =builder
        the same object is being modified internally rather than creating a new String each time.
        although output is same for both the codes*/

/* public class Stringcheck {
    public static void main(String args[]){
    //StringBuilder sb = new StringBuilder();
        String sb="";
        for(int i = 1; i <= 5; i++) {
            sb=sb+i;
            //sb.append(i);
        }
        System.out.println(sb);
    }
}*/