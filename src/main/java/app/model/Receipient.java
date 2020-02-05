package app.model;

import java.util.List;

public class Receipient {
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
