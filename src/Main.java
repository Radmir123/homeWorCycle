public class Main {
    public static void main(String[] args) {
        // Задание 1
        int number = 0;
        while (number < 10) {
            number++;
            System.out.println(number);
        }
        for (int i = 10; i > 0; i--) {

            System.out.println(i);
        }
        //Задание 2
        var dayOfReport = 5;
        while (dayOfReport  < 31) {
            System.out.println("Сегодня пятница, " + dayOfReport + "-e число. Необходимо подготовить отчет.");
            dayOfReport = dayOfReport  + 7;
        }
        //Задача 3
        int beginYearOfFlight = 1817;
        int endYearOfFlight = 2054;
        int f = 79;
       while (beginYearOfFlight < endYearOfFlight){
            beginYearOfFlight = beginYearOfFlight + f;
            System.out.println(beginYearOfFlight);
        }
    }
}