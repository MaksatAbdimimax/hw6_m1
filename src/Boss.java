public class Boss extends GameEntity {
    private Weapon weapon;  // Поле для хранения оружия босса

    // Конструктор
    public Boss(int health, int damage, Weapon weapon) {
        super(health, damage);  // Вызов конструктора родительского класса
        this.weapon = weapon;
    }

    // Геттер для оружия
    public Weapon getWeapon() {
        return weapon;
    }

    // Сеттер для оружия
    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }

    // Реализация метода printInfo для вывода информации о боссе
    public void printInfo() {
        System.out.println("Boss: Health=" + getHealth() + ", Damage=" + getDamage() + ", Weapon=" + weapon);
    }

}
