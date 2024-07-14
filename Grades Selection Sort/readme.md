# grades-selection-sort

I want to sort student names with their respective grade (from A to F), and by using a selection sort, I will print them out in a descending order. Throughout the program, I made sure that the student names and their respective grade are paired together so it doesn't get seperated while the program is running. 

Next after the selection sort, I converted number grades into letter grades by using an if-else statement. 

90+ = A
80+ = B
70+ = C
60+ = D
59- = F

After I have convereted them into letter grades, I used a HashMap in order to count how many grades there are per letter; starting with the count being at 0. 

gradeCount.put("A",0);

I did this for all the letter grades and then, I printed the count from A to F.

As a result, the program will print out student names and their respective grades from A to F, and then it will print out how many people scored that grade.
(ABCDF) = (32221)
