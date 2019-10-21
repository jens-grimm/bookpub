package entity;

@Entity
public class Book {
	@Id
	@GeneratedValue
	private Long id;
	private String isbn;
	private String title;
	private String description;
	
	@ManyToOne
	private Author author;
	@ManyToOne
	private Publisher publisher;
	
	@ManyToMany
	private list<Reviewers> reviewers;
	
	protected Book() {}

}
