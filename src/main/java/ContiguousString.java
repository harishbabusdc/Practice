import java.util.*;

public class ContiguousString {

    public static void main(String[] args)
    {
        String a="aaa";
        String b="acd";
        String c="effg";
        String d=a+b+c;
        Set resultset = new HashSet();
        for (int i =0;i<d.length();i++){
            resultset.add(new Character(d.charAt(i)));
        }
        String e="";
        for(Object stock : resultset){
            e+=stock;
        }
        char tempArray[] = d.toCharArray();
        Arrays.sort(tempArray);
        String f = new String(tempArray);

        System.out.println("string is "+e+" Value of "+d+"  Sorted Unique String "+f);
    }

    }
