package br.com.meu.pet.controller.model;

import java.time.LocalDate;
import java.util.Objects;

public class PetRegisterForm {
    private String name;
    private String especie;
    private String raca;
    private String sexo;
    private Double peso;
    private LocalDate dataDeNascimento;

    public PetRegisterForm(String name, String especie, String raca, String sexo, Double peso, LocalDate dataDeNascimento) {
        this.name = name;
        this.especie = especie;
        this.raca = raca;
        this.sexo = sexo;
        this.peso = peso;
        this.dataDeNascimento = dataDeNascimento;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public String getRaca() {
        return raca;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public Double getPeso() {
        return peso;
    }

    public void setPeso(Double peso) {
        this.peso = peso;
    }

    public LocalDate getDataDeNascimento() {
        return dataDeNascimento;
    }

    public void setDataDeNascimento(LocalDate dataDeNascimento) {
        this.dataDeNascimento = dataDeNascimento;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PetRegisterForm that = (PetRegisterForm) o;
        return name.equals(that.name) && especie.equals(that.especie) && raca.equals(that.raca) && sexo.equals(that.sexo) && peso.equals(that.peso) && dataDeNascimento.equals(that.dataDeNascimento);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, especie, raca, sexo, peso, dataDeNascimento);
    }

    @Override
    public String toString() {
        return "PetRegisterForm{" +
                "name='" + name + '\'' +
                ", especie='" + especie + '\'' +
                ", raca='" + raca + '\'' +
                ", sexo='" + sexo + '\'' +
                ", peso=" + peso +
                ", dataDeNascimento=" + dataDeNascimento +
                '}';
    }
}
