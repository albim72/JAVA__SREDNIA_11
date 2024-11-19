//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        double litry =  46.45;
        double cn = 6.39;
        double odl = 512.7;

        Pojazd p = new Pojazd();
        System.out.printf("spalanie [l/100km]: %.3f\n",p.spalanie100(odl,litry));
        System.out.printf("koszty przejazdu na trasie %.2f km: %.2f zł\n",
                odl,p.kosztyPrzejazdu(odl,litry,cn));
        System.out.println(p.info("wystawa ABC"));

        IComment pz = new Pojazd();
//        System.out.printf("spalanie [l/100km]: %.3f\n",pz.spalanie100(odl,litry));
//        System.out.printf("koszty przejazdu na trasie %.2f km: %.2f zł\n",
//                odl,p.kosztyPrzejazdu(odl,litry,cn));
        System.out.println(pz.info("wystawa ABC"));

        IPojazd pk = new Pojazd();
        System.out.printf("spalanie [l/100km]: %.3f\n",pk.spalanie100(odl,litry));
        System.out.printf("koszty przejazdu na trasie %.2f km: %.2f zł\n",
                odl,pk.kosztyPrzejazdu(odl,litry,cn));
//        System.out.println(pk.info("wystawa ABC"));

    }
}
