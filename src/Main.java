import java.util.*;

public class Main {

    public static void main(String[] args) {
        String novoNome = null, novocodigoISO = null;
        double novopopulacao = 0, novodimensao = 0;
        boolean rodar = true;
        int tamanhoPaisesVizinhos;
        List<Pais> paises = new ArrayList<Pais>();
        Pais paisInicial = new Pais(null, null, 0, 0);
        Pais novoPais = new Pais(novoNome, novocodigoISO, novopopulacao, novodimensao );
        paises.add(paisInicial);


        while (rodar == true){
            Scanner scan = new Scanner(System.in);
            System.out.println("------------------------MENU-----------------------");
            System.out.println("DIGITE 1 - para adicionar novo pais");
            System.out.println("DIGITE 2 - para adicionar paises vizinhos a um pais");
            System.out.println("DIGITE 3 - para listar os paises  ");
            System.out.println("DIGITE 4 - para consultar os vizinhos de seu pais");
            System.out.println("DIGITE 5 - para saber de quem seu pais e vizinho");
            System.out.println("DIGITE 6 - para mostrar Densidade");
            System.out.println("DIGITE 7 - para sair");
            int menu = scan.nextInt();

           switch (menu){
               case 1:
                   System.out.println("Digite o nome do pais");
                   novoNome = scan.next();
                   System.out.println("Digite o codigo ISO ");
                   novocodigoISO = scan.next();
                   System.out.println("Digite o valor referente a população");
                   novopopulacao = scan.nextDouble();
                   System.out.println("Digite o valor referente a dimensao");
                   novodimensao = scan.nextDouble();
                   paisInicial = new Pais(novoNome, novocodigoISO, novopopulacao, novodimensao);
                   paises.add(paisInicial);
                   break;
               case 2:
                   System.out.println("PARA QUAL PAIS DESEJA ADICIONAR VIZINHO?");
                   for(int i = 1; i < paises.size(); i++){
                       System.out.println("Pais " +i   +" " +paises.get(i).getNome());
                   }
                   int escolherPais = scan.nextInt();
                   paises.get(escolherPais).incluirPaisVizinho();


                   break;
               case 3:
                   for(int i = 1; i < paises.size(); i++){
                       System.out.println(paises.get(i).getNome());
                    }
                   break;
               case 4:

                   for(int i = 1; i < paises.size(); i++){

                       System.out.println("Pais " +i   +" " +paises.get(i).getNome());
                   }
                   System.out.println("De qual pais deseja saber vizinho? Digite o numero");
                   tamanhoPaisesVizinhos = scan.nextInt();

                   System.out.println("Paises vizinhos de " +paises.get(tamanhoPaisesVizinhos).getNome());
                  paises.get(tamanhoPaisesVizinhos).saberVizinhos();

                   break;
               case 5:
                   System.out.println("Confira se seu pais é vizinho de outro ja inserido, insira o nome do pais");
                   for(int i = 1; i < paises.size(); i++){
                       System.out.println("Pais " +i   +" " +paises.get(i).getNome());
                   }
                   String paisEscolhido = scan.next();
                   for(int i = 0; i < paises.size(); i++){
                       tamanhoPaisesVizinhos = paises.get(i).getPaisesVizinhos().size();
                       for (int j = 0 ; j < tamanhoPaisesVizinhos ; j++ ) {
                           String nome1 = paises.get(i).getPaisesVizinhos().get(j).getNome();
                           if (nome1.equals(paisEscolhido) ) {
                               System.out.println(paises.get(i).getNome());
                           }else{

                           }
                       }
                   }
                   break;
               case 6:
                   System.out.println("De qual pais deseja ver a densidade?");
                   for(int i = 1; i < paises.size(); i++){
                       System.out.println("Pais " +i   +" " +paises.get(i).getNome());
                   }
                   int buscarDensidade = scan.nextInt();
                   paises.get(buscarDensidade).buscarDensidade();
                   break;
               case 7:
                   rodar = false;
                   break;

            }

        }


    }
}
