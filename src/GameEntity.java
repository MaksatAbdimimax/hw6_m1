public class GameEntity {
    private int health;  // Здоровье сущности
    private int damage;  // Урон, который сущность может нанести

    // Конструктор
    public GameEntity(int health, int damage) {
        this.health = health;
        this.damage = damage;
    }

    // Геттер для здоровья
    public int getHealth() {
        return health;
    }

    // Сеттер для здоровья
    public void setHealth(int health) {
        this.health = health;
    }

    // Геттер для урона
    public int getDamage() {
        return damage;
    }

    // Сеттер для урона
    public void setDamage(int damage) {
        this.damage = damage;
    }

    // Метод для отображения информации о сущности
    @Override
    public String toString() {
        return "GameEntity{health=" + health + ", damage=" + damage + '}';
    }
}
