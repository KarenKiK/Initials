package ru.itpark.service;

public class InitialsService {
    public String getInitials(String name) {
        // TDD:
        // Red - находим такой сценарий, при котором наш тест падает
        // Green - пишем код, который делает тест зелёным
        // Refactor - после того, как всё работает, можем наводить красоту
        String parts[] = name.split(" ");

        if (parts.length == 1) {
            return parts[0].substring(0, 1);
        }

        String firstLetter = parts[0].substring(0, 1);
        String secondLetter = parts[1].substring(0, 1);

        return firstLetter + secondLetter; // + для String поддерживается
    }
}
