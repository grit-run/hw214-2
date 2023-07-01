package app.model;

import org.springframework.stereotype.Component;

@Component
public class Dog extends Animal {

    private String voicing;

    public Dog(String voicing) {
        this.voicing = voicing;
    }

    void say() {
        System.out.println(voicing);
    }

    public String getVoicing() {
        return voicing;
    }

    public void setVoicing(String voicing) {
        this.voicing = voicing;
    }

    void voice() {
        System.out.println(voicing);
    }

    @Override
    public String toString() {
        return "Im a Dog";
    }
}
