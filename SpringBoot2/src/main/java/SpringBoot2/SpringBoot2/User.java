package SpringBoot2.SpringBoot2;

public class User {
    private String nome;
    private String saluto;
    private String provincia;
    public User(String nome, String provincia, String saluto) {
        this.nome = nome;
        this.saluto = saluto;
        this.provincia = provincia;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSaluto() {
        return saluto;
    }

    public void setSaluto(String saluto) {
        this.saluto = saluto;
    }

    public String getProvincia() {
        return provincia;
    }

    public void setProvincia(String provincia) {
        this.provincia = provincia;
    }
}
