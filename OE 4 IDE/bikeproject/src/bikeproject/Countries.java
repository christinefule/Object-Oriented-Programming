package bikeproject;


import java.util.*; 

public class Countries { 

   public static void main(String[] args) { 
       // TODO Auto-generated method stub 
       HashSet<String> country = new HashSet<String>(); 

       country.add("Philippines"); 
       country.add("Korea"); 
       country.add("Japan"); 
       country.add("Canada"); 
       country.add("Netherlands"); 
       country.add("Spain"); 
       country.add("Canada"); 

       Iterator<String> it = country.iterator(); 
       while (it.hasNext()) { 
           System.out.println(it.next()); 
       } 

   } 

}