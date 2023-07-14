
public class Principal {
	public static void main(String[] args) {
		Vehiculo veh1 = new Vehiculo();
		Automovil carro1 = new Automovil();
        Motocicleta moto1 = new Motocicleta();
        Vehiculo veh2 = new Vehiculo();
		Automovil carro2 = new Automovil();
        Motocicleta moto2 = new Motocicleta();

        carro1.encendido();
        System.out.println(carro1.estado);
        moto1.apagado();
        System.out.println(moto1.estado);
        veh1.encendido();
        System.out.println(veh1.estado);
        carro2.apagado();
        System.out.println(carro2.estado);
        moto2.apagado();
        System.out.println(moto2.estado);
        veh2.apagado();
        System.out.println(veh2.estado);
	}

}
