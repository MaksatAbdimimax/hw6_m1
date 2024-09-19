public class Main {
    public static void main(String[] args) {
        Weapon bossWeapon = new Weapon(WeaponType.STAFF, "Посох");

        // Создание первого экземпляра Skeleton
        Weapon skeletonWeapon1 = new Weapon(WeaponType.BOW, "Longbow");
        Skeleton skeleton1 = new Skeleton(300, 20, skeletonWeapon1, 10);

        // Создание второго экземпляра Skeleton
        Weapon skeletonWeapon2 = new Weapon(WeaponType.BOW, "Crossbow");
        Skeleton skeleton2 = new Skeleton(250, 15, skeletonWeapon2, 15);
        
        // Вывод информации о первом скелете
        skeleton1.printInfo();

        // Вывод информации о втором скелете
        skeleton2.printInfo();
    }
}
