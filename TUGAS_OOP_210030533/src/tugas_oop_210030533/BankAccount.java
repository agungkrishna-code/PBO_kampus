package tugas_oop_210030533;

public class BankAccount {
    String accountID, namaPemilik;
    int saldo;

    public  void deposit(int nominal) {
        saldo += nominal;
        System.out.println("Deposit Rp." + nominal + " berhasil ditambahkan ke akun " + namaPemilik);
    }
    public  void withdraw(int nominal) {
        if (saldo > nominal) {
            saldo -= nominal;
            System.out.println("Withdraw Rp." + nominal + " berhasil ditarik dari akun " + namaPemilik);
        }
        else {
            System.out.println("maaf saldo anda tidak mencukupi");
        }
    }
    public  void cekSaldo() {
        System.out.println("Hello " + namaPemilik + " sisa saldo anda : Rp." + saldo);
    }
}
