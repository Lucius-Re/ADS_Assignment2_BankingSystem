import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class BankRegistry {
    private final LinkedList<BankAccount> accounts = new LinkedList();
    private final Stack<String> history = new Stack();
    private final Queue<String> billQueue = new LinkedList();
    private final Queue<BankAccount> registrationRequests = new LinkedList();
    private final BankAccount[] frozenAccounts = new BankAccount[10];
    private int frozenCount = 0;

    public void requestNewAccount(String id, String name, double initialBalance) {
        this.registrationRequests.add(new BankAccount(id, name, initialBalance));
        System.out.println("Application submitted for: " + name);
    }

    public void approveNextRequest() {
        if (!this.registrationRequests.isEmpty()) {
            BankAccount approved = (BankAccount)this.registrationRequests.poll();
            this.accounts.add(approved);
            this.history.push("Approved account: " + approved.getUsername());
            System.out.println("Admin: Approved " + approved.getUsername());
        } else {
            System.out.println("No pending applications.");
        }

    }

    public void deposit(String name, double amount) {
        BankAccount acc = this.findAccount(name);
        if (acc != null && amount > (double)0.0F) {
            acc.setBalance(acc.getBalance() + amount);
            this.history.push("Deposit " + amount + " to " + name);
            System.out.println("Deposit successful.");
        } else {
            System.out.println("Account not found.");
        }

    }

    public void withdraw(String name, double amount) {
        BankAccount acc = this.findAccount(name);
        if (acc != null && acc.getBalance() >= amount) {
            acc.setBalance(acc.getBalance() - amount);
            this.history.push("Withdraw " + amount + " from " + name);
            System.out.println("Withdrawal successful.");
        } else {
            System.out.println("Insufficient funds or account not found.");
        }

    }

    public void showLastAction() {
        if (!this.history.isEmpty()) {
            System.out.println("Last Action: " + (String)this.history.peek());
        } else {
            System.out.println("History is empty.");
        }

    }

    public void undoLastAction() {
        if (!this.history.isEmpty()) {
            System.out.println("Undone: " + (String)this.history.pop());
        } else {
            System.out.println("Nothing to undo.");
        }

    }

    public void addBillToQueue(String desc) {
        this.billQueue.add(desc);
        System.out.println("Bill added.");
    }

    public void processNextBill() {
        if (!this.billQueue.isEmpty()) {
            String bill = (String)this.billQueue.poll();
            this.history.push("Paid bill: " + bill);
            System.out.println("Processed: " + bill);
        } else {
            System.out.println("No bills.");
        }

    }

    public void showPendingBills() {
        System.out.println("Bills: " + String.valueOf(this.billQueue));
    }

    public void freezeAccount(String name) {
        BankAccount acc = this.findAccount(name);
        if (acc != null && this.frozenCount < this.frozenAccounts.length) {
            this.frozenAccounts[this.frozenCount++] = acc;
            this.accounts.remove(acc);
            this.history.push("Frozen account: " + name);
            System.out.println(name + " moved to Frozen Archive.");
        } else {
            System.out.println("Cannot freeze (Archive full or account not found).");
        }

    }

    public void showFrozenAccounts() {
        System.out.println("--- Frozen Archive ---");

        for(int i = 0; i < this.frozenCount; ++i) {
            System.out.println(i + ". " + this.frozenAccounts[i].getUsername());
        }

    }

    public void displayAll() {
        System.out.println("\n--- Active Accounts ---");

        for(BankAccount acc : this.accounts) {
            System.out.println(acc);
        }

    }

    public BankAccount findAccount(String name) {
        for(BankAccount acc : this.accounts) {
            if (acc.getUsername().equalsIgnoreCase(name)) {
                return acc;
            }
        }

        return null;
    }
}
