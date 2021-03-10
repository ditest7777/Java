package hw5;

public class hw5 {
    public static void main(String[] args){
       String win = "получилось";
       String loss = "не получилось";
       String eventName;
       String eventResult;

        Cat cat1 = new Cat("Барсик", 200, 0, 2);
        Dog dog1 = new Dog("Шарик", 500, 10,0.5f);
        Horse horse1 =new Horse("Яблоко", 1500, 100, 3);
        Bird bird1 = new Bird("Клювокрыл", 5, 0, 0.2f );



        Animal[] arr = {cat1, dog1, horse1, bird1};

        float jumpLength = 2.5f;
        float runLength = 250;
        float swimLength = 8;


        for (int i = 0; i < arr.length; i++) {
            String nameString = arr[i].getType() + " " + arr[i].getName() + " может ";
          eventName = "прыгнуть на " + arr[i].getMaxJump() + " м. Пытается прыгнуть на ";
            eventResult = (arr[i].jump(jumpLength)) ? win : loss;
            result(nameString, eventName, jumpLength, eventResult);

          eventName = "пробежать на " + arr[i].getMaxRun() + " м. Пытается пробежать на ";
            eventResult = arr[i].run(runLength) ? win : loss;
            result(nameString, eventName, runLength, eventResult);


            int swimResult = arr[i].swim(swimLength);
            eventName = "проплыть на " + arr[i].getMaxSwim() + " м. пытается проплыть на ";
            eventResult = (swimResult == Animal.swim_ok) ? win : loss;


            if (swimResult == Animal.swim_none)
            eventResult = " это не получилось, т.к. не умеет плавать";
            result(nameString, eventName, swimLength, eventResult);

        }

    }


    private static void result(String nameAnimal, String event, float eventLength, String resultEvent)
    {
        System.out.println(nameAnimal + event + eventLength + " м и " + resultEvent);
//
    }



}

