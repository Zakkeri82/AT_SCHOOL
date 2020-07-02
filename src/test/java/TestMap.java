
import java.util.HashMap;

public class TestMap {

    public static void testMap() {

        int result = Map.countElementsInMap("Дмитров", "Алексей");
        if (result == 1) {
            System.out.println("Дмитров Алексей - " + "Совпадений " + result + " Результат " + " " + true);
        } else {
            System.out.println("Дмитров Алексей - " + "Совпадений " + result + " Результат " + " " + false);
        }

        // Другая проверка

        int result2 = Map.countElementsInMap("Андреев", "Андрей");
        if (result2 == 2) {
            System.out.println("Андреев Андрей - " + "Совпадений " + result2 + " Результат " + " " + true);
        } else {
            System.out.println("Андреев Андрей - " + "Совпадений " + result2 + " Результат " + " " + false);
        }

        // Еще один тестик

        int result3 = Map.countElementsInMap("Ерохин", "Сергей");
        if (result3 == 3) {
            System.out.println("Ерохин Сергей - " + "Совпадений " + result3 + " Результат " + " " + true);
        } else {
            System.out.println("Ерохин Сергей - " + "Совпадений " + result3 + " Результат " + " " + false);
        }

        //Проверка метода на удаление
        System.out.println("");
        HashMap<String, String> map = new HashMap<String, String>();
        map.put("Дмитров", "Алексей");
        map.put("Ерохин", "Сергей ");
        map.put("Ярмолов", "Алексей");
        map.put("Карасев ", "Дмитрий");
        map.put(" Ерохин", "Сергей");
        map.put("Андреев ", "Андрей ");
        map.put("Смирнов", "Владимир");
        map.put("Ерохин ", "Сергей");
        map.put("Андреев", "Андрей");

        System.out.println("Удаляем всех Алексеев");
        HashMap<String, String> resultMap = Map.deleteValueFromMap(map, "Алексей");

        for (HashMap.Entry<String, String> ent : resultMap.entrySet()) {
            System.out.println(ent.getKey() + " " + ent.getValue());
            }
        System.out.println("");
        System.out.println("Удаляем всех Сергеев");
        HashMap<String, String> resultMap2 = Map.deleteValueFromMap(map, "Сергей");

        for (HashMap.Entry<String, String> ent : resultMap2.entrySet()) {
            System.out.println(ent.getKey() + " " + ent.getValue());
        }
    }
}
