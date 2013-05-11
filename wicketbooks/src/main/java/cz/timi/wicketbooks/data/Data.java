package cz.timi.wicketbooks.data;

import java.io.Serializable;
import java.util.List;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "data")
public class Data implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private String id;
	private List<Book> books;

	@XmlAttribute(name = "version")
	public String getId() {
		return id;
	}

	@XmlElementWrapper(name = "books")
	@XmlElement(name = "book")
	public List<Book> getBooks() {
		return books;
	}

	public void setId(String id) {
		this.id = id;
	}

	public void setBooks(List<Book> books) {
		this.books = books;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((books == null) ? 0 : books.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
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
		Data other = (Data) obj;
		if (books == null) {
			if (other.books != null) {
				return false;
			}
		} else if (!books.equals(other.books)) {
			return false;
		}
		if (id == null) {
			if (other.id != null) {
				return false;
			}
		} else if (!id.equals(other.id)) {
			return false;
		}
		return true;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Data [id=");
		builder.append(id);
		builder.append(", books=");
		builder.append(books);
		builder.append("]");
		return builder.toString();
	}

}