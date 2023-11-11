public class Lab00 {
    private float score = 6*7;
    private String name = "General Kenobi";

    public static void main(String[] args) {
        System.out.println("The answer is 42");
        Lab00 Lab00 = new Lab00();
        System.out.println(Lab00);
    }

    public float getScore() {
        return score;
    }

    public void setScore(float score) {
        this.score = score;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Lab00{" +
                "score=" + score +
                ", name='" + name + '\'' +
                '}';
    }
}
