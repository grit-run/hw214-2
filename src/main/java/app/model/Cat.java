package app.model;

import org.springframework.stereotype.Component;

@Component
public class Cat extends Animal {
    private String voicing;

    public Cat(String voicing) {
        this.voicing = voicing;
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
        return "Im a Cat";
    }
}
