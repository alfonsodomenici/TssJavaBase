/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lezione7;

import lezione6.ordinamento.*;
import java.util.Date;
import java.util.Objects;

/**
 *
 * @author tss
 */
public class Persona implements Comparable<Persona> {

    protected String nome, cognome;
    protected Date dataNascita;
    protected String sesso;

    public Persona(String nome, String cognome) {
        this(nome, cognome, null, null);
    }

    public Persona(String nome, String cognome, Date dataNascita, String sesso) {
        this.nome = nome;
        this.cognome = cognome;
        this.dataNascita = dataNascita;
        this.sesso = sesso;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCognome() {
        return cognome;
    }

    public void setCognome(String cognome) {
        this.cognome = cognome;
    }

    public Date getDataNascita() {
        return dataNascita;
    }

    public void setDataNascita(Date dataNascita) {
        this.dataNascita = dataNascita;
    }

    public String getSesso() {
        return sesso;
    }

    public void setSesso(String sesso) {
        if (!sesso.equals("F") || !sesso.equals("M")) {
            //gestire errore
            return;
        }
        this.sesso = sesso;
    }

    @Override
    public String toString() {

        return nome + "," + cognome;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 11 * hash + Objects.hashCode(this.nome);
        hash = 11 * hash + Objects.hashCode(this.cognome);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Persona other = (Persona) obj;
        if (!Objects.equals(this.nome, other.nome)) {
            return false;
        }
        if (!Objects.equals(this.cognome, other.cognome)) {
            return false;
        }
        return true;
    }

    @Override
    public int compareTo(Persona o) {
        return this.cognome.compareTo(o.getCognome());
    }

    
    

}
