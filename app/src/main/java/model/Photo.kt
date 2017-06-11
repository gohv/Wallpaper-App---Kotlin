package model

import java.io.Serializable

/**
 * Created by gohv on 10.03.17.
 */
data class Photo(val id: String,
                 val likes: Int,
                 val favorites: Int,
                 val tags: String,
                 val previewURL: String,
                 val webformatURL: String) : Serializable