package app.model;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import java.util.List;

@Entity
public class Recipient {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@JsonIgnore
	private Long id;

	@OneToOne(cascade = CascadeType.ALL)
	private Profile basicProfile;
	@OneToMany(cascade = CascadeType.ALL)
	private List<Address> addresses;

	public Profile getBasicProfile() {
		return basicProfile;
	}

	public void setBasicProfile(Profile basicProfile) {
		this.basicProfile = basicProfile;
	}

	public List<Address> getAddresses() {
		return addresses;
	}

	public void setAddresses(List<Address> addresses) {
		this.addresses = addresses;
	}
}
