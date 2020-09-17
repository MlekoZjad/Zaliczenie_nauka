public class Skarbonka {
    
	
	private int liczbaPieniedzy;
	
	public Skarbonka(int wkladPoczatkowy) {
		liczbaPieniedzy = wkladPoczatkowy;
					
	}
	
	public void wplac(int kwota) {
		liczbaPieniedzy+= kwota;
	}
	
	public void wyplac(int kwota) throws Exception {
		if (kwota > liczbaPieniedzy) {
			throw new Exception("Kwota przewyzza stan posiadania");
		}
		liczbaPieniedzy -= kwota;
		
	}
	public int podajStanOszczednosci() {
		return liczbaPieniedzy;
	}
	
	
}

