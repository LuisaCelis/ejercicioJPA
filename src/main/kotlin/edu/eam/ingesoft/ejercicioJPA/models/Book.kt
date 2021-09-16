package edu.eam.ingesoft.ejercicioJPA.models

import java.io.Serializable
import javax.persistence.*

@Entity
@Table(name = "tbl_libros")
data class Book(

    @Id
    @Column(name = "codigo_libro")
    val code:String,

    @Column(name = "isbn_libro")
    val isbn: String,

    @Column(name = "nombre_libro")
    val name:String,

    @ManyToOne
    @JoinColumn(name = "id_editorial")
    val editorial: Publisher,
):Serializable

