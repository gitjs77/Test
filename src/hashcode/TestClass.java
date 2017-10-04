package hashcode;

import java.lang.reflect.Field;
import java.util.*;
import java.util.stream.Collectors;

/**
 * @Author Jack <e.kobets>
 */
public class TestClass {

    private String field = "Hi";
    private Integer field2;
    private Integer field3;
    private Integer field4;

    public String getField() {
        return field;
    }

    public void method() {
        List<String> list = new ArrayList<>();
        list.add("private Integer field2");
        list.add("private Integer field3");

        String[] array = list.stream()
                .flatMap((p) -> Arrays.asList(p.split("\\s+"))//разбитькаждый элемент листа по на составляющие про более 2 пробелам
                        .stream()//запустить новый стрим
                        .filter(i -> !i.equals("class")))//откинуть сожержащие слово  "class"
                .toArray(String[]::new);//перекрутить в массив String[]
        Arrays.stream(array).forEach(System.out::println);

        System.out.println("======================");
        List<String> fromStringArray = Arrays.stream(array).collect(Collectors.toList());
        fromStringArray.forEach(System.out::println);

    }

    public static void main(String[] args) throws NoSuchFieldException {
        new TestClass().method();

//        final Integer[] var = {7};
//        JButton button = new JButton();
//        button.addActionListener(e ->
//                var[0] += 7);
//
//
//        Integer varOuter = 7;
//        List<Integer> integerList = Arrays.asList(7);
//        integerList = integerList.stream()
//                .map(i -> i + varOuter)
//                .collect(Collectors.toList());
//        integerList.forEach(i -> System.out.println(i + varOuter));

//        System.out.println(new TestClass().createTableTittlesByClassFields(TestClass.class));

        System.out.println(new TestClass().createTableByAllClassFields(new TestClass()));

//        System.out.println(TestClass.class.getDeclaredField("field"));
    }

    public List<String> createTableTittlesByClassFields(final Class clazz){

        Field[] fields = clazz.getDeclaredFields();
        return
                Arrays.stream(fields)
                        .map(i -> i.getName().substring(0,1).toUpperCase() + i.getName().substring(1) + ":")
                        .collect(Collectors.toList());

    }

    private Map<String, String> createTableByAllClassFields(final TestClass entity) {

        return Arrays.stream(entity.getClass().getDeclaredFields())
                .collect(
                        Collectors.toMap(
                                field -> field.getName().substring(0, 1).toUpperCase() + field.getName().substring(1) + ":",//creates kay
                                field -> getDeclaredFieldValue(field.getName(), entity),//get field value
                                (oldValue, newValue) -> oldValue,//if map have duplicates key - use first value by this kay
                                LinkedHashMap::new // generates LinkedHashMap for save additional order
                        )
                );
    }

    private static String getDeclaredFieldValue(final String fieldName, final TestClass entity) {

        Object fieldValue = null;
        try {
            fieldValue = entity.getClass().getDeclaredField(fieldName).get(entity);
        } catch (NoSuchFieldException | IllegalAccessException e) {
            e.printStackTrace();
        }

        return fieldValue == null ? "null" : fieldValue.toString();
    }
}