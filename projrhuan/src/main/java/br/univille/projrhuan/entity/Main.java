package br.univille.projrhuan.entity;

public class Main {
    public static void main(String[] args) {
        // Criando instâncias dos atores
        Cliente cliente1 = new Cliente("João Silva", "123.456.789-00", "Rua das Flores, 123");
        Cliente cliente2 = new Cliente("Maria Souza", "987.654.321-99", "Avenida Principal, 456");

        Farmaceutico farmaceutico1 = new Farmaceutico("Ana Paula", "CRF-SP 12345");
        Farmaceutico farmaceutico2 = new Farmaceutico("Carlos Alberto", "CRF-RJ 67890");

        OperadorCaixa operador1 = new OperadorCaixa("Fernanda Lima", "OP001");
        OperadorCaixa operador2 = new OperadorCaixa("Ricardo Gomes", "OP002");

        Administrador admin1 = new Administrador();

        GerenteEstoque gerente1 = new GerenteEstoque("Lucia Oliveira", "GE-001");

        // Realizando as associações
        cliente1.setFarmaceuticoResponsavel(farmaceutico1);
        cliente1.setOperadorDeCaixaResponsavel(operador1);

        cliente2.setFarmaceuticoResponsavel(farmaceutico2);
        cliente2.setOperadorDeCaixaResponsavel(operador2);

        admin1.adicionarOperadorSupervisionado(operador1);
        admin1.adicionarOperadorSupervisionado(operador2);
        admin1.adicionarOperadorSupervisionado(farmaceutico1);
        admin1.adicionarOperadorSupervisionado(farmaceutico2);
        admin1.setGerenteDeEstoqueSupervisionado(gerente1);

        gerente1.setAdministradorResponsavel(admin1);

        System.out.println(cliente1);
        System.out.println(cliente2);
        System.out.println(admin1);
        System.out.println(gerente1);
    }
}
