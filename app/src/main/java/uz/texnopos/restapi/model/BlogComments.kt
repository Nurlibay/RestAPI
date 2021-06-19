package uz.texnopos.restapi.model

data class BlogComments(
    var id: Int,
    var creationTimeSeconds: Int,
    var commentatorHandle: Int,
    var locale: Int,
    var text: Int,
    var rating: Int
)