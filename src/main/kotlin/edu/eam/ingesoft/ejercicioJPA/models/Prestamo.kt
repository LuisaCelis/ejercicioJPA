package edu.eam.ingesoft.ejercicioJPA.models

import java.io.Serializable
import java.util.*
import javax.persistence.*

@Entity
@Table (name = "tbl_prestamos")
data class Prestamo(

    @Id
    @Column(name = "id")
    val id:Long,

    @Column(name = "fecha_prestamo")
    val dateTime: Date,

    @ManyToOne
    @JoinColumn(name = "id_libro")
    val libro: Book,

    @ManyToOne
    @JoinColumn(name = "id_usuario")
    val usuario: User,

):Serializable
