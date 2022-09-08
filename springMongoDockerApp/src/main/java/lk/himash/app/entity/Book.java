package lk.himash.app.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Document("Book")
public class Book {

	@Id
	private String id;
	private String name;
	private String author;
	private String cost;
	
}
