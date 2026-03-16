class Account:
    """Klasa reprezentująca konto bankowe."""

    # W Pythonie nie ma przeciążania konstruktorów tak jak w Javie.
    # Używamy domyślnych wartości argumentów (balance: float = 0.0).
    def __init__(self, balance: float = 0.0):
        # Podwójne podkreślenie (__) symuluje modyfikator 'private' z Javy (tzw. name mangling)
        self.__balance = balance

    def deposit(self, amount: float) -> None:
        """Wpłaca pieniądze na konto."""
        self.__balance += amount

    def withdraw(self, amount: float) -> None:
        """Wypłaca pieniądze z konta."""
        self.__balance -= amount

    def get_balance(self) -> float:
        """Pobiera aktualne saldo."""
        return self.__balance

    # Odpowiednik metody toString() z Javy
    def __str__(self) -> str:
        return f"Wartość konta = {self.__balance}"


class Customer:
    """Klasa reprezentująca klienta banku."""

    def __init__(self, first_name: str, last_name: str):
        # Python nie ma słowa kluczowego 'final', więc po prostu nie robimy setterów.
        self.__first_name = first_name
        self.__last_name = last_name
        self.__account: Account = None  # Odpowiednik Account account = null;

    def set_account(self, account: Account) -> None:
        self.__account = account

    def get_account(self) -> Account:
        return self.__account

    def get_first_name(self) -> str:
        return self.__first_name

    def get_last_name(self) -> str:
        return self.__last_name

    def __str__(self) -> str:
        # F-stringi to nowoczesny i czytelny sposób łączenia stringów w Pythonie
        return (f"Customer{{firstName='{self.__first_name}', "
                f"lastName='{self.__last_name}', "
                f"account={self.__account}}}")