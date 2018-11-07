import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class IteratorTest
{
    public static void main(String[] args)
    {
        List<String> list = Arrays.asList("ob1", "ob2", "ob3");

        Iterator it = list.iterator();

        while (it.hasNext())
            System.out.println(it.next());

        List<String> list2 = new ArrayList<>();

        if(list2.isEmpty())
            System.out.println("empty");

        list2.stream();
    }
}

