import java.util.*;

public class Java13_ArrayList {
    public static void main(String[] args){
        ArrayList<Integer> l1 = new ArrayList<>();
        l1.add(6);
        l1.add(7);
        l1.add(8);
        l1.add(9);
        l1.add(4);
        l1.add(0,5);
        l1.add(0, 8);
        // l1.clear();
        // l1.remove(7);
        System.out.println(l1.indexOf(6));
        System.out.println(l1.contains(32));
        for(int i = 0; i<l1.size(); i++){
            System.out.println(l1.get(i));
        }
    }
}
