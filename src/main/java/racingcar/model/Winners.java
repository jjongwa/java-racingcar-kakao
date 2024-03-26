package racingcar.model;

import java.util.List;
import java.util.stream.Collectors;

public class Winners {

    private static final String EMPTY_WINNER_MESSAGE = "우승자는 1명이상 존재해야 합니다.";

    private final List<Name> names;

    public Winners(final List<Name> winnerNames) {
        if (winnerNames.isEmpty()) {
            throw new IllegalArgumentException(EMPTY_WINNER_MESSAGE);
        }
        this.names = winnerNames;
    }

    public List<String> getNames() {
        return names.stream()
                .map(Name::getValue)
                .collect(Collectors.toUnmodifiableList());
    }
}
