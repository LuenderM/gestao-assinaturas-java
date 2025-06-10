class Cliente {

    private String nome;
    private String cpf;
    private String nascimento;

    public Cliente(String nome, String cpf, String nascimento) {
        this.nome = nome;
        this.cpf = cpf;
        this.nascimento = nascimento;
    }

    public String getDados() {
        return nome + " | CPF: " + cpf + " | Nascimento: " + nascimento;
    }

}
