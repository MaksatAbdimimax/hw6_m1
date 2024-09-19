public class Skeleton extends Boss {
    private int arrowCount;  // Поле для хранения количества стрел

    // Конструктор
    public Skeleton(int health, int damage, Weapon weapon, int arrowCount) {
        super(health, damage, weapon);  // Вызов конструктора родительского класса (Boss)
        this.arrowCount = arrowCount;   // Инициализация поля arrowCount
    }

    // Геттер для количества стрел
    public int getArrowCount() {
        return arrowCount;
    }

    // Сеттер для количества стрел
    public void setArrowCount(int arrowCount) {
        this.arrowCount = arrowCount;
    }

    // Переопределение метода printInfo для вывода информации о скелете
    @Override
    public void printInfo() {
        System.out.println("Skeleton: Health=" + getHealth() +
                ", Damage=" + getDamage() +
                ", Weapon=Weapon{name='" + getWeapon().getName() +
                "', type=" + getWeapon().getType() +
                "}, Arrows=" + arrowCount);
    }

}
