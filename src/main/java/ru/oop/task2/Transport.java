package ru.oop.task2;

public interface Transport extends Positioned {
    /**
     * Доезжает к цели позиции и меняет позицию человека
     * @param destination место назначения
     */
    void goToNearestPosition(Position destination);
}
