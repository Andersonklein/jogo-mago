package game;

public class Poder {
private String nome;
public Poder(String nome) {
this.nome = nome;
}

public void usar() {
System.out.println(nome + " Agora você esta turbinado!! Siga seu caminho ");
}

public String getNome() {
return nome;
}
}

