public class Kart {




    String nome;
    Piloto piloto;
    Motor motor;

    public Kart(Piloto piloto){

        motor = new Motor();
        this.piloto = piloto;

    }

    

    void pular()
    {
        if (piloto.x == 7)
        {
            System.out.println(nome + " Começa a voar!!!");

        }
        else{

        System.out.println(nome + " Salta!");

        }

    }

    void soltarTurbo()
    {

        if (piloto.x == 10)
        {
            System.out.println(nome + " solta o turbo 5 vezes!!!");

        }
        else{

        System.out.println(nome + " solta o turbo!");
        
        }

    }

    void fazerDrift()
    {

        System.out.println(nome + " faz o DRIIIIFT!!! KATCHAW");

    }
    
}
