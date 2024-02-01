//import java.util.*;

// ArrayList
//class Main {
//
//    // Main Method
//    public static void main(String[] args)
//    {
//
//        ArrayList<Integer> al = new ArrayList<Integer>();
//
//        for (int i = 1; i <= 5; i++)
//            al.add(i);
//
//        System.out.println(al);
//
//        al.remove(3);
//
//        System.out.println(al);
//
//        for (int i = 0; i < al.size(); i++)
//            System.out.print(al.get(i) + " ");
//    }
//}


// stack
//public class Main {
//
//    public static void main(String args[])
//    {
//        Stack<String> st = new Stack<String>();
//        st.push("Eat");
//        st.push("Code");
//        st.push("Sleep");
//        st.push("Code1");
//
//        Iterator<String> it = st.iterator();
//
//
//        while (it.hasNext()) {
//            System.out.print(it.next() + " ");
//        }
//
//        System.out.println();
//
//        st.pop();
//
//        it = st.iterator();
//
//        // Printing the stack
//        while (it.hasNext()) {
//            System.out.print(it.next() + " ");
//        }
//    }
//}


// Priority Queue
//class Main {
//
//    public static void main(String args[])
//    {
//
//        PriorityQueue<Integer> pq
//                = new PriorityQueue<Integer>();
//
//        pq.add(10);
//        pq.add(20);
//        pq.add(15);
//
//
//        System.out.println(pq.peek());
//
//        System.out.println(pq.poll());
//
//        System.out.println(pq.peek());
//    }
//}


// HashSet
//public class Main {
//
//    public static void main(String args[])
//    {
//
//        HashSet<String> hs = new HashSet<String>();
//
//        hs.add("Code1");
//        hs.add("Code2");
//        hs.add("Code3");
//        hs.add("Code1");
//        hs.add("Code1");
//
//        Iterator<String> it = hs.iterator();
//        while (it.hasNext()) {
//            System.out.println(it.next());
//        }
//    }
//}


// HashMap
import java.util.HashMap;

//public class Main {
//    public static void main(String[] args) {
//
//
//        HashMap<String, Integer> people = new HashMap<String, Integer>();
//
//        people.put("John", 32);
//        people.put("Virat", 30);
//        people.put("Rohit", 33);
//
//        for (String i : people.keySet()) {
//            System.out.println("key: " + i + " value: " + people.get(i));
//        }
//    }
//}


import java.util.*;
public class Main{
    public static void main(String[] args){
        ArrayList<Integer> al = new ArrayList<Integer>();

        for (int i = 1; i <= 5; i++)
            al.add(i);

        System.out.println(al);

        al.remove(3);

        System.out.println(al);

        for (int i = 0; i < al.size(); i++)
            System.out.println(al.get(i) + " ");
    }
}




