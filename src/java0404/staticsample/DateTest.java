package java0404.staticsample;

public class DateTest {
    public static void main(String[] args) {
        String currentDate = DateUtil.getCurrentDate();
        System.out.println(currentDate);
        String currentMonth= DateUtil.getCurrentMonth();
        System.out.println(currentMonth);
        String currentMonth2= DateUtil.getCurrentDate("2023.04.11");
        System.out.println(currentMonth2);
    }
}
