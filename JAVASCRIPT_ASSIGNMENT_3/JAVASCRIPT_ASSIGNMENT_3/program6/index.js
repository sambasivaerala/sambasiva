var str = '({"firstName":"Sambasiva","lastName":"Erala"})';
var obj = eval(str);
document.write("String Is Converted Into Object Using Eval() : ")
document.write(obj.firstName + " "); 
document.write(obj.lastName);