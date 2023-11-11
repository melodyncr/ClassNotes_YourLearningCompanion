/**
 * Name: Melody Neely
 * Date: 2/5/23
 * Explanation:
 *  This is a Easy class using the Tests, Constructors, Getters and setters.
 *  In this project we get comfortable using tests and assertions. With getName
 *  The program tests if it is similar to the one that is set in the setup test.
 *  Similar tests are ran through the Count and Score test.
 *
 * */
public class EasyClass {
    private String name;
    private Integer count;
    private Double score;


    public EasyClass(String name, Integer count, Double score) {
        this.name = name;
        this.count = count;
        this.score = score;
    }

    public EasyClass(String name, Double score) {
        this.name = name;//name = "Melody"; here?
        this.score = 1.0;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public Double getScore() {
        return score;
    }

    public void setScore(Double score) {
        this.score = score;
    }
}
