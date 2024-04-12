package ru.oop.task3;

/**
 * Транспорт
 *
 * @author ArtakOvakimyan
 * @since 12.04.2024
 */
public interface Transport extends Positioned {
    /**
     * Доезжает к цели позиции и меняет позицию человека
     * @param destination место назначения
     */
    void goToNearestPosition(Position destination);
}
