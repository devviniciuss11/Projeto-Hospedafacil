public class Hospedes {
    public String nome;
    public String DataDeNascimento;
    private String cpf;
    public String email;
    public String genero;

    public String getNome() {
        return nome;
    }
    public void setNome(String nome){
        this.nome = nome;
    }

    private String getCpf() {
        return cpf;
    }

    private void setCpf(String cpf){
        this.cpf = cpf;
    }
    public String getDataDeNascimento(){
        return DataDeNascimento;
    }
    public void setDataDeNascimento(String DataDeNascimento){
        this.DataDeNascimento = DataDeNascimento;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getGenero() {
        return genero;
    }
    public void setGenero(String genero) {
        this.genero = genero;
    }

}


