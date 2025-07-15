package quick.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity @Table(name= "Restaurants")
public class Restaurants {

@Column
Long id;

@Column
String name;

@Column @Id
String email;

@Column
String cuisine;

@Column
Double rating;

@Column
String image;

public Long getId() {
	return id;
}

public void setId(Long id) {
	this.id = id;
}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public String getCuisine() {
	return cuisine;
}

public void setCuisine(String cuisine) {
	this.cuisine = cuisine;
}

public Double getRating() {
	return rating;
}

public void setRating(Double rating) {
	this.rating = rating;
}

public String getImage() {
	return image;
}

public void setImage(String image) {
	this.image = image;
}

@Override
public String toString() {
	return "Restaurants [id=" + id + ", name=" + name + ", cuisine=" + cuisine + ", rating=" + rating + ", image="
			+ image + "]";
}




}
