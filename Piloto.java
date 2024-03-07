import java.util.Random;

public class Piloto {
    
    String nome;
    boolean vilao;

    Random rand = new Random();

    int x = rand.nextInt(10) + 1;

    void soltaSuperPoder()
    {
        switch (x)
        {
            case 1:
                System.out.println(nome +" jogou uma casca de tartaruga vermelha!!!");

                break;

            case 2:
                System.out.println(nome +" jogou uma casca de tartaruga verde!!!");

                break;
            case 3:
                System.out.println(nome +" jogou tres cascas de tartaruga vermelha!!!");

                break;

            case 4:
                System.out.println(nome +" jogou uma banana!!!");

                break;
            case 5:
                System.out.println(nome +" ficou mortal por 30 segundos!!!");

                break;

            case 6:
                System.out.println(nome +" invocou raios em todos os corredores!!!");

                break;
            case 7:
                System.out.println(nome +" começou a voar!!!");

                break;

            case 8:
                System.out.println(nome +" duplicou a sua velocidade!!!");

                break;
            case 9:
                System.out.println(nome +"  arremeçou uma bomba!!!");

                break;

            case 10:
                System.out.println(nome +" ganhou 4 boost de velocidade!!!");

                break;
        }
    }  
}
