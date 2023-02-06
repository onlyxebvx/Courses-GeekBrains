import java.lang.reflect.Field;
import java.util.*;

public class Main {
    public static void main(String[] args) throws  Exception {
        HashMap<Integer,String> hashMap=new HashMap<Integer, String>();
        for (int i=0;i<=5;i++){
            hashMap.put(i,"Egor");
        }
        System.out.println(hashMap);
        hashMap.put(4,"Maria");
        hashMap.put(2,"Andre");
        System.out.println(hashMap);
        System.out.println(hashMap.get(4));
        hashMap.remove(2);
        System.out.println(hashMap);
        hashMap.clear();
        Map<String, String> map = new HashMap<>(8);
        map.put("1","A");
        map.put("2","B");
        for (Map.Entry<String,String> o:map.entrySet())
        {
            System.out.println(o.getKey());
            System.out.println(o.getValue());
            System.out.println("---------");
        }

        List<String> list=new ArrayList<>(Arrays.asList("A","A","B","C","A","D"));
        Iterator<String> iter=list.iterator();
        while (iter.hasNext())
        {
            String o=iter.next();
            if(o.equals("A"))
            {
                iter.remove();
            }
        }
        System.out.println(list);
        Set<String> set=new HashSet<>();
        set.add("A");
        set.add("B");
        set.add("AA");
        set.add("BB");
        set.add("C");
        System.out.println(set);
        Iterator<String> iterSet=set.iterator();
        while (iterSet.hasNext())
        {
            String o=iterSet.next();
            if(o.length()>1){iterSet.remove();}
        }
        System.out.println(set);
    }

}