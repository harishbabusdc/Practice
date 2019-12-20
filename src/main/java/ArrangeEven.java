import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ArrangeEven {
    public static void main(String[] args)
    {
        //First ArrayList
        ArrayList<Integer> arraylist1=new ArrayList<Integer>();

        arraylist1.add(2);
        arraylist1.add(3);
        arraylist1.add(1);

        //Second ArrayList
        ArrayList<Integer> arraylist2=new ArrayList<Integer>();
        arraylist2.add(5);
        arraylist2.add(6);
        arraylist2.add(4);


        //New ArrayList
        ArrayList<Integer> al= new ArrayList<Integer>();
        al.addAll(arraylist1);
        al.addAll(arraylist2);

        System.out.println(al);


        ArrayList<Integer> evenlist = new ArrayList<>();
        ArrayList<Integer> oddlist = new ArrayList<>();

        for(int i=0;i<al.size();i++){
            if (al.get(i)%2==0) {
                evenlist.add(al.get(i));
            }
            else {
                oddlist.add(al.get(i));
            }
        }

        System.out.println("Even List "+evenlist);
        System.out.println("Odd List "+oddlist);

        Collections.sort(evenlist);
        Collections.sort(oddlist);

        System.out.println("Even List "+evenlist);
        System.out.println("Odd List "+oddlist);

        ArrayList<Integer> sortedlist = new ArrayList<>();
        sortedlist.addAll(evenlist);
        sortedlist.addAll(oddlist);

        System.out.println("Sorted List "+sortedlist);

        //Displaying elements of the joined ArrayList
//        for(Integer temp: al){
//            System.out.println(temp);
//        }
    }
}
