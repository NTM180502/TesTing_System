import java.util.Scanner;

public class Exarcise05 {
    void question05(){
        Scanner scanner = new Scanner(System.in);

        Account account = new Account();
        System.out.println("Mời bạn nhập thông tin vào acconut");

        System.out.println("nhập vào id");
        account.id = scanner.nextInt();

        scanner.nextLine();
        System.out.println("nhập vào email");
        account.email = scanner.nextLine();

        System.out.println("nhập vào username");
        account.username = scanner.nextLine();

        System.out.println("nhập vào fullname");
        account.fullName = scanner.nextLine();


        Position position = new Position();
        System.out.println("Nhập vào position id");
        position.id = scanner.nextInt();
        System.out.println("Chọn position");
        System.out.println("1. DEV");
        System.out.println("2. TEST");
        System.out.println("3. SCRUM MASTER");
        System.out.println("4. PM");
        int menu = scanner.nextInt();
        if (menu == 1) {
            position.name = PositionName.Dev;
        } else if (menu == 2) {
            position.name = PositionName.Test;
        } else if (menu == 3) {
            position.name = PositionName.Scrum_Master;
        } else if (menu == 4) {
            position.name = PositionName.PM;
        }
        account.position = position;

        System.out.println("account id: " + account.id);
        System.out.println("account username: " + account.username);
        System.out.println("account position: " + account.position.name);



    }
}
