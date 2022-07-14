import java.util.*;

public class Main {

    public static void main(String[] args) {
        String novoNome = null, novocodigoISO = null;
        double novopopulacao = 0, novodimensao = 0;
        Map<String,String> vizinhos = new HashMap<String,String>();
        List<Pais> paises = new ArrayList<Pais>();
        boolean rodar = true;
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

                   paisInicial.setNome(novoNome);
                   paisInicial.setCodigoISO(novocodigoISO);
                   paisInicial.setPopulacao(novopopulacao);
                   paisInicial.setDimensao(novodimensao);


                   paises.add(paisInicial);


                   break;
               case 2:
                   paisInicial.incluirPaisVizinho();

                   //vizinhos.put(paisInicial.getNome(),paisInicial.paisesVizinhos.get((paisInicial.paisesVizinhos.size())-1).getNome());

                   break;
               case 3:
                   for(int i = 1; i < paises.size(); i++){
                       System.out.println(paises.get(i).getNome());
                    }
                   break;
               case 4:
                   for(int i = 1; i < paises.size(); i++){
                       System.out.println("Pais " +i  +paises.get(i).getNome());
                   }
                   System.out.println("Digite o nome do pais que deseja ver os vizinhos");
                   int escolha = scan.nextInt();
                   System.out.println("Paises vizinhos de " +paises.get(escolha).getNome());
                   for(int i = 0; i < paisInicial.getPaisesVizinhos().size(); i++){
                       System.out.println(paisInicial.getPaisesVizinhos().get(i).getNome());
                   }

                   break;
               case 5:
                   System.out.println("L");
                   String pais1 = scan.next();
                   System.out.println(vizinhos.get(pais1));
                   break;
            }

        }


    }
}
