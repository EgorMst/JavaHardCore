package Marathon;

public class Main1
{
    public Main1()
    {
    }

    public static void main(String[] args) {
        Course c = new Course(new Cross(80), new Water(3), new Wall(5));
        Team team = new Team("Пирожки", new Human("Cat", "Билл", 200, 20, 2), new Cat("Анатолий"), new Dog("Григорий"));
        c.doIt(team);

        System.out.println("\nWinners:");
        team.passedTheDistance();

        System.out.println("\nResult:");
        team.showResults();
    }
}