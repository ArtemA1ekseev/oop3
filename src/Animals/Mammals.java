package Animals;

import java.util.Objects;

public abstract class Mammals extends Animals{

    private String livingEnvironment;
    private int speedMovement;

    public Mammals(String nickname, String livingEnvironment, int speedMovement) {
        this(nickname, 0, "наземной, воздушной, почвенной и водной", 3);
    }

    public Mammals(String nickname, int age, String livingEnvironment, int speedMovement) {
        super(nickname, age);
        if (livingEnvironment != null && !livingEnvironment.isEmpty() && !livingEnvironment.isBlank()) {
            this.livingEnvironment = livingEnvironment;
        }
        if (speedMovement < 0) {
            this.speedMovement = 3;
        } else {
            this.speedMovement = speedMovement;
        }
    }

    public String getLivingEnvironment() {
        return livingEnvironment;
    }

    public final void setLivingEnvironment(String livingEnvironment) {
        if (livingEnvironment != null && !livingEnvironment.isEmpty() && !livingEnvironment.isBlank()) {
            this.livingEnvironment = livingEnvironment;
        }
    }

    public int getSpeedMovement() {
        return speedMovement;
    }

    public final void setSpeedMovement(int speedMovement) {
        if (speedMovement < 0) {
            this.speedMovement = 3;
        } else {
            this.speedMovement = speedMovement;
        }
    }

    @Override
    public String go() {
        return "Млекопитающие ведущие полуводный образ жизни имеют на лапах перепонки, могут перемещаться как на суше так и в вводе.";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Mammals mammals = (Mammals) o;
        return speedMovement == mammals.speedMovement && Objects.equals(livingEnvironment, mammals.livingEnvironment);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), livingEnvironment, speedMovement);
    }

    @Override
    public String toString() {
        return "Млекопитающие: " +
                "Среда проживания: " + livingEnvironment +
                ", скорость перемещения: " + speedMovement + ".";
    }
}
