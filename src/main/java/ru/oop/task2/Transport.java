package ru.oop.task2;

/**
 * Транспорт
 *
 * @author ArtakOvakimyan
 * @since 12.11.2024
 */
public interface Transport extends Positioned {
    /**
     * Доезжает к цели позиции и меняет позицию человека
     * @param destination место назначения
     */
    void goToNearestPosition(Position destination);
}
