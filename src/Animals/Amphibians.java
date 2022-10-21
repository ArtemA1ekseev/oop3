package Animals;

import java.util.Objects;

public final class Amphibians extends Animals{

    private String livingEnvironment;

    public Amphibians(String nickname, String livingEnvironment) {
        this(nickname,  0, "в водной или наземной среде");
    }
    public Amphibians(String nickname, int age, String livingEnvironment) {
        super(nickname, age);
        if (livingEnvironment != null && !livingEnvironment.isEmpty() && !livingEnvironment.isBlank()) {
            this.livingEnvironment = livingEnvironment;
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

    @Override
    public String eat() {
        return "Взрослые земноводные — хищники. Они питаются насекомыми, червями, моллюсками.";
    };

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Amphibians that = (Amphibians) o;
        return Objects.equals(livingEnvironment, that.livingEnvironment);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), livingEnvironment);
    }

    @Override
    public String toString() {
        return "Класс " + "`" +  getClass() + "`" +  " " + getNickname() + ". " + getLivingEnvironment() + " Возраст животного - " + getAge() + " года/лет. " + " " +  eat();
    }
}
