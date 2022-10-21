package Animals;

import java.util.Objects;

public final class Herbivores extends Mammals{

    private String typeOfFood;

    public Herbivores(String nickname, String livingEnvironment, int speedMovement, String typeOfFood) {
        this(nickname, 0, "defoult", 3, "defoult");

    }

    public Herbivores(String nickname, int age, String livingEnvironment, int speedMovement, String typeOfFood) {
        super(nickname, age, livingEnvironment, speedMovement);
        if (typeOfFood != null && !typeOfFood.isEmpty() && !typeOfFood.isBlank()) {
            this.typeOfFood = typeOfFood;
        }
    }

    public String getTypeOfFood() {
        return typeOfFood;
    }

    public final void setTypeOfFood(String typeOfFood) {
        if (typeOfFood != null && !typeOfFood.isEmpty() && !typeOfFood.isBlank()) {
            this.typeOfFood = typeOfFood;
        }
    }

    @Override
    public String eat() {
        return "Растительноядные или травоядные – это животные, которые питаются пищей растительного происхождения, включая траву, фрукты, листья, корни, луковицы, овощи и т. д.";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Herbivores that = (Herbivores) o;
        return Objects.equals(typeOfFood, that.typeOfFood);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), typeOfFood);
    }

    @Override
    public String toString() {
        return "Класс " + "`" +  getClass() + "`" +  " " + getNickname() + ". " + getLivingEnvironment() + " Возраст животного - " + getAge() + " года/лет. Скорость передвижения: " + getSpeedMovement() + " км/ч. " + getTypeOfFood() + " " +  eat() + " " + sleep() + " " + go();
    }
}
