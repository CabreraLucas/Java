public class Exemplo {

    public static void main(String[] args) {
        Pessoa pes = new Pessoa();
        pes.setNome("Lucas Cabrera");

        PessoaFisica pf = new PessoaFisica();
        pf.setNome("Jesuita");
        pf.setCpf("123.123.123-12");

        System.out.println("Olá!!");
        System.out.println(pf.getNome());
        System.out.println(pf.getCpf());
    }
}
