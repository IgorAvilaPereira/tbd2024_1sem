package br.edu.ifrs.minicurso.springsolidapi.model;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;


@Entity
@Table(name = "endereco")
@Getter
@Setter
@ToString
@NoArgsConstructor
public class Endereco {

    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(length = 100)
    private String bairro;


    @Column(length = 100)
    private String rua;


    @Column(length = 100)
    private String complemento;



    @Column(length = 100)
    private String nro;




    @Column(length = 100)
    private String cep;

}
