Given a person's allergy score, determine whether or not they're allergic to a given item, and their full list of allergies.<br/>
An allergy test produces a single numeric score which contains the information about all the allergies the person has (that they were tested for).<br/>
The list of items (and their value) that were tested are:<br/>
eggs (1)<br/>
peanuts (2)<br/>
shellfish (4)<br/>
strawberries (8)<br/>
tomatoes (16)<br/>
chocolate (32)<br/>
pollen (64)<br/>
cats (128)<br/>
So if Tom is allergic to peanuts and chocolate, he gets a score of 34.<br/>
Now, given just that score of 34, your program should be able to say:<br/>
1)Whether Tom is allergic to any one of those allergens listed above.<br/>
2)All the allergens Tom is allergic to.
Note: a given score may include allergens not listed above (i.e. allergens that score 256, 512, 1024, etc.). <br/>Your program should ignore those components of the score. For example, if the allergy score is 257, your program should only report the eggs (1) allergy.
