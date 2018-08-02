public class CodingHours {
  public static void main(String[] args) {
    int weeks = 17;
    int workdays = 5;
    int averageWeeklyHours = 52;
    int dailyHours = 6;

    int codingHours = weeks * workdays * dailyHours;
    int allHours = weeks * averageWeeklyHours;

    float cHours = codingHours;
    float aHours = allHours;

    System.out.println(codingHours);
    System.out.println(allHours);
    System.out.println(cHours / aHours * 100 + "%");

  }
}
