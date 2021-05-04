/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utp.is553.Entidades;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author Sebastian
 */
@Entity
@Table(name = "CLIENTE")
public class Cliente implements Serializable{
    
    @Id
    @Column(name = "Usuario", unique = true)
    private Integer usuario;
    
    @Column(name = "Clave")
    private Integer clave;
    
    @Column(name = "Saldo")
    private Long saldo;
    
    public Cliente(){
        
    }

    public Cliente(Integer usuario, Integer clave, Long saldo) {
        this.usuario = usuario;
        this.clave = clave;
        this.saldo = saldo;
    }

    public Integer getUsuario() {
        return usuario;
    }

    public void setUsuario(Integer usuario) {
        this.usuario = usuario;
    }

    public Integer getClave() {
        return clave;
    }

    public void setClave(Integer clave) {
        this.clave = clave;
    }

    public Long getSaldo() {
        return saldo;
    }

    public void setSaldo(Long saldo) {
        this.saldo = saldo;
    }

    @Override
    public String toString() {
        return "Cliente{" 
                + ", usuario=" + usuario 
                + ", clave=" + clave 
                + ", saldo=" + saldo 
                + '}';
    }
    
    
    
}
