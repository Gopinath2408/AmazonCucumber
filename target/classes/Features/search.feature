Feature: Validating the search options
  @tag2
  Scenario Outline: verify the search with different values
    Given Launch the amazon website
	    When  Search the value "<search>" in search bar
    Then  Check the name and select the first one "<search>"
    Then  Check the title is same as product name "<search>"
    And   Close the browser
    

    Examples: 
      | search  |
      | Watches |
      | Laptop  |
      | Shoes   |
     
     
     
     
     