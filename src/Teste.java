public class Teste {
    public static void main(String[] args) {
        ContaCorrente cc = new ContaCorrente("333222111", 1000, 0.1);
        ContaCorrente cc1 = new ContaCorrente("111222333", 3000, 0.1);

        System.out.println(cc.getSaldo());
        System.out.println(cc1.getSaldo());

        cc.transferir(100, cc1);
        System.out.println(cc.getSaldo());
        System.out.println(cc1.getSaldo());

        cc.DadosConta();
        cc1.DadosConta();
    }
}
