package guru.springframework.spring5webapp.domain;

import javax.persistence.*;

/**
 * Created by hl on 12/22/19.
 */
@Entity
public class Publisher {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;

	private String name;
	private Address address;

	public Publisher() {
	}

	public Publisher(String name, Address address) {
		this.name = name;
		this.address = address;

	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return "Publisher{" + "id=" + id + ", name='" + name + '}';
	}

	@Override
	public boolean equals(Object o) {
		if (this == o)
			return true;
		if (o == null || getClass() != o.getClass())
			return false;

		Publisher publisher = (Publisher) o;

		return id != null ? id.equals(publisher.id) : publisher.id == null;
	}

	@Override
	public int hashCode() {
		return id != null ? id.hashCode() : 0;
	}

}
