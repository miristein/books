package cz.timi.wicketbooks.data;

import java.io.Serializable;
import java.util.List;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;

public class Book implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private String title;
	private String author;
	private Integer numberOfPages;
	private Integer realeseYear;
	private Integer rating;
	private String image;
	private String origin;
	private String description;
	private List<Category> categories;

	@XmlElement(name = "title")
	public String getTitle() {
		return title;
	}

	@XmlElement(name = "author")
	public String getAuthor() {
		return author;
	}

	@XmlElement(name = "numberOfPages")
	public Integer getNumberOfPages() {
		return numberOfPages;
	}

	@XmlElement(name = "releaseDate")
	public Integer getRealeseYear() {
		return realeseYear;
	}

	@XmlElement(name = "rating")
	public Integer getRating() {
		return rating;
	}

	@XmlElement(name = "image")
	public String getImage() {
		return image;
	}

	@XmlElement(name = "origin")
	public String getOrigin() {
		return origin;
	}
	
	@XmlElement(name = "description")
	public String getDescription() {
		return description;
	}

	@XmlElementWrapper(name = "categories")
	@XmlElement(name = "category", type = Category.class)
	public List<Category> getCategories() {
		return categories;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public void setNumberOfPages(Integer numberOfPages) {
		this.numberOfPages = numberOfPages;
	}

	public void setRealeseYear(Integer realeseYear) {
		this.realeseYear = realeseYear;
	}

	public void setRating(Integer rating) {
		this.rating = rating;
	}

	public void setImage(String image) {
		this.image = image;
	}

	public void setOrigin(String origin) {
		this.origin = origin;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public void setCategories(List<Category> categories) {
		this.categories = categories;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((author == null) ? 0 : author.hashCode());
		result = prime * result + ((categories == null) ? 0 : categories.hashCode());
		result = prime * result + ((description == null) ? 0 : description.hashCode());
		result = prime * result + ((image == null) ? 0 : image.hashCode());
		result = prime * result + ((numberOfPages == null) ? 0 : numberOfPages.hashCode());
		result = prime * result + ((origin == null) ? 0 : origin.hashCode());
		result = prime * result + ((rating == null) ? 0 : rating.hashCode());
		result = prime * result + ((realeseYear == null) ? 0 : realeseYear.hashCode());
		result = prime * result + ((title == null) ? 0 : title.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (getClass() != obj.getClass()) {
			return false;
		}
		Book other = (Book) obj;
		if (author == null) {
			if (other.author != null) {
				return false;
			}
		} else if (!author.equals(other.author)) {
			return false;
		}
		if (categories == null) {
			if (other.categories != null) {
				return false;
			}
		} else if (!categories.equals(other.categories)) {
			return false;
		}
		if (description == null) {
			if (other.description != null) {
				return false;
			}
		} else if (!description.equals(other.description)) {
			return false;
		}
		if (image == null) {
			if (other.image != null) {
				return false;
			}
		} else if (!image.equals(other.image)) {
			return false;
		}
		if (numberOfPages == null) {
			if (other.numberOfPages != null) {
				return false;
			}
		} else if (!numberOfPages.equals(other.numberOfPages)) {
			return false;
		}
		if (origin == null) {
			if (other.origin != null) {
				return false;
			}
		} else if (!origin.equals(other.origin)) {
			return false;
		}
		if (rating == null) {
			if (other.rating != null) {
				return false;
			}
		} else if (!rating.equals(other.rating)) {
			return false;
		}
		if (realeseYear == null) {
			if (other.realeseYear != null) {
				return false;
			}
		} else if (!realeseYear.equals(other.realeseYear)) {
			return false;
		}
		if (title == null) {
			if (other.title != null) {
				return false;
			}
		} else if (!title.equals(other.title)) {
			return false;
		}
		return true;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Book [title=");
		builder.append(title);
		builder.append(", author=");
		builder.append(author);
		builder.append(", numberOfPages=");
		builder.append(numberOfPages);
		builder.append(", realeseYear=");
		builder.append(realeseYear);
		builder.append(", rating=");
		builder.append(rating);
		builder.append(", image=");
		builder.append(image);
		builder.append(", origin=");
		builder.append(origin);
		builder.append(", description=");
		builder.append(description);
		builder.append(", categories=");
		builder.append(categories);
		builder.append("]");
		return builder.toString();
	}

}
