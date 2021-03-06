package edu.eam.ingesoft.ejercicioJPA.models

import java.io.Serializable
import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.Id
import javax.persistence.Table

@Entity
@Table(name="tbl_usuarios")
data class User(

    @Id
    @Column(name = "user_identification")
    val identification: String,

    @Column(name = "apellido_usuario")
    val lastName:String,

    @Column(name = "nombre_usuario")
    val name: String

):Serializable

