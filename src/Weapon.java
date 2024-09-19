public class Weapon {
    private WeaponType type;  // Поле для хранения типа оружия
    private String name;      // Поле для хранения названия оружия

    // Конструктор
    public Weapon(WeaponType type, String name) {
        this.type = type;
        this.name = name;
    }

    // Геттер для типа оружия
    public WeaponType getType() {
        return type;
    }

    // Сеттер для типа оружия
    public void setType(WeaponType type) {
        this.type = type;
    }

    // Геттер для названия оружия
    public String getName() {
        return name;
    }

    // Сеттер для названия оружия
    public void setName(String name) {
        this.name = name;
    }

    // Переопределение метода toString для удобного вывода информации об оружии
    @Override
    public String toString() {
        return "Weapon{name='" + name + "', type=" + type + '}';
    }
}
