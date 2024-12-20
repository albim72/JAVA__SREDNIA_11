public class Pojazd implements IPojazd,IComment {
    @Override
    public double spalanie100(double odl, double litry) {
        return litry*100/odl;
    }

    @Override
    public double kosztyPrzejazdu(double odl, double litry, double cenal) {
        return litry*cenal+odl*0.01;
    }

    @Override
    public String info(String msg) {
        return "Bardzo ważna wiadmośc: " + msg;
    }
}
