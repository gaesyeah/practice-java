import java.util.ArrayList;
import java.util.List;
import java.util.StringJoiner;

public class Ex2 {
  public static void fibonacci(int number){
    List<Integer> sequence = new ArrayList<>();

    if (number >= 1) {
        sequence.add(1);
    }
    if (number >= 2) {
        sequence.add(1);
    }

    for (int i = 2; i < number; i++) {
        int nextNumber = sequence.get(i - 1) + sequence.get(i - 2);
        sequence.add(nextNumber);
    }

    StringJoiner sequenceJoiner = new StringJoiner(" ");
    sequence.forEach(num -> sequenceJoiner.add(String.valueOf(num)));

    System.out.println(sequenceJoiner);
  }
}
