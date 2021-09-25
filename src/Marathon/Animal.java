package Marathon;

public class Animal implements Competitor
{

    String type;
    String name;

    int maxRunDistance;
    int maxJumpHeight;
    int maxSwimDistance;

    boolean onDistance;

    public Animal(String type)
    {
        this.type = type;
        this.name = name;
        this.maxRunDistance = maxRunDistance;
        this.maxJumpHeight = maxJumpHeight;
        this.maxSwimDistance = maxSwimDistance;
        this.onDistance = true;
    }

    @Override
    public void run(int dist)
    {
        if (dist <= maxRunDistance)
        {
            System.out.println(type + " " + name + " Пробежал!");
        }
        else
        {
            System.out.println(type + " " + name + " Не пробежал!");
            onDistance = false;
        }
    }

    @Override
    public void swim(int dist)
    {
        if (dist <= maxSwimDistance)
        {
            System.out.println(type + " " + name + " Проплыл!");
        }
        else
        {
            System.out.println(type + " " + name + " Не проплыл!");
            onDistance = false;
        }
    }

    @Override
    public void jump(int height)
    {
        if (height <= maxJumpHeight)
        {
            System.out.println(type + " " + name + " Прыгнул!");
        }
        else
        {
            System.out.println(type + " " + name + " Не прыгнул!");
            onDistance = false;
        }
    }

    @Override
    public boolean isOnDistance() {
        return onDistance;
    }

    @Override
    public void info() {
        System.out.println(type + " " + name + " " + onDistance);
    }
}