package education_base;

import java.util.Objects;

/**
 * Бизнес задача.
 * Создать класс для описания визитной карточки человека.
 * У человека есть имя, фамилия и номер телефона.
 */

/**
 * Класс - это абстракция от сущности в реальном мире, к сущности внутри программы.
 * В реальном мире визитная карточка имеет очень много свойств, но нам по бизнес - задаче достаточно описать три: имя, фамилия и номер телефона.
 * Класс состоит из имени класса, полей класса и методов класса.
 *
 * Создадим класс с именем BusinessCard.
 */
public class BusinessCard {

    // Опишем необходимые поля: name, secondName, phone внутри класса BusinessCard
    /**
     * Person name
     */
    public String name;
    /**
     * Person second name
     */
    public String secondName;
    /**
     * Person phone
     */
    public String phone;

    // Создадим конструторы класса
    /**
     * Конструктор по умолчанию класса BusinessCard. Для декларации конструктора используется такое же имя как и его класса с учетом регистра.
     * Данный тип констурктора служит для инициализации объекта без передачи ему каких - то данных.
     * Данный конструктор есть всегда, даже если его явно не писать. В случае если у класса есть констуркторы, куда передаются данные,
     * то конкруктор по умолчанию должен быть явно наисан.
     * TODO Заведите за правило, что конструктор по умолчанию нужно писать всегда. Это избавит от множества проблем в будущем.
     *
     * Создание объекта класса BusinessCard с помощью конструктора по умолчанию:
     * BusinessCard businessCard = new BusinessCard();
     */
    public BusinessCard() {
    }

    /**
     * Конструктор класса BusinessCard, в который передаются данные: name и secondName.
     * Последовательность передаваемых данных имеет значение.
     *
     * Создание объекта класса BusinessCard с помощью данного конструктора:
     * BusinessCard businessCard = new BusinessCard("Inokentiy", "Kran");
     * Тут через запятую передается два аргумента name - "Inokentiy" и secondName - "Kran" в той же поседовательности как и в соответствующем конструкторе.
     */
    public BusinessCard(String name, String secondName) {
        this.name = name;
        this.secondName = secondName;
    }

    /**
     * Конструктор класса BusinessCard, в который передаются данные: name, secondName и phone.
     * Последовательность передаваемых данных имеет значение.
     *
     * Создание объекта класса BusinessCard с помощью данного конструктора:
     * BusinessCard businessCard = new BusinessCard("Inokentiy", "Kran", "+38 095 777 77 77");
     * Тут через запятую передается два аргумента name - "Inokentiy", secondName - "Kran", phone - "+38 095 777 77 77"
     * в той же поседовательности как и в соответствующем конструкторе.
     */
    public BusinessCard(String name, String secondName, String phone) {
        this.name = name;
        this.secondName = secondName;
        this.phone = phone;
    }

    /*
     * Создадим сервисные методы, необходимые для сравнения объектов данного класса, а так же вывода в виде строки.
     * Данные методы нужно автоматически генерировать в программе разработке.
     * TODO Заведите за правило всегда генерировать эти методы. Это избавит от множества проблем в будущем.
     */

    /**
     * Сервисный метод для сравнения объектов класса BusinessCard.
     * Сгенерирован втоматически.
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BusinessCard that = (BusinessCard) o;
        return Objects.equals(name, that.name) &&
                Objects.equals(secondName, that.secondName) &&
                Objects.equals(phone, that.phone);
    }

    /**
     * Сервисный метод для получания hash code объектов класса BusinessCard.
     * Сгенерирован втоматически.
     */
    @Override
    public int hashCode() {
        return Objects.hash(name, secondName, phone);
    }

    /**
     * Сервисный метод для выводв в виде сроки объектов класса BusinessCard.
     * Сгенерирован втоматически.
     */
    @Override
    public String toString() {
        return "BusinessCard{" +
                "name='" + name + '\'' +
                ", secondName='" + secondName + '\'' +
                ", phone='" + phone + '\'' +
                '}';
    }

    /**
     * Напишем точку входа в программу в виде метода с именем main.
     *
     * Этот метод всегда имеет вот такую структуру:
     * public static void main(String[] args) {
     * // our code
     * }
     */
    public static void main(String[] args) {

        // Создадим несколько объектов класса BusinessCard, и спользуя разные конструкторы и напечатаем их в консоль.

        // Используем конструктор по умолчанию.
        BusinessCard businessCard = new BusinessCard();
        // Т.к. мы написали метод toString() в нашем классе BusinessCard, то в печать будем выводиться все хорошо.
        // Конкретно в данном случае все данные будут null т.к. мы создали пустой объект, не передавая в него данные.
        System.out.println(businessCard); // BusinessCard{name='null', secondName='null', phone='null'}

        // Используем конструктор с двумя аргументами name и secondName.
        BusinessCard businessCard2 = new BusinessCard("Inokentiy", "Kran");
        // Т.к. мы написали метод toString() в нашем классе BusinessCard, то в печать будем выводиться все хорошо.
        // В данном случае будут заполнены данные name='Inokentiy', secondName='Kran'
        System.out.println(businessCard2); // BusinessCard{name='Inokentiy', secondName='Kran', phone='null'}

        // Используем конструктор с тремя аргументами name, secondName и phone.
        BusinessCard businessCard3 = new BusinessCard("Inokentiy", "Kran", "+38 095 777 77 77");
        // Т.к. мы написали метод toString() в нашем классе BusinessCard, то в печать будем выводиться все хорошо.
        // В данном случае будут заполнены данные name='Inokentiy', secondName='Kran', phone='+38 095 777 77 77'
        System.out.println(businessCard3); // BusinessCard{name='Inokentiy', secondName='Kran', phone='+38 095 777 77 77'}
    }
}
