package app.model;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.List;

@Entity
public class Recipient {

	@Id
	@GeneratedValue
	@JsonIgnore
	private Long id;

	private Profile basicProfile;
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
