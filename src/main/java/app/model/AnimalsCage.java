package app.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class AnimalsCage {

    private Animal animalOne;
    private Animal animalTwo;
    private Timer time;

    @Autowired
    public AnimalsCage(@Qualifier("cat") Animal animalOne, @Qualifier("dog") Animal animalTwo,
                       @Qualifier("time") Timer time) {
        this.animalOne = animalOne;
        this.animalTwo = animalTwo;
        this.time = time;
    }

    @Autowired
    private Timer timer;

    public Timer getTimer() {
        return timer;
    }

    public void whatAnimalSay() {
        System.out.println("Say:");
        System.out.println(animalOne.toString() + ", " + animalTwo.toString());
        System.out.println("At:");
//        System.out.println(new Timer().getTime());
        System.out.println(time.getTime() + "  should be the same time");
        System.out.println("________________________");
    }
}
