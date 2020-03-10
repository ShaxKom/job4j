package ru.job4j.condition;

/**
 * Расчёты с тругольником
 * @author Shakhzod Kamilov
 * @version 2
 */
public class TrgArea {
    private Point first;
    private Point second;
    private Point third;

    /**
     * Инициализирует поля
     * @param ap Координаты первой точки
     * @param bp Координаты второй точки
     * @param cp Координаты третьей точки
     */
    public TrgArea(Point ap, Point bp, Point cp) {
        this.first = ap;
        this.second = bp;
        this.third = cp;
    }

    /**
     * Периметр треуголника по заданным координатам точек
     * @return возвращает периметр
     */
    public double period() {
        return (first.distance(second) + second.distance(third) + third.distance(first)) / 2;
    }

    /**
     * Вычесляет площадь треугольника по заданным координатам точек
     * @return возвращает площадь или -1 в случае не существования треуголника
     */
    public double area() {
        double p = period();
        double a = first.distance(second);
        double b = second.distance(third);
        double c = third.distance(first);
        double rsl = -1;
        if (Triangle.exist(a, b, c)) {
            rsl = Math.sqrt(p * (p - a) * (p - b) * (p - c));
        }
        return rsl;
    }
}
