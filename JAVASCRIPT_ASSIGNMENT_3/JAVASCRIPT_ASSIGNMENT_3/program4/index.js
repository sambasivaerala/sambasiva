const person = {
    firstName : "Sambasiva",
    lastName : "Erala",
    greeting : function(){
        alert('Hi! I\m ' + this.firstName + ' ' + this.lastName + '.');
    }
};

document.write(person.firstName + " ");
document.write(person.lastName + " ");
console.log(person.greeting());