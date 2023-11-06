package dto;

import java.util.List;

public class Lotto {
    private final List<Integer> numbers;

    public Lotto(List<Integer> numbers) {
        validate(numbers);
        this.numbers = numbers;
    }

    private void validate(List<Integer> numbers) {
        if (numbers.size() != 6) {
            throw new IllegalArgumentException();
        }
    }

    public void showLottoNumbers(){
        System.out.print("[");
        for (int i = 0; i < 5; i++) {
            System.out.print(numbers.get(i) + ", ");
        }
        System.out.println(numbers.get(5) + "]");

    }

    // TODO: 추가 기능 구현
}