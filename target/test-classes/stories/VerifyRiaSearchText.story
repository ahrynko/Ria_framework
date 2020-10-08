Meta:

Narrative:
As a user
I want to perform an action
So that I can achieve a business goal

Scenario: Verify user is able to see the  text of the search technique

Given user opened site by url: 'https://www.ria.com/'
When search for next text: 'Xiomi Redmi'
Then following search text in input is displayed: 'Xiomi Redmi'
And following search query text is displayed: 'Пошуковий запит: "Xiomi Redmi"'
And products are contains by the specified text: 'Xiomi Redmi'