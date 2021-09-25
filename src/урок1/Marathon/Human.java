package урок1.Marathon;

public class Human implements Competitor
{

    String name;

    int maxRunDistance;
    int maxJumpHeight;
    int maxSwimDistance;

    boolean active;

    public Human(String cat, String name, int i2, int i1, int i)
    {
        this.name = name;
        this.maxRunDistance = 5000;
        this.maxJumpHeight = 30;
        this.maxSwimDistance = 200;
        this.active = true;
    }

    @Override
    public void run(int dist)
    {
        if (dist <= maxRunDistance)
        {
            System.out.println(name + " Пробежал!");
        }
        else
        {
            System.out.println(name + " Не пробежал!");
            active = false;
        }
    }

    @Override
    public void swim(int dist)
    {
        if (dist <= maxSwimDistance)
        {
            System.out.println(name + " Проплыл!");
        }
        else
        {
            System.out.println(name + " Не проплыл!");
            active = false;
        }
    }

    @Override
    public void jump(int height)
    {
        if (height <= maxJumpHeight)
        {
            System.out.println(name + " Прыгнул!");
        }
        else
        {
            System.out.println(name + " Не прыгнул!");
            active = false;
        }
    }

    @Override
    public boolean isOnDistance()
    {
        return active;
    }

    @Override
    public void info()
    {
        System.out.println(name + " " + active);
    }
}
