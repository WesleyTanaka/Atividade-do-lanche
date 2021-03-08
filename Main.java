Atividade do LANCHE URI 1038

public class URI 1038

public static void main (String[]args) throws IOException {
  Scanner leitor = new Scanner(System.in);
  int codigo = leitor.nextInt();
  int quantidade = leitor.nextInt();
  double total;
  switch (codigo) {
    case 1: total = quantidade * 4.00; break;
    case 2: total = quantidade * 4.50; break;
    case 3: total = quantidade * 5.00; break;
    case 4: total = quantidade * 2.00; break;
    case 5 : total = quantidade * 1.50; break;
    default: total = 0;
  
  Finalizando com:

  System.out.println(String.format("Total: R$ %.2f", total));
}

}
