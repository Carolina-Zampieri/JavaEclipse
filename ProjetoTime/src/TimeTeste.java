
public class TimeTeste {
	public static void main(String[] args) {
		
		Time t = new Time(0, 5, 3);
		System.out.println(t.exibirHoraUniversal());
		System.out.println(t.exibirHoraPadrao());
		
		t.setTime(8,25);
		System.out.println(t.exibirHoraUniversal());
		System.out.println(t.exibirHoraPadrao());
		
		t.setTime(13,35,46);
		System.out.println(t.exibirHoraUniversal());
		System.out.println(t.exibirHoraPadrao());
		
		t.setTime(12,10,8);
		System.out.println(t.exibirHoraUniversal());
		System.out.println(t.exibirHoraPadrao());
	}
}
