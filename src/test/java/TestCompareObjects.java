public class TestCompareObjects {

    public static void testCompareObjects() {
        Object object1 = new Object();
        Object object2 = new Object();

        boolean result = CompareObjects.compare(object1, object2);
        System.out.println(result + " Так как сравнение ссылок на два разных объекта");

        boolean result2 = CompareObjects.compareToString(object1, object2);
        System.out.println(result2);

        boolean result3 = CompareObjects.compareHashCode(object1, object2);
        System.out.println(result3);

        Object object3 = new Object();
        Object object4 = object3;

        boolean result4 = CompareObjects.compare(object3, object4);
        System.out.println(result4 + " Полная копия ссылки на объект");

        object3 = "Строка";
        object4 = "Строка";
        boolean result5 = CompareObjects.compareToString(object3, object4);
        boolean result6 = CompareObjects.compareHashCode(object3, object4);
        System.out.println(result5 + " Сравнение строки");
        System.out.println(result6 + " Сравнение хэшкода");
    }
}
