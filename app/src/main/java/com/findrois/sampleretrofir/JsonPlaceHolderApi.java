package com.findrois.sampleretrofir;



import java.util.List;
import java.util.Map;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.Field;
import retrofit2.http.FieldMap;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.OPTIONS;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Path;

public interface JsonPlaceHolderApi {

    @GET("posts")
    Call<List<Post>> getPosts();

//    @GET("posts/{id}/comments")
//    Call<List<Comment>> getComments(@Path("id") int postId);


//    @PUT("gists/{id}")
//    Call<ResponseBody> updateGist(@Path("id") String id, @Body Gist gist);

    @GET("posts/2/comments")
    Call<List<Comment>> getComments();

    @GET("posts/{id}/comments")
    Call<List<Comment>> getComments(@Path("id") int postID);


    @GET("posts/{id}/{comments}")
    Call<List<Comment>> getComments(@Path("id") int postID,
                                    @Path("comments") String comments);

    @POST("posts")
    Call<Post> createPost(@Body Post post);

    @FormUrlEncoded
    @POST("posts")
    Call<Post> createPost(
            @Field("userId") int userId,
            @Field("title") String title,
            @Field("body") String text
    );

    @FormUrlEncoded
    @POST("posts")
    Call<Post> createPost(@FieldMap Map<String, String> fields);

//    @GET("posts/{id}")
//    Call<List<Comment>> getComment(@Path("id") int postId);

}
