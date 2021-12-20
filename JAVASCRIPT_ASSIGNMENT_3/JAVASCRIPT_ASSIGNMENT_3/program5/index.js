const person = {
    firstName : "Samba",
    lastName : "Erala",
    greeting : function(){
        alert('Hi! I\m ' + this.firstName + this.middleName + this.lastName + '.');
    }
};

document.write(person.firstName + " ");
person.middleName = "siva";
document.write(person.middleName + "  ");
document.write(person.lastName);
console.log(person.greeting());