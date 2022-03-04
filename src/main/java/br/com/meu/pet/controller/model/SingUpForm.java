package br.com.meu.pet.controller.model;

import java.util.Objects;

public class SingUpForm {
    private String name;
    private String password;
    private String confirmPassword;
    private String email;
    private String confirmEmail;

    public SingUpForm(String name, String password, String confirmPassword, String email, String confirmEmail){
        this.name = name;
        this.password = password;
        this.confirmPassword = confirmPassword;
        this.email = email;
        this.confirmEmail = confirmEmail;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getConfirmPassword() {
        return confirmPassword;
    }

    public void setConfirmPassword(String confirmPassword) {
        this.confirmPassword = confirmPassword;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getConfirmEmail() {
        return confirmEmail;
    }

    public void setConfirmEmail(String confirmEmail) {
        this.confirmEmail = confirmEmail;
    }

    public boolean validatePassword(){
        if(this.password.equals(this.confirmPassword)){
            return true;
        } return false;
    }

    public boolean validateEmail(){
        if(this.email.equals(this.confirmEmail)){
            return true;
        } return false;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SingUpForm that = (SingUpForm) o;
        return name.equals(that.name) && password.equals(that.password) && confirmPassword.equals(that.confirmPassword) && email.equals(that.email) && confirmEmail.equals(that.confirmEmail);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, password, confirmPassword, email, confirmEmail);
    }

    @Override
    public String toString() {
        return "SingUpForm{" +
                "name='" + name + '\'' +
                ", password='" + password + '\'' +
                ", confirmPassword='" + confirmPassword + '\'' +
                ", email='" + email + '\'' +
                ", confirmEmail='" + confirmEmail + '\'' +
                '}';
    }
}
