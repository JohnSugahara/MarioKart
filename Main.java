public class Main {
    public static void main(String[] args) throws Exception {
        
        Piloto piloto = new Piloto();
        Piloto piloto2 = new Piloto();

        Kart kart = new Kart(piloto);
        Kart kart2 = new Kart(piloto2);

        kart.nome = "Relampago";
        kart2.nome = "Greatskull";

        kart.motor.cilindradas = "100";
        kart2.motor.cilindradas = "150";

        kart.motor.velocidadeMaxima = 90.50F;
        kart2.motor.velocidadeMaxima = 140.50F;

        piloto.nome = "Marquinhos";
        piloto2.nome = "Bowser";
        
        piloto.vilao = false;
        piloto2.vilao = true;

        kart.piloto = piloto;
        kart2.piloto = piloto2;

    
        piloto.soltaSuperPoder();
        piloto2.soltaSuperPoder();

        kart.fazerDrift();
        kart.motor.mostraInfo();

        kart2.soltarTurbo();
        kart2.motor.mostraInfo();








    }
}
