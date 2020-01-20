public class Dishwasher
{
    static int MaxCountDishes;
    static int CountDishes;
    String[] masDishes;
    static boolean Status;

    //проверка останавливалась ли машина
    static boolean StopStat;


    Dishwasher(int CountDishes)
    {
        this.MaxCountDishes = CountDishes;
        masDishes  = new String[CountDishes];
    }


    public void start()
    {
        if(EmptyMas(masDishes))
        {
            System.out.println("Can't start; add some dishes first!");
            return;
        }
        if(Status !=true)
            Status = true;

    }

    public void stop()
    {
        if(Status == true)
            Status = false;
        StopStat = true;
    }

    public void addDishes(String ElementDishes)
    {
        if(CountDishes==MaxCountDishes)
        {
            System.out.println("Can't add dishes; max dishes count is reached!");
            return;
        }
        if(Status==true)
        {
            System.out.println("Can't add dish during cycle!");
            return;
        }

        if(StopStat==true)
        {
            System.out.println("You can't add dirty dishes to the clean ones!");
            return;
        }

        masDishes[CountDishes] = ElementDishes;
        CountDishes++;
    }

    public void getContent()
    {
        if(EmptyMas(masDishes))
        {
            System.out.println("[]");
            return;
        }

        for(String element : masDishes)
            if(element!=null)
                System.out.println(element);
    }

    public void getStatus()
    {
        if(Status==true)
            System.out.println("in progress!");
        else
        {
            System.out.println("clean");
        }
    }

    public void empty()
    {
        for (int i = 0; i < masDishes.length; i++) {
            masDishes[i] = null;
        }
        StopStat = false;
    }

    //проверка массива на пустоту
    boolean EmptyMas(String[] mas)
    {
        int EmptyCount = 0;
        for(String element : mas)
            if(element==null)
                EmptyCount++;
        if(mas.length==EmptyCount)
            return true;
        else
            return false;
    }
}
