package com.mtw.alejandro.booksqueryapp.api

object BooksModel {
    data class BooksApiResponse (var totalItems:Int,
                                 var items:List<BookItem>)
    data class BookItem (var id:String,
                         var volumeInfo:BookVolumeInfo)
    data class BookVolumeInfo (var title:String,
                               var authors:List<String>,
                               var publishedDate:String,
                               var imageLinks:BookImage)
    data class BookImage(var smallThumbnail:String,
                         var thumbnail:String)
}