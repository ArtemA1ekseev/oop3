package Animals;

import java.util.Objects;

public final class Predators extends Mammals{

    private String typeOfFood;

    public Predators(String nickname, String livingEnvironment, int speedMovement, String typeOfFood) {
        this(nickname, 0, "defoult", 3, "defoult");

    }

    public Predators(String nickname, int age, String livingEnvironment, int speedMovement, String typeOfFood) {
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
        return "Питающиеся разнообразными позвоночными, и свою потребность в мясе они покрывают за счёт охоты или питания падалью. У многих мелких хищных (а иногда и у более крупных — например, у медведя-губача) значительную часть рациона составляют беспозвоночные.";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Predators predators = (Predators) o;
        return Objects.equals(typeOfFood, predators.typeOfFood);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), typeOfFood);
    }

    @Override
    public String toString() {
        return "Класс " + "`" +  getClass() + "`" +  " " + getNickname() + ". " + getLivingEnvironment() + " Возраст животного - " + getAge() + " года/лет. Скорость передвижения: " + getSpeedMovement() + " км/ч. " + getTypeOfFood() + " " +  eat();
    }
}
