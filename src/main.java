public class main {

    public static void main(String[] args) {
        Person person = new Person();

        person.registerLister(new PersonListener() {
            @Override
            public void doEat(Event event) {
                System.out.println(event.getResource() + "吃饭了");
            }

            @Override
            public void doSleep(Event event) {
                System.out.println(event.getResource() + "吃饭了");
            }
        });
        person.eat();
    }
}
