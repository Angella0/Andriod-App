package com.example.assessment.APIS

import android.telecom.Call
import com.example.assessment.Calculator
import retrofit2.http.GET
import retrofit2.http.Path


interface ApiInterface{
    @GET("posts")
    fun getPosts(): retrofit2.Call<List<Calculator>>

    @GET("posts/{id}")
    fun  getPostById(@Path("id")postId: Int): retrofit2.Call<Calculator>







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