import java.util.Scanner;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        System.out.println("名前を入力してください");
        String playerName = scanner.nextLine();
        int playerWin = 0;
        int cpuWin = 0;
        System.out.println("=== 3回勝負じゃんけんゲーム ===");
        for (int round = 1; round <= 3; round++) {
            System.out.println();
            System.out.println("【" + round + "回戦】");
            System.out.println("1: グー");
            System.out.println("2: チョキ");
            System.out.println("3: パー");
            System.out.print("数字を入力してください：");
            int playerHand = scanner.nextInt();
            int cpuHand = random.nextInt(3) + 1;
            System.out.println(playerName + "：" + playerHand);
            System.out.println("CPU：" + cpuHand);
            if (playerHand == cpuHand) {
    System.out.println("あいこ！");
    
} else if (
    (playerHand == 1 && cpuHand == 2) ||
    (playerHand == 2 && cpuHand == 3) ||
    (playerHand == 3 && cpuHand == 1)
) {

    System.out.println("勝ち！");
    playerWin++;

} else {

    System.out.println("負け！");
    cpuWin++;
}
System.out.println();
System.out.println("結果発表！");
System.out.println(playerName + "：" + playerWin + "勝");
System.out.println("CPU：" + cpuWin + "勝");
if (playerWin > cpuWin) {

    System.out.println(playerName + "が勝ったよ！");

} else if (cpuWin > playerWin) {

    System.out.println("CPUが勝っちゃった！");

} else {

    System.out.println("引き分け！");
}
        }
    }
}