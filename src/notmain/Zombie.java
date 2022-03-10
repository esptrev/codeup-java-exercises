package notmain;

public class Zombie {

    private int hp;
    private int attackDamage;

    public Zombie(int hp, int attackDamage) {
        this.hp = hp;
        this.attackDamage = attackDamage;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }
    public int getAttackDamage(){
        return attackDamage;
    }

    public void attack(){
        System.out.println("eat brains");
    }
}
