Feature: Asserting the titile and product page
@tag1 
Scenario:verify the title and product page of Amazon.
Given Open the browser and launch the website.
Then  Check the Url and Title is correct.
When  user click on the Todays deal.
Then  Get the title and check whether it is Todays Deals.
When  User click on the first item of Todays Deals.
Then  Check the producr name.
And   Go back to the Deals page and click on the second item.
Then  Check the second product is also present.
 

 