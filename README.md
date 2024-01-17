# Project Name: Orange Hrm 

## Website Url:



Folder Structure: 


Skills & Language:

|Languge/Tools|Version|
|---------|------|
|Java|11|
|Selenium|3.141.59|
|TestNg|6.14.3|
|WebDriverManager||
|Maven|5.5.3|
|ApachePOI|5.2|

## IDE 
> eclipse
> Intellij

## Degine Patter techniques: 
- POM(Page Object Model)
  - Simple POM
  - Selenium PageFactory
# How to find elements in the Web page.
- Xpath - cheat sheet
- 
|Value/attributes|Relative Xpath|
|---------|-------|
|ID 	|//tagname[@id=’value’]|		
|name	|//tagname[@name=’value’]|		
|contains|	//tagname[contains(attribute,’value’)]|		
|And|	//tagname [@attribute1=’value’ and @attribute2=’value2’]	|	
|Or |	//tagname [@attribute1=’value’ or @attribute2=’value2’]		|
|Not| 	//tagname[not(contains(attribute,’value’))]		|
|Child|	//tagname[@attribute=’value’]/childtagname		|
|Parent|	//tagname[@attribute=’value’]/..  or //childtagname[@attribute='value']//parent::parenttagname		|
|Xpath with Attributes|	//tagname[tagname[@attribute=’value’]] or //div[span[@id='a1']]		|
|ancestor|	//span[@id='a1']//ancestor::button or //grandchildtagname[@attribute=’value’]//ancestor::tagname|		
|descendant|	//tagname[@attribue=’value’]// descendant::grandchildname		|
|following|	//p[@value ='value1']//following-sibling::p		|
|preceding|	//p[@value ='value1']//preceding-sibling::p		|



- How to run this project using the Maven cmd 
> mvn clean test
> mvn test
			
			
			
 
 
