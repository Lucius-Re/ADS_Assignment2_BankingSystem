//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        BankRegistry registry = new BankRegistry();
        Scanner sc = new Scanner(System.in);

        while(true) {
            System.out.println("\n1.Apply 2.Approve 3.Deposit 4.Withdraw 5.Undo 6.Bills 7.Freeze 8.Show 0.Exit");
            System.out.print("Choice: ");
            int choice = sc.nextInt();
            sc.nextLine();
            if (choice == 0) {
                sc.close();
                return;
            }

            switch (choice) {
                case 1:
                    System.out.print("Name: ");
                    String n = sc.nextLine();
                    registry.requestNewAccount("ID" + (int)(Math.random() * (double)100.0F), n, (double)1000.0F);
                    break;
                case 2:
                    registry.approveNextRequest();
                    break;
                case 3:
                    System.out.print("Name: ");
                    String dn = sc.nextLine();
                    registry.deposit(dn, (double)500.0F);
                    break;
                case 4:
                    System.out.print("Name: ");
                    String wn = sc.nextLine();
                    registry.withdraw(wn, (double)200.0F);
                    break;
                case 5:
                    registry.undoLastAction();
                    break;
                case 6:
                    System.out.println("1.Add 2.Process");
                    if (sc.nextInt() == 1) {
                        sc.nextLine();
                        registry.addBillToQueue(sc.nextLine());
                    } else {
                        registry.processNextBill();
                    }
                    break;
                case 7:
                    System.out.print("Name: ");
                    registry.freezeAccount(sc.nextLine());
                    break;
                case 8:
                    registry.displayAll();
                    break;
                default:
                    System.out.println("Error.");
            }
        }
    }
}
