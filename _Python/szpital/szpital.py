class Doctor:
    """Klasa reprezentująca lekarza (celowo pusta, przygotowana do rozwoju)."""
    
    def __init__(self):
        # W Javie pola są domyślnie inicjalizowane (null, 0, 0.0). 
        # W Pythonie robimy to jawnie w konstruktorze.
        self.__name: str = None
        self.__age: int = 0
        self.__specialization: str = None
        self.__monthly_salary: float = 0.0


class Patient:
    """Klasa reprezentująca pacjenta."""
    
    def __init__(self):
        self.__name: str = None
        self.__age: int = 0
        self.__medical_history: str = None


class Hospital:
    """Klasa reprezentująca szpital."""
    
    def __init__(self):
        self.__name: str = None
        self.__location: str = None
        self.__doctor: 'Doctor' = None   # String 'Doctor' (tzw. forward reference) w razie gdyby klasa nie była jeszcze wczytana
        self.__patient: 'Patient' = None