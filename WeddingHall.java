import java.util.Scanner;

public class WeddingHall {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double lenght = Double.parseDouble(scanner.nextLine());
        double width = Double.parseDouble(scanner.nextLine());
        double barSide = Double.parseDouble(scanner.nextLine());

        double roomSize = lenght * width;
        double barSize = barSide * barSide;
        double danceFloor = roomSize * 0.19;
        double freeSpace = roomSize - barSize - danceFloor;

        double guestCount = freeSpace / 3.2;

        System.out.printf("%.0f",Math.ceil(guestCount));
    }
}
