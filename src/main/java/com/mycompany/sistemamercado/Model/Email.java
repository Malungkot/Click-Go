
package com.mycompany.sistemamercado.Model;
import com.mycompany.sistemamercado.Excecoes.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*
 * @aluno: augusto Benedito Carvalho da Silva
 * @matricula: 202265552C
 */

public class Email {
    private static final String EMAIL_REGEX = "^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9]+\\.[a-zA-Z]{2,}$";
    
    private String email;
    
    public Email(String email) throws EmailInvalido
    {
        this.email = email;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    

    public static void validarEmail(String email) throws EmailInvalido, CampoVazio {
        if(email == null || email.trim().isEmpty()){
            throw new CampoVazio();
        }
        Pattern pattern = Pattern.compile(EMAIL_REGEX);
        Matcher matcher = pattern.matcher(email);
        if(!matcher.matches()){
            throw new EmailInvalido();
        }
    }
}