## Task1: Scrum sprint backlog and task estimation

The following table demonstrates a prioritised Sprint backlog of tasks, with estimates for each task:

Priority | Backlog  | Owner | Estimate (Hours) | Status
------ | ------ | ------ | ------ | ------
1   | Create a new project repository  | Jouhara Alwardi | .05 | Completed |
2   | Integrating github with eclipse  | Jouhara Alwardi | .07 | Completed |
3   | Generate branches for each task  | Jouhara Alwardi | .1 | Completed |
4   | Identify required functions  | Jouhara Alwardi | .5 | Completed |
5   | Recognizing object relationships | Jouhara Alwardi | 1.0 | Completed |
6   | Creating & writing object classes | Jouhara Alwardi | 4.0 | Completed |
7   | Creating & writing  main Classes | Jouhara Alwardi | 6.0 | Completed |
8   | Building unit tests | Jouhara Alwardi | 3.0  | Completed |
9   | Code-review checklist | Jouhara Alwardi | .4  | Completed |

 &nbsp;

 **Choosing Estimates:** The previous estimates demonstrate the amount of time required to complete all my tasks fully. I've minimised the required time to accomplish easier tasks because it would give me more time to focus on other complex tasks in the sprint backlog. Also, prioritising complex tasks with longer estimates helps me focus on solving the problem to the core, minimise duplicated code in my system and find any small error mistakes. I've also decided to estimate in hours because:

 1. Estimating in hours is feasible because it contains fewer items, which means it won’t take as long
 2. Can be performed by one person
 3. It's an abstract measure with many strengths


 **The reasoning behind the estimates (Comparison):** The above estimates  represent a relative value to the degree of effort required to complete each task listed in the previous sprint backlog. Tasks such as "Creating & writing object classes" will take longer hours as they require complex technical solutions with possible risks of technical errors, due to the complexity of the relationships between each object in the project. On the contrary, Tasks such as "Integrating github with eclipse" require shorter estimates, as risk and uncertainty factors are less likely to occur. Consequently, shorter estimates provide additional extra time to:

 1. Refractor the code 
 2. Add extra validations to the system
 3. Go back to the sprint backlog to make sure all tasks are fully completed


  **Velocity Metric:** Velocity is the key metric in Scrum, measures the required amount of work a team can tackle during a sprint. At the end of each sprint, velocity is calculated by totaling the points for all fully completed user stories. For example, if we have 5 user stories with a total of 25 points, by the end of the iterations only two are completed, with a total of 10 points. Such calculations will be saved and reviewed in the beginning of the next sprint. Sprint planning event is usually scheduled on the first day of a new sprint, the event starts by reviewing calculations and tasks from the previous sprint.


 &nbsp;

 ## Task2: Unit testing and Test-Driven development

To create the Rubric project I have followed the three phases of a test driven development:

**First Phase: Create precise tests:** To validate the functionalities of certain features i have created two main unit tests:

1. ObjectTesting: to test the functionality of an object class used to store a list of different types of rubrics (Different names) with one criterion (list of criterion object that hold a criterion name) and a list student grades (A student object with a list of grades). The variations I added for the criterion are :

     * Maximum of 10 criterions
     * Student grades must match criterions
     * If criterions list is empty return false and an error message
     * If Rubric name is empty return false and an error message
     * If StudentGrade is empty return false and an error message

In the ObjectTesting class you can see three main tests within a test method: A test for student name, a test for a particular grade and a test for a certain criterion.    

2. RubricTesting: I have tested calculations for both the Rubric and its criterion. The tests support the following calculations:
     * Average, Maximum score, Minimum score and standard deviation of a particular criterion in a rubric.
     * Average, Maximum score, Minimum score and standard deviation of a rubric.

 The following Link is an example of one of my commits: [link to My Commit](https://github.com/JouharaAlwardi/SQA_CA2/commit/6e2566bec9b7f9c231a173ddd0bf92189bc1bdc8)  

 I have tested all the unit test files and they all compile successfully. In some cases, i have failed a few tests but went back and fixed the issues, now they all execute successfully.

**second Phase:  Correcting the Code:** I have been runing the code to test all methods related to the objects, hence the validation methods mentioned earlier.  I have also been correcting the calculations by running the tests with different values in each test. 

**Third Phase:  Refactor the Code:** I have succesfully removed duplicated code especially by adding additional arrays to store values to loop through these arrays to help execute any necessary task in the project.


From the previous commit you can see the development of my code and how I have implemented these three phases while working on the project. Following the three phases while implementing the necessary  unit tests will help improve the quality of any code. I hope to implement this Unit testing and Test-Driven development approach in any of my future projects to help make my code cleaner and easier to read by other developers.


 &nbsp;

 ## Task3: Test coverage metric

 The coverage tool I used is a built in Java code coverage too in Eclipse called EclEmma alongside JUniut 5 Library.

 1. How to run the tool: 
    * Make sure the tool is installed by going to help > Eclipse Marketplace and search EclEmma.
    * Right click on the test file and choose coverage and run as Junit test.

 1. Running the tool on eclipse:
    * Before adding the test methods to test calculations such as maximum score, average .. etc. The image showcases a screenshot of the tool running on my project (You can see open gaps in the test coverage):

    ![before](https://github.com/JouharaAlwardi/SQA_CA2/blob/test-coverage-metric/images/before.PNG "before")


    * After adding the test methods to test calculations such as maximum score, average .. etc. The image showcases a screenshot of the tool running on my project (You can see closing gaps in the test coverage compared to the previous screenshots):


    ![after](https://github.com/JouharaAlwardi/SQA_CA2/blob/test-coverage-metric/images/after.PNG "after")

 2. Executing ObjectTesting and RubricTest:

    ![test1](https://github.com/JouharaAlwardi/SQA_CA2/blob/test-coverage-metric/images/test1.png "test1")
    ![test2](https://github.com/JouharaAlwardi/SQA_CA2/blob/test-coverage-metric/images/test2.png "test2")


**Interpret the results from test coverage tools:** The green covarge are the lines of covered by the unit tests. For Example, if it shows 50% of the bar covered in green, that means that a half of all the lines of code that you I isn’t covered by testing. The red bar, represnets the lines of code not covered by the unit tests in the prpoject. Testing the coverage of the code helps any developer prevent defects at early stages of project development. Also, notifies the developer to add extra test cases to increase coverage.







