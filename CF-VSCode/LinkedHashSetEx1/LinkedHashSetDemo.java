import java.util.LinkedHashSet;

class Test{
    public static void main(String[] args) {
        LinkedHashSet<Integer> eids=new LinkedHashSet<Integer>();
        eids.add(101);
        eids.add(102);
        eids.add(103);
        eids.add(null);
        eids.add(104);
        System.out.println(eids);
    }
}