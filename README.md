#Code Refactoring

Welcome to my small code refactoring example.

####Featuring code and instructions from Martin Fowler - Refactoring: Improving the Design of Existing Code

To understand this repository you have to look at the commits. The comments briefly describe the changes made in order to improve the code quality.

In the [screenshot directory] you can see screens of Sonar comparing metrics to the previous analysis (the first screenshot shows the initial state compared to the second analysis).
[screenshot directory]: https://github.com/Th3Tw0/code-refactoring/tree/master/code-refactoring/screenshots

##Three Bad Smells
- realising different subtypes through conditional logic. Solution: [Replace Type Code with State/Strategy]
- complex methods (violating agains Single responsibility principle. Solution: [Extract Method]
- methods using data of a different class. Solution: [Move Method]

Please find the solutions in Mr. Fowlers catalog on http://refactoring.com/catalog/
[Replace Type Code with State/Strategy]: http://refactoring.com/catalog/replaceTypeCodeWithStateStrategy.html
[Extract Method]: http://refactoring.com/catalog/extractMethod.html
[Move Method]: http://refactoring.com/catalog/moveMethod.html

##Conclusion:

While the code is now much easier to understand, many metrics (like LoC, number of classes, etc.) grew over time. It doesn't have a negative impact on how I would grade the code's maintainability and readability.
Is the code now beautifull? Nope it's not, there are still some flaws, like Java 1.1? 1.2? (I don't know for sure) while loops or inconsistent modifiers.

<b>TL;DR: To put it in a nutshell: the code is now readable.</b>
