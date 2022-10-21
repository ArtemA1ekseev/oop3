package Animals;

import java.util.Objects;

public abstract class Birds extends Animals{

    private String livingEnvironment;

    public Birds(String nickname, String livingEnvironment) {
        this(nickname, 0, "Наземно - воздушная среда");
    }

    public Birds(String nickname, int age, String livingEnvironment) {
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
        return "Растительноядных – птицы, которые питаются частями растения и их нектаром;" +
                " Животноядных птиц – птицы, которые питаются частями животных и насекомых; - птиц со смешанным питанием.";
    };

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Birds birds = (Birds) o;
        return Objects.equals(livingEnvironment, birds.livingEnvironment);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), livingEnvironment);
    }

    @Override
    public String toString() {
        return "Птицы: " + " Среда проживания - " + livingEnvironment + ".";
    }
}

