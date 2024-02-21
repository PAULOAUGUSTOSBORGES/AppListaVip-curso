package devandroid.pauloa.applistavip.model;

public class Pessoa {

    private String primeiroNome;
    private String sobreNome;
    private String cursoDesejado;
    private String telefoneContato;

    public Pessoa(){

    }

    public void setPrimeiroNome(String primeiroNome) {
        this.primeiroNome = primeiroNome;
    }

    public void setSobreNome(String sobreNome) {
        this.sobreNome = sobreNome;
    }

    public void setCursoDesejado(String cursoDesejado) {
        this.cursoDesejado = cursoDesejado;
    }

    public void setTelefoneContato(String telefoneContato) {
        this.telefoneContato = telefoneContato;
    }

    public String getPrimeiroNome() {
        return primeiroNome;
    }

    public String getSobreNome() {
        return sobreNome;
    }

    public String getCursoDesejado() {
        return cursoDesejado;
    }

    public String getTelefoneContato() {
        return telefoneContato;
    }

    @Override
    public String toString() {  //para escrever os dados do objeto
        return "Pessoa{" +
                "primeiroNome='" + primeiroNome + '\'' +
                ", sobreNome='" + sobreNome + '\'' +
                ", cursoDesejado='" + cursoDesejado + '\'' +
                ", telefoneContato='" + telefoneContato + '\'' +
                '}';
    }
}
