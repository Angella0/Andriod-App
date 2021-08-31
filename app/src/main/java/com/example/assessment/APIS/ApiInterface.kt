package com.example.assessment.APIS

import android.telecom.Call
import com.example.assessment.Calculator


interface ApiInterface{
    @GET("posts")
    fun getCalculator(): Call<List<Calculator>>

    @GET("posts/{add}")
    fun getCalculator(): Call<>


//@GET("posts")
//fun getPosts(): Call<List<Posts>>
//
//@GET("posts/{id}")
//fun  getPostById(@Path("id")postId: Int): Call<Posts>
//
//@GET("posts/{id}/comments")
//fun getComments(@Path("id")postId: Int): Call<List<Comments>>
//


}