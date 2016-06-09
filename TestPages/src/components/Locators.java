package components;

public enum Locators {
	
	SEARCH_FIELD("lst-ib");
	
	private String value;

    private Locators (String value) {

        this.value = value;
    }

    public String getValue() {
        return this.value;
    }


}
	


