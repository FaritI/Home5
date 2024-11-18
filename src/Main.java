public class Main {
    public static void main(String[] args) {
        Boss boss = new Boss();
        boss.setHealth(500);
        boss.setDamage(70);
        boss.setDefenseType("Магический щит");


        System.out.println("Босс:");
        System.out.println("Здоровье: " + boss.getHealth());
        System.out.println("Урон: " + boss.getDamage());
        System.out.println("Тип защиты: " + boss.getDefenseType());

        Hero[] heroes = createHeroes();
        System.out.println("\nГерои:");
        for (Hero hero : heroes) {
            System.out.println("Здоровье: " + hero.getHealth() +
                    ", Урон: " + hero.getDamage() +
                    ", Суперспособность: " + hero.getSuperAbility());
    }
}
    public static Hero[] createHeroes() {
        Hero hero1 = new Hero(200, 30, "Огненный шар");
        Hero hero2 = new Hero(180, 25);
        Hero hero3 = new Hero(220, 35, "Ледяная стрела");

        // Помещаем героев в массив
        Hero[] heroes = {hero1, hero2, hero3};
        return heroes;
    }
}
