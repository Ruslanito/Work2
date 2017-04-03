

/**
 * Created by Ruslanito on 24.02.2017.
 */
public class Srting_Summ {
	public static void main(String[] args) {
		String s1 = "Р СџР ВµРЎР‚Р Р†Р В°РЎРЏ РЎРѓРЎвЂљРЎР‚Р С•Р С”Р В° ";
		String s2 = "Р вЂ™РЎвЂљР С•РЎР‚Р В°РЎРЏ РЎРѓРЎвЂљРЎР‚Р С•Р С”Р В° ";
		String s3 = s1 + s2;
		System.out.println("Р пїЅРЎвЂљР С•Р С–Р С•Р Р†Р В°РЎРЏ РЎРѓРЎвЂљРЎР‚Р С•Р С”Р В° Р С‘Р С�Р ВµР ВµРЎвЂљ Р Р†Р С‘Р Т‘: " + s3);

		System.out.println("StringBuffer ()");
		StringBuffer s = new StringBuffer();
		s.append("Hello ");
		s.append("World!");
		String s4 = s.toString();
		System.out.println("StringBuffer () " + s4);

		System.out.println("concat()");
		String s5 = "Р СџР ВµРЎР‚Р Р†Р В°РЎРЏ РЎРѓРЎвЂљРЎР‚Р С•Р С”Р В° ";
		String s6 = s5.concat("Р вЂ™РЎвЂљР С•РЎР‚Р В°РЎРЏ РЎРѓРЎвЂљРЎР‚Р С•Р С”Р В°");
		System.out.println("concat() " + s6);
		System.out.println(s5.concat("Р вЂ™РЎвЂљР С•РЎР‚Р В°РЎРЏ РЎРѓРЎвЂљРЎР‚Р С•Р С”Р В°"));
	}

}
