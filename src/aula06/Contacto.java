package aula06;

public class Contacto {
    Pessoa pessoa;
    int id;
    String telemovel;
    String email;
    private static int idCount = 1;

    public Contacto(Pessoa pessoa, String telemovel, String email) {
        if (validTelemovel(telemovel) == false) {
            throw new IllegalArgumentException("numero de telemovel invalido");
        }
        if (validEmail(email) == false) {
            throw new IllegalArgumentException("email invalido");
        }

        this.telemovel = telemovel;
        this.email = email;
        this.id = idCount++;
        this.pessoa = pessoa;


    }

    public boolean validTelemovel(String telemovel) {
        char characterAtIdx0 = telemovel.charAt(0);

        if (telemovel.length() > 9 || characterAtIdx0 != '9' || telemovel == null ) {
            return false;
        }
        else {
            return true;
        }
    }

    private boolean validEmail(String email) {
        return email.matches("^[a-zA-Z0-9_! #$%&'*+/=?`{|}~^. -]+@[a-zA-Z0-9. -]+$");
    }

    public int getId() {
        return id;
    }

    public String getEmail() {
        return email;
    }

    public String getTelemovel() {
        return telemovel;
    }

    public Pessoa getPessoa () {
        return pessoa;
    }

    public void setEmail (String email) {
        if (validEmail(email) == false) {
            throw new IllegalArgumentException("email invalido");
        }

        this.email = email;
    }

    public void setTelemovel (String telemovel) {
        if (validTelemovel(telemovel) == false) {
            throw new IllegalArgumentException("numero de telemovel invalido");
        }

        this.telemovel = telemovel;
    }

    public String toString() {
        return String.format("nome: %s; numero de telemovel: %s; email: %s; id: %d",
        this.pessoa.getNome(),
        this.telemovel,
        this.email,
        this.id);
    }

}
