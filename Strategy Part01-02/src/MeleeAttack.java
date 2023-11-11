public class MeleeAttack implements Attack{
    Monster attacker;

    public MeleeAttack(Monster attacker){
        this.attacker = attacker;
    }

    @Override
    public Integer attack(Monster target){
        String message = attacker + " uses melee attack on " + target;
        System.out.println(message);
        return null;
    }

}
