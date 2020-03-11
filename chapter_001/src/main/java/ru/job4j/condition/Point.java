package ru.job4j.condition;
import static java.lang.Math.sqrt;
import static java.lang.Math.pow;

/**
 * Нахождение расстояния между точками
 */
public class Point {
    /**
     * Поля объекта, координаты точек
     */
    private int x;
    private int y;
    private int z;

    /**
     * Конструктор, принимает начальное состояние
     * @param x координата х
     * @param y координата у
     */
    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    /**
     * Конструктор, принимает начальное состояние
     * @param x координата х
     * @param y координата у
     * @param z координата z
     */
    public Point(int x, int y, int z) {
        this(x, y);
        this.z = z;
    }

    /**
     * Находит расстояние между точками на плоскости
     * @param that принимает другой объект Point
     * @return возвращает расстояние
     */
    public double distance(Point that) {
        return sqrt(pow(this.x - that.x, 2) + pow(this.y - that.y, 2));
    }

    /**
     * Находит расстояние между точками в пространстве
     * @param that принимает другой объект Point
     * @return возвращает расстояние
     */
    public double distance3d(Point that) {
        return sqrt(pow(this.x - that.x, 2) + pow(this.y - that.y, 2) + pow(this.z - that.z, 2));
    }
}
