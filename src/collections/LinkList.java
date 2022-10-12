package collections;

import java.util.LinkedList;

public class LinkList {

    public static void main(String[] args) {
        LinkedList<String> shapes = new LinkedList<String>();
        shapes.add("Square");
        shapes.add("Triangle");
        shapes.add("Rectangular");
        shapes.add("Diamond");
        shapes.add("Star");
        shapes.add("Octagon");
        shapes.add("Hexagon");
        System.out.println(shapes);
        shapes.remove("Triangle");
        System.out.println(shapes);
        shapes.remove(2);
        System.out.println(shapes);
        shapes.add(" ");
        System.out.println(shapes);

        shapes.add("Triangle");
        System.out.println(shapes);
        System.out.println(shapes.get(1));
        shapes.set(0, "Octagon");
        System.out.println(shapes);

        System.out.println(shapes.contains("Star"));
        System.out.println(shapes.contains("Oval"));


    }
}