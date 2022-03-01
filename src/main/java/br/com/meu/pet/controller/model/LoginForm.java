package br.com.meu.pet.controller.model;

import java.util.Objects;

public class LoginForm {
    private String name;
    private String password;

    public LoginForm(String name, String password) {
        this.name = name;
        this.password = password;
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        LoginForm loginForm = (LoginForm) o;
        return name.equals(loginForm.name) && password.equals(loginForm.password);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, password);
    }

    @Override
    public String toString() {
        return "FormLogin{" +
                "name='" + name + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
