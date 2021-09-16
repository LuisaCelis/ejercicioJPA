package edu.eam.ingesoft.ejercicioJPA.models

import java.io.Serializable
import javax.persistence.*

@Entity
@Table(name = "tbl_librosAutores")
data class AuthorBook(

    @Id
    @Column(name = "id")
    val id: Long,

    @ManyToOne
    @JoinColumn(name = "id_autor")
    val autor: Author,

    @ManyToOne
    @JoinColumn(name = "id_libro")
    val libro: Book,
):Serializable
