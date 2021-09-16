package edu.eam.ingesoft.ejercicioJPA.models

import java.io.Serializable
import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.Id
import javax.persistence.Table

@Entity
@Table(name="tbl_autores")
data class Author(

    @Id
    @Column (name = "codigo_autor")
    val id:Long,

    @Column(name="apellido")
    val lastName: String,

    @Column(name = "nombre")
    val name : String

):Serializable
