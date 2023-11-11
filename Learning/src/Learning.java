import java.util.ArrayList;
import java.util.List;
/**
 * Name: Melody Neely
 * Date: 2/5/23
 * Explanation:
 *  This is a learning class using the Tests, Constructors, Getters and setters.
 *  In this project we get comfortable using tests and assertions
 *
 * */
public class Learning {
    private final String name;
    private Integer count;
    private final List<String> friends;

    public Learning(){
        name = "Melody";
        count = 1;
        friends = new ArrayList<>();
    }

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public String getName() {
        return name;
    }
}