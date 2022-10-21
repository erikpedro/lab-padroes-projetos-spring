package com.github.erikpedro.lab.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.HashMap;
import java.util.Map;

/**
 * The type Address.
 */
@Entity
public class Address {
    @Id
    private String cep;
    private String logradouro;
    private String complemento;
    private String bairro;
    private String localidade;
    private String uf;
    private String ibge;
    private String gia;
    private String ddd;
    private String siafi;



    /**
     * Gets cep.
     *
     * @return the cep
     */
    public String getCep() {
        return cep;
    }

    /**
     * Sets cep.
     *
     * @param cep the cep
     */
    public void setCep(String cep) {
        this.cep = cep;
    }

    /**
     * Gets logradouro.
     *
     * @return the logradouro
     */
    public String getLogradouro() {
        return logradouro;
    }

    /**
     * Sets logradouro.
     *
     * @param logradouro the logradouro
     */
    public void setLogradouro(String logradouro) {
        this.logradouro = logradouro;
    }

    /**
     * Gets complemento.
     *
     * @return the complemento
     */
    public String getComplemento() {
        return complemento;
    }

    /**
     * Sets complemento.
     *
     * @param complemento the complemento
     */
    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }

    /**
     * Gets bairro.
     *
     * @return the bairro
     */
    public String getBairro() {
        return bairro;
    }

    /**
     * Sets bairro.
     *
     * @param bairro the bairro
     */
    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    /**
     * Gets localidade.
     *
     * @return the localidade
     */
    public String getLocalidade() {
        return localidade;
    }

    /**
     * Sets localidade.
     *
     * @param localidade the localidade
     */
    public void setLocalidade(String localidade) {
        this.localidade = localidade;
    }

    /**
     * Gets uf.
     *
     * @return the uf
     */
    public String getUf() {
        return uf;
    }

    /**
     * Sets uf.
     *
     * @param uf the uf
     */
    public void setUf(String uf) {
        this.uf = uf;
    }

    /**
     * Gets ibge.
     *
     * @return the ibge
     */
    public String getIbge() {
        return ibge;
    }

    /**
     * Sets ibge.
     *
     * @param ibge the ibge
     */
    public void setIbge(String ibge) {
        this.ibge = ibge;
    }

    /**
     * Gets gia.
     *
     * @return the gia
     */
    public String getGia() {
        return gia;
    }

    /**
     * Sets gia.
     *
     * @param gia the gia
     */
    public void setGia(String gia) {
        this.gia = gia;
    }

    /**
     * Gets ddd.
     *
     * @return the ddd
     */
    public String getDdd() {
        return ddd;
    }

    /**
     * Sets ddd.
     *
     * @param ddd the ddd
     */
    public void setDdd(String ddd) {
        this.ddd = ddd;
    }

    /**
     * Gets siafi.
     *
     * @return the siafi
     */
    public String getSiafi() {
        return siafi;
    }

    /**
     * Sets siafi.
     *
     * @param siafi the siafi
     */
    public void setSiafi(String siafi) {
        this.siafi = siafi;
    }


}
