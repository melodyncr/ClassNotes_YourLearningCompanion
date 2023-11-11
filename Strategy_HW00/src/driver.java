import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
/**
 * Name: Melody Neely
 * Date: 2/26/23
 * Explanation:
 * The goal of the assigment is to learn how to convert code from a UML
 * while learnin how to create abstract and concrete classes. This helps
 * with being more familiar with establishing larger projects and understanding
 * how they work
 * */
public class driver {
    public static void main(String[] args) {
        HashMap<String,Integer> items = new HashMap<>();
        items.put("gold",5);
        List<Monster> monsters = new ArrayList<>();
        monsters.add(new Imp (15,20,items));
        monsters.add(new Kobold(1,5,items));

        for (Monster m: monsters) {
            System.out.println(m);
        }
    }
}
