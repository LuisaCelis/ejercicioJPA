package edu.eam.ingesoft.ejercicioJPA.models

import java.io.Serializable
import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.Id
import javax.persistence.Table


@Entity
@Table(name="tbl_editoriales")
data class Publisher(

    @Id
    @Column (name="codigo_editorial")
    val code: Long,

    @Column (name="nombre_editorial")
    val name: String

):Serializable

