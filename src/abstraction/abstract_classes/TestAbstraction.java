package abstraction.abstract_classes;

import java.util.ArrayList;
import java.util.List;

public class TestAbstraction {
    public static void main(String[] args) {

        Samsung s1 = new Samsung("Samsung", "Black", 64, 700);
        Nokia n1 = new Nokia("Nokia", "Blue", 4, 100);
        Iphone i1 = new Iphone("Apple", "Silver", 128, 1000);

        List<Phone> phones = new ArrayList<>();
        phones.add(s1);
        phones.add(n1);
        phones.add(i1);

        for (Phone element : phones){
            System.out.println(element);
        }

        int price = Integer.MIN_VALUE;
        Phone max = null;
        for (Phone element : phones){
            if (element.price > price) max = element;
        }
        System.out.println("The most expensive phone is = " + max.getClass().getSimpleName());

        int conv = 0;
        for (Phone element : phones){
            if (element.isConvertible()) conv++;
        }
        System.out.println(conv);




    }
}
