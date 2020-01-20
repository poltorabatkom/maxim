public class MyClass
{
    public static void main(String[] args)
    {
//        Parrot n = new Parrot();
//        n.speak();
//        n.teach("Gosha wants a creacker");
//        n.speak();
//        n.speak();
//        n.teach("I'm a parrot!");
//        n.speak();

        ////2
//        Robot r = new Robot();
//        r.GetPosition();
//        r.GetDirektion();
//        r.forward();
//        r.forward();
//        r.rotateLeft();
//        r.forward();
//        r.forward();
//        r.rotateRight();
//        r.backward();
//        r.GetPosition();
//        r.rotateRight();
//        r.GetDirektion();

        //3
        Dishwasher d = new Dishwasher(5);
        d.start();
        d.addDishes("plate");
        d.addDishes("fork");
        d.addDishes("spoon");
        d.addDishes("bowl");
        d.getContent();
        d.getStatus();


        d.start();
        d.getStatus();
        d.addDishes("bowl");
        d.stop();
        d.getStatus();

        d.addDishes("bowl");
        d.empty();
        d.getContent();
        d.addDishes("bowl");
        d.getContent();
    }
}

