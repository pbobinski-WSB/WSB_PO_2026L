# Importujemy klasy z naszego pliku banking.py
from banking import Account, Customer

def test_bank_account():
    print("=== TestBankAccount ===")
    
    # Tworzenie obiektu (bez słowa kluczowego 'new')
    account = Account(100.50)
    print(account)
    
    account.withdraw(300)
    account.deposit(-50)
    print(account)
    
    account.withdraw(120)
    account.deposit(50)
    print(account)


def test_banking():
    print("\n=== TestBanking ===")
    
    # W Pythonie nie musimy deklarować zmiennych (np. Customer klient = null;) przed ich użyciem.
    
    klient = Customer("Simms", "Jane")
    account = Account(500)
    klient.set_account(account)
    print(klient)

    klient = Customer("Bryant", "Owen")
    account = Account(200)
    klient.set_account(account)
    print(klient)


# Odpowiednik public static void main(String[] args) w Javie
if __name__ == "__main__":
    test_bank_account()
    test_banking()