import java.util.HashMap;
/**
 * Name: Melody Neely
 * Date: 3/5/23
 * Explanation:
 *  The purpose of the strategy for the Monster is to get used to bigger projects using heredity.
 *
 * */
public abstract class Monster {

    Integer hp;
    Integer xp = 10;
    Integer maxHP;
    HashMap<String, Integer> items;
    public Monster (Integer maxHP, Integer xp, HashMap<String, Integer> items){
        this.maxHP = maxHP;
        hp = this.maxHP;
        this.xp = xp;
        this.items = items;
    }

    public Integer getHp() {
        return hp;
    }

    public void setHp(Integer hp) {
        this.hp = hp;
    }

    public Integer getXp() {
        return xp;
    }

    public Integer getMaxHP() {
        return maxHP;
    }

    public HashMap<String, Integer> getItems() {
        return items;
    }

    public void setItems(HashMap<String, Integer> items) {
        this.items = items;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Monster monster = (Monster) o;

        if (getHp() != null ? !getHp().equals(monster.getHp()) : monster.getHp() != null) return false;
        if (getXp() != null ? !getXp().equals(monster.getXp()) : monster.getXp() != null) return false;
        if (getMaxHP() != null ? !getMaxHP().equals(monster.getMaxHP()) : monster.getMaxHP() != null) return false;
        return getItems() != null ? getItems().equals(monster.getItems()) : monster.getItems() == null;
    }

    @Override
    public int hashCode() {
        int result = getHp() != null ? getHp().hashCode() : 0;
        result = 31 * result + (getXp() != null ? getXp().hashCode() : 0);
        result = 31 * result + (getMaxHP() != null ? getMaxHP().hashCode() : 0);
        result = 31 * result + (getItems() != null ? getItems().hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "hp="+hp+"/"+ maxHP;
    }
}
