package com.example.recylerviewsearchbar;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/*
Hello BAlu
I am BAD
900..
8888112232
*/

public class Contact {

@SerializedName("name")
@Expose
private String name;
@SerializedName("image")
@Expose
private String image;
@SerializedName("phone")
@Expose
private String phone;

public String getName() {
return name;
}

public void setName(String name) {
    //Hello
this.name = name;
}

public String getImage() {
return image;
}

public void setImage(String image) {
this.image = image;
}

public String getPhone() {
return phone;
}

public void setPhone(String phone) {
this.phone = phone;
  //hhowww
}

}
