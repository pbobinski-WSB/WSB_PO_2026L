from szpital import Hospital

def test_hospital():
    # Odpowiednik: Hospital hospital = new Hospital();
    hospital = Hospital()
    
    # Odpowiednik: System.out.println(hospital);
    # W Javie bez metody toString() wypisze np. wsb.merito.po.szpital.Hospital@15db9742
    # W Pythonie bez metody __str__() wypisze np. <szpital.Hospital object at 0x000001>
    print(hospital)

if __name__ == "__main__":
    test_hospital()