package com.example.recylerviewsearchbar.retrofit;

import com.example.recylerviewsearchbar.Contact;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface ContactsApi {


    @GET("contacts.json")
    Call<List<Contact>> getContacts();
}
