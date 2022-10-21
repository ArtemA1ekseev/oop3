package Animals;

import java.util.Objects;

public final class Flying extends Birds{

    private String typeOfMovement;

    public Flying(String nickname, String livingEnvironment, String typeOfMovement) {
        this(nickname, 0, "defoult","defoult");
    }

    public Flying(String nickname, int age, String livingEnvironment, String typeOfMovement) {
        super(nickname, age, livingEnvironment);
        if (typeOfMovement != null && !typeOfMovement.isEmpty() && !typeOfMovement.isBlank()) {
            this.typeOfMovement = typeOfMovement;
        }
    }

    public String getTypeOfMovement() {
        return typeOfMovement;
    }

    public final void setTypeOfMovement(String typeOfMovement) {
        if (typeOfMovement != null && !typeOfMovement.isEmpty() && !typeOfMovement.isBlank()) {
            this.typeOfMovement = typeOfMovement;
        }
    }

    @Override
    public String go() {
        return "Полёт — основной способ передвижения большинства видов птиц, помогающий им искать пищу, мигрировать и спасаться от хищников.";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Flying flying = (Flying) o;
        return Objects.equals(typeOfMovement, flying.typeOfMovement);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), typeOfMovement);
    }

    @Override
    public String toString() {
        return "Класс " + "`" +  getClass() + "`" +  " " + getNickname() + ". " + getLivingEnvironment() + " Возраст птицы - " + getAge() + " года/лет. " + getTypeOfMovement() + " " +  go();
    }
}
