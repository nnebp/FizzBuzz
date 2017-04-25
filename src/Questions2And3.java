import java.util.*;

public class Questions2And3 {

    public static void main(String [] args) {
        Question2();
        Question3();
    }

    public static void Question2(){
        //Part 1
        Set<Integer> set1 = new HashSet<Integer>();
        Set<Integer> set2= new HashSet<Integer>();

        for (int i = 1; i <= 10; i++) {
            set1.add(i);
        }
        for (int i = 6; i <= 15; i++) {
            set2.add(i);
        }

        System.out.println(Arrays.toString(set1.toArray()) + " size: " + set1.size());
        System.out.println(Arrays.toString(set2.toArray()) + " size: " + set2.size());

        //Part 2
        TreeSet<Integer> treeSet = new TreeSet<Integer>(); //TreeSet is sorted
        treeSet.addAll(set1);
        treeSet.addAll(set2);
        treeSet.remove((treeSet.size()/2) + 1);

        //use descending set rather than iterate backwards
        System.out.println(Arrays.toString(treeSet.descendingSet().toArray()) + " size: " + treeSet.size());

        //Part3
        /*"key/value pair" makes me think hashmap. I could have used a hashtable but
         ,from my understanding, a hashmap is better for a single treaded program. */

        HashMap<Integer, String> hashMap = new HashMap<Integer, String>();

        for (int i = 0; i < 5; i++) {
            hashMap.put(i, String.valueOf(i));
        }

        //Not totally sure if I interpreted this bullet and sub bullet 100% correctly
        if (hashMap.containsKey(0) && hashMap.get(0).equals("0")) {
                System.out.println("duplicate key/value pair 0/0");
        } else {
            hashMap.put(0, "0");
        }

        System.out.println(hashMap.toString() + " size: " + hashMap.size());


    }

    public static void Question3() {

        for (int i = 1; i <= 5; i++) {

            String dots = new String(new char[5 - i]).replace('\0', '.');
            String nums = new String(new char[i]).replace('\0', (char) (i + 48) );

            System.out.println(dots + nums);

        }

        /*How would you rewrite this for the nth number instead of ending at 5?
        You would need to add extra .'s depending on how many digits are in n and i (and of course don't add 48
        to the value of i to get the ascii value of the digit char)
        */
    }

}
