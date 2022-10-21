package Animals;

import java.time.LocalDate;
import java.util.Objects;

public abstract class Animals {

     private String nickname;
     private int birthYear;

     public Animals(String nickname) {
          this(nickname, 0);
     }

     public Animals(String nickname, int age) {
          setNickname(nickname);
          if (age >= 0) {
               this.birthYear = LocalDate.now().getYear() - age;
          } else {
               this.birthYear = LocalDate.now().getYear() - Math.abs(age);
          }
     }

     public String getNickname() {
          return nickname;
     }

     public final void setNickname(String nickname) {
          if (nickname != null && !nickname.isEmpty() && !nickname.isBlank()) {
               this.nickname = nickname;
          } else {
               this.nickname = "Животное";
          }

          this.nickname = nickname;
     }

     public int getAge() {
          return LocalDate.now().getYear() - birthYear;
     }

     public String eat() {
          return "Животные могут есть.";
     };

     public String sleep() {
          return "Животные могут спать.";
     }

     public String go() {
          return "Животные могут перемещаться.";
     };

     @Override
     public boolean equals(Object o) {
          if (this == o) return true;
          if (o == null || getClass() != o.getClass()) return false;
          Animals animals = (Animals) o;
          return birthYear == animals.birthYear && Objects.equals(nickname, animals.nickname);
     }

     @Override
     public int hashCode() {
          return Objects.hash(nickname, birthYear);
     }

     @Override
     public String toString() {
          return "Кличка животного: " + nickname + ", количество лет: " + birthYear + ".";
     }
}
