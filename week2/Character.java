package week2;
import java.util.Random;

public class Character 
{
    protected String nama;
    protected int level = 1;
    protected int hp = 50;   
    protected int exp = 0;

    Random r = new Random();
    int randomedHp = r.nextInt((hpMod(level)/50) - (hpMod(level)/100) + 1) + hpMod(level)/100;

    public Character()
    {
        this.nama = "Zidane";
    }

    public Character(String nama, int level, int hp, int exp)
    {
        this.nama = nama;
        this.level = level;
        this.hp = hp;
        this.exp = exp;
    }

    private int hpMod(int level)
    {
       if (level == 1) {
            return 250;
       }
       else {
            return 200 + (level * 50) + (level * 6 + 2);
       }
    }

    public void setData(String nama)
    {
        this.nama = nama;
    }

    public void attack()
    {
        System.out.println(this.nama + " menyerang lawan");
        expUp();
    }

    public String getNama()
    {
        return this.nama;
    }

    public int getHp()
    {
        return this.hp;
    }

    public void attacked()
    {
        this.hp -= this.randomedHp;
    }

    public void minumRamuan()
    {
        this.hp += 1;
    }

    public void levelUp()
    {
        int expRequired = this.level * 5;
        if (this.exp >= expRequired) {
            this.exp -= expRequired;
            this.level++;
            System.out.println("Selamat! " + this.nama + " naik ke level " + this.level);
        }
    }

    public void expUp()
    {
        this.exp += 1;
        levelUp();
    }

    public int getLevel()
    {
        return this.level;
    }

    public int getExp()
    {
        return this.exp;
    }
}
