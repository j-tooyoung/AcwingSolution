public class Person {

    public Person() {
    }

    private PersonListener personListener;

    public void registerLister(PersonListener personListener) {
        this.personListener = personListener;
    }

    public void eat() {
        personListener.doEat(new Event(this));
    }

    public void slepp() {
        personListener.doSleep(new Event(this));
    }


}
